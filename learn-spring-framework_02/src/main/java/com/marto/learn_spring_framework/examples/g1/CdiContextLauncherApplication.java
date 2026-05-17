package com.marto.learn_spring_framework.examples.g1;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.util.Arrays;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// @Component
@Named
class DataService {}

// @Component
@Named
class BusinessService {
  private DataService dataService;

  public DataService getDataService() {
    System.out.println("Setter Injection");
    return dataService;
  }

  // @Autowired
  @Inject
  public void setDataService(DataService dataService) {
    this.dataService = dataService;
  }
}

@Configuration
@ComponentScan
public class CdiContextLauncherApplication {

  public static void main(String[] args) {

    try (var context =
        new AnnotationConfigApplicationContext(CdiContextLauncherApplication.class)) {

      Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
      System.out.println(context.getBean(BusinessService.class).getDataService());
    }
  }
}
