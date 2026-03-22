package com.marto.aktien2025;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.stream.Stream;

public class Share {
  private static final BigDecimal lvEuro = new BigDecimal("1.95583");

  private final String name;
  private final List<BigDecimal> nominals;
  private final List<BigDecimal> marketValues;
  private final BigDecimal units;
  private final List<BigDecimal> nominalsTruncated;
  private final List<BigDecimal> marketValuesTruncated;
  private final List<BigDecimal> nominalsAdjusted;
  private final List<BigDecimal> marketValuesAdjusted;

  private static int findLimitIndex(
      List<BigDecimal> nominals, List<BigDecimal> marketValues, BigDecimal units) {
    record Accumulator(BigDecimal sum, int index) {}
    Accumulator limitAcc =
        nominals.stream()
            .reduce(
                new Accumulator(BigDecimal.ZERO, -1),
                (acc, nominal) ->
                    acc.sum().compareTo(units) >= 0
                        ? acc
                        : new Accumulator(acc.sum().add(nominal), acc.index() + 1),
                (acc1, acc2) -> {
                  throw new UnsupportedOperationException("Parallel streams not supported");
                });

    if (limitAcc.sum().compareTo(units) < 0) {
      throw new IllegalArgumentException(
          String.format("Sum of nominals %f never reaches or exceeds units.", limitAcc.sum()));
    }

    int limitIndex = limitAcc.index();

    if (limitIndex >= marketValues.size()) {
      throw new IllegalArgumentException(
          "Market values list is too short: is misses the required limit index.");
    }

    return limitIndex;
  }

  public Share(
      String name, List<BigDecimal> nominals, List<BigDecimal> marketValues, BigDecimal units) {
    this.name = name;
    this.nominals = List.copyOf(nominals);
    this.marketValues = List.copyOf(marketValues);
    this.units = units;

    int limitIndex = findLimitIndex(nominals, marketValues, units);
    this.nominalsTruncated = this.nominals.subList(0, limitIndex);
    this.marketValuesTruncated = this.marketValues.subList(0, limitIndex);

    BigDecimal sumNominalsTruncated =
        this.nominalsTruncated.stream().reduce(BigDecimal.ZERO, (sum, value) -> sum.add(value));
    BigDecimal lastNominal = units.subtract(sumNominalsTruncated);
    BigDecimal lastMarketValue =
        marketValues
            .get(limitIndex)
            .multiply(lastNominal)
            .divide(nominals.get(limitIndex), 10, RoundingMode.HALF_UP);

    this.nominalsAdjusted =
        Stream.concat(this.nominalsTruncated.stream(), Stream.of(lastNominal)).toList();

    this.marketValuesAdjusted =
        Stream.concat(this.marketValuesTruncated.stream(), Stream.of(lastMarketValue)).toList();
  }

  public List<BigDecimal> getNominals() {
    return nominals;
  }

  public List<BigDecimal> getMarketValues() {
    return marketValues;
  }

  public BigDecimal getUnits() {
    return units;
  }

  @Override
  public String toString() {
    return "Share [units="
        + units
        + ", nominalsTruncated="
        + nominalsTruncated
        + ", marketValuesTruncated="
        + marketValuesTruncated
        + ", nominalsAdjusted="
        + nominalsAdjusted
        + ", marketValuesAdjusted="
        + marketValuesAdjusted
        + "]";
  }

  public List<BigDecimal> getNominalsTruncated() {
    return nominalsTruncated;
  }

  public List<BigDecimal> getMarketValuesTruncated() {
    return marketValuesTruncated;
  }

  public List<BigDecimal> getNominalsAdjusted() {
    return nominalsAdjusted;
  }

  public List<BigDecimal> getMarketValuesAdjusted() {
    return marketValuesAdjusted;
  }

  private BigDecimal getTotalAcquisitionCost() {
    return this.marketValuesAdjusted.stream()
        .reduce(BigDecimal.ZERO, (sum, value) -> sum.add(value));
  }

  public void printTotalAcquisionCost() {
    BigDecimal total = getTotalAcquisitionCost();
    BigDecimal totalLv = total.multiply(lvEuro);
    System.out.printf(
        "\n%s: Total Acquisition Cost: %s € = %s lv\n\n",
        name, total.setScale(2, RoundingMode.HALF_UP), totalLv.setScale(2, RoundingMode.HALF_UP));
  }
}
