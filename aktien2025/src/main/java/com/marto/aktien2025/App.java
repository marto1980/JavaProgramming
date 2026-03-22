package com.marto.aktien2025;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class App {

  private static BigDecimal bd(String val) {
    return new BigDecimal(val);
  }

  public static void main(String[] args) {
    ArrayList<BigDecimal> pictetNominals =
        new ArrayList<>(
            List.of(
                bd("0.230"),
                bd("0.291"),
                bd("0.217"),
                bd("0.231"),
                bd("0.266"),
                bd("0.272"),
                bd("0.259"),
                bd("0.273"),
                bd("0.27"),
                bd("0.273"),
                bd("0.268"),
                bd("0.283"),
                bd(".281"),
                bd(".278")));
    List<BigDecimal> pictetMarketValues =
        new ArrayList<>(
            List.of(
                bd("149.98"),
                bd("110.57"),
                bd("149.78"),
                bd("149.72"),
                bd("149.55"),
                bd("149.66"),
                bd("149.96"),
                bd("149.62"),
                bd("149.71"),
                bd("170.63"),
                bd("149.63"),
                bd("180.80"),
                bd("149.73"),
                bd("149.58"),
                bd("149.91"),
                bd("100.72"),
                bd("51.81")));

    BigDecimal pictetUnits = new BigDecimal("3.107");

    Share pictet = new Share("PICTET-WATER", pictetNominals, pictetMarketValues, pictetUnits);
    System.out.println(pictet);
    pictet.printTotalAcquisionCost();
  }
}
