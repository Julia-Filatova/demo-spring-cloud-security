package com.cengage.demospringcloudsecurity;

import com.cengage.demospringcloudsecurity.config.WebConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;


@Import(WebConfiguration.class)
@SpringBootApplication
public class DemoSpringcloudSecurityApplication {

  public static void main(String[] args) {
    SpringApplication.run(DemoSpringcloudSecurityApplication.class, args);
  }

}
