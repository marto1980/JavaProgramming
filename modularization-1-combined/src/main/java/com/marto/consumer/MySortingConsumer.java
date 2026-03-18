package com.marto.consumer;

import com.marto.sorting.util.MySortingUtil;
import java.util.List;
import java.util.logging.Logger;

public class MySortingConsumer {
  private static Logger logger = Logger.getLogger(MySortingConsumer.class.getName());

  public static void main(String[] args) {
    MySortingUtil util = new MySortingUtil();
    List<String> sorted = util.sort(List.of("Ranga", "Ravi", "Sathish", "Adam", "Eve"));
    logger.info(sorted.toString());
  }
}
