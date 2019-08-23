package com.cengage.demospringcloudsecurity.controller;

import java.security.Principal;
import java.util.Collections;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dashboard")
public class LoginController {

  @RequestMapping("/message")
  public Map<String, Object> dashboard() {
    return Collections.singletonMap("message", "User is logged in now!");
  }

  @RequestMapping("/user")
  public Principal user(Principal user) {
    return user;
  }
}
