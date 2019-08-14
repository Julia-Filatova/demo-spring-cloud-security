package com.cengage.demoresourceserver;

import com.cengage.demoresourceserver.config.WebConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(WebConfiguration.class)
@SpringBootApplication
public class DemoResourceServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(DemoResourceServerApplication.class, args);
  }

}
