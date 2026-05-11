package com.marto.learn_spring_framework.examples.a2;

import com.marto.learn_spring_framework.examples.a2.service.BusinessCalculationService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.marto.learn_spring_framework.examples.a2.service")
public class BusinessCalculationLauncherApplication {

  public static void main(String[] args) {

    try (var context =
        new AnnotationConfigApplicationContext(BusinessCalculationLauncherApplication.class)) {

      // Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
      int maxValue = context.getBean(BusinessCalculationService.class).findMax();
      System.out.println("maxValue: " + maxValue);
    }
  }
}
