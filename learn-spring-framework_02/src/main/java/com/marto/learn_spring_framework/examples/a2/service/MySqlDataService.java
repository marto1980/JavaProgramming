package com.marto.learn_spring_framework.examples.a2.service;

import org.springframework.stereotype.Component;

@Component
public class MySqlDataService implements DataService {

  @Override
  public int[] retrieveData() {
    return new int[] {1, 2, 3, 4, 5};
  }
}
