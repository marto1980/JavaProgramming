package com.marto.aktien2025;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ShareTest {

    private BigDecimal bd(String val) {
        return new BigDecimal(val);
    }

    private List<BigDecimal> bdList(String... vals) {
        return java.util.Arrays.stream(vals).map(BigDecimal::new).toList();
    }

    private void assertBigDecimalListEquals(List<BigDecimal> expected, List<BigDecimal> actual) {
        assertEquals(expected.size(), actual.size(), "Lists differ in size");
        for (int i = 0; i < expected.size(); i++) {
            assertEquals(0, expected.get(i).compareTo(actual.get(i)), 
                "Element at index " + i + " differs: expected " + expected.get(i) + " but got " + actual.get(i));
        }
    }

    @Test
    public void testStandardTruncationAndAdjustment() {
        List<BigDecimal> nominals = bdList("10.0", "20.0", "30.0");
        List<BigDecimal> marketValues = bdList("100.0", "200.0", "300.0");
        BigDecimal units = bd("25.0");

        Share share = new Share(nominals, marketValues, units);

        // Limit index is 1 (20.0), because 10.0 + 20.0 = 30.0 > 25.0
        // Truncated lists only contain elements strictly before the limit index
        assertBigDecimalListEquals(bdList("10.0"), share.getNominalsTruncated());
        assertBigDecimalListEquals(bdList("100.0"), share.getMarketValuesTruncated());

        // The remaining 15.0 units are taken from the limit index nominal (20.0)
        // Market value is adjusted proportionally: 200.0 * (15.0 / 20.0) = 150.0
        assertBigDecimalListEquals(bdList("10.0", "15.0"), share.getNominalsAdjusted());
        assertBigDecimalListEquals(bdList("100.0", "150.0"), share.getMarketValuesAdjusted());
    }

    @Test
    public void testFractionalAdjustment() {
        List<BigDecimal> nominals = bdList("10.5", "20.5", "30.0");
        List<BigDecimal> marketValues = bdList("100.0", "200.5", "300.0");
        BigDecimal units = bd("25.3");

        Share share = new Share(nominals, marketValues, units);

        // Limit index is 1 (20.5), sum is 31.0 > 25.3
        assertBigDecimalListEquals(bdList("10.5"), share.getNominalsTruncated());
        assertBigDecimalListEquals(bdList("100.0"), share.getMarketValuesTruncated());

        // Last nominal = 25.3 - 10.5 = 14.8
        // Adjusted market value = 200.5 * 14.8 / 20.5 = 144.7512195122 (rounded HALF_UP to 10 decimals)
        assertBigDecimalListEquals(bdList("10.5", "14.8"), share.getNominalsAdjusted());
        assertBigDecimalListEquals(bdList("100.0", "144.7512195122"), share.getMarketValuesAdjusted());
    }

    @Test
    public void testExactMatchBeforeEnd() {
        List<BigDecimal> nominals = bdList("10.0", "20.0", "30.0");
        List<BigDecimal> marketValues = bdList("100.0", "200.0", "300.0");
        BigDecimal units = bd("30.0");

        Share share = new Share(nominals, marketValues, units);

        // Limit index is 2 (30.0), because 10 + 20 + 30 = 60 > 30
        assertBigDecimalListEquals(bdList("10.0", "20.0"), share.getNominalsTruncated());
        assertBigDecimalListEquals(bdList("100.0", "200.0"), share.getMarketValuesTruncated());

        // The remaining units to reach 30.0 is 0.0 from the last nominal
        // Market value is adjusted proportionally: 300.0 * (0.0 / 30.0) = 0.0
        assertBigDecimalListEquals(bdList("10.0", "20.0", "0.0"), share.getNominalsAdjusted());
        assertBigDecimalListEquals(bdList("100.0", "200.0", "0.0"), share.getMarketValuesAdjusted());
    }

    @Test
    public void testSumNeverExceedsThrowsException() {
        List<BigDecimal> nominals = bdList("10.0", "20.0");
        List<BigDecimal> marketValues = bdList("100.0", "200.0");
        BigDecimal units = bd("50.0");

        assertThrows(IllegalArgumentException.class, () -> {
            new Share(nominals, marketValues, units);
        }, "Sum of nominals never exceeds units.");
    }

    @Test
    public void testExactMatchAtEndThrowsException() {
        // According to the logic, if the sum never *exceeds* the units, it throws.
        // Therefore, exactly hitting the sum at the very last element will throw.
        List<BigDecimal> nominals = bdList("10.0", "20.0");
        List<BigDecimal> marketValues = bdList("100.0", "200.0");
        BigDecimal units = bd("30.0");

        assertThrows(IllegalArgumentException.class, () -> {
            new Share(nominals, marketValues, units);
        }, "Sum of nominals never exceeds units.");
    }

    @Test
    public void testMarketValuesTooShortThrowsException() {
        List<BigDecimal> nominals = bdList("10.0", "20.0", "30.0");
        List<BigDecimal> marketValues = bdList("100.0"); // Too short, fails when accessing index 1
        BigDecimal units = bd("25.0"); // Limit index will be 1

        assertThrows(IllegalArgumentException.class, () -> {
            new Share(nominals, marketValues, units);
        });
    }
}