package com.cengage.demospringcloudsecurity;

import com.cengage.demospringcloudsecurity.config.WebConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.resource.UserInfoRestTemplateFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;


@Import(WebConfiguration.class)
@SpringBootApplication
public class DemoSpringCloudSecurityApplication {

  public static void main(String[] args) {
    SpringApplication.run(DemoSpringCloudSecurityApplication.class, args);
  }

  /**
   * Bean needed to turn on token relay for rest requests
   *
   */
  @Bean
  public OAuth2RestTemplate restTemplate(UserInfoRestTemplateFactory factory) {
    return factory.getUserInfoRestTemplate();
  }
}
