package com.cengage.demoresourceserver.controller;

import java.security.Principal;
import java.util.Collections;
import java.util.Map;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableResourceServer
public class ResourceController {

  @RequestMapping("/relay")
  public Map<String, Object> relay(Principal user) {
    return Collections.singletonMap("user",
        new StringBuilder(user.getName().toUpperCase()).reverse());
  }
}
