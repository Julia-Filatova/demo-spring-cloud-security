package com.cengage.demospringcloudsecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.client.OAuth2RestOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RelayController {

  @Autowired
  private OAuth2RestOperations restTemplate;

  //token relay without zuul proxy
  @RequestMapping("/relay")
  public String relay() {
    ResponseEntity<String> response =
        restTemplate.getForEntity("http://localhost:8888/relay", String.class);
    return response.getBody();
  }
}
