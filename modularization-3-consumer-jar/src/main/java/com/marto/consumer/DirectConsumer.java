package com.marto.consumer;

import com.marto.sorting.algorithm.BubbleSort;
import java.util.List;
import java.util.logging.Logger;

public class DirectConsumer {
  private static Logger logger = Logger.getLogger(MySortingConsumer.class.getName());

  public static void main(String[] args) {
    BubbleSort util = new BubbleSort();
    List<String> sorted = util.sort(List.of("Ranga", "Ravi", "Sathish", "Adam", "Eve"));
    logger.info(sorted.toString());
  }
}
