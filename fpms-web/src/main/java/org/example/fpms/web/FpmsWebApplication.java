package org.example.fpms.web;

import org.example.fpms.core.service.CoreService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FpmsWebApplication {

  public static void main(String[] args) {
    SpringApplication.run(FpmsWebApplication.class, args);
    CoreService coreService = new CoreService();
    coreService.hello();
  }

}
