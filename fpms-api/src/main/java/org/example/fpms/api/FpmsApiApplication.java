package org.example.fpms.api;

import org.example.fpms.core.service.CoreService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FpmsApiApplication {

  public static void main(String[] args) {
    SpringApplication.run(FpmsApiApplication.class, args);
    CoreService coreService = new CoreService();
    coreService.hello();
  }

}
