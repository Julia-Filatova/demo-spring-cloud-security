package com.cengage.demoresourceserver.controller;

import java.util.Collections;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ResourceController {

  @RequestMapping("/message")
  public Map<String, Object> message() {
    return Collections.singletonMap("message", "Hello from resource server!");
  }

  @RequestMapping("/resource")
  public Map<String, Object> resource() {
    return Collections.singletonMap("resource", "Hello from resource server!");
  }

  @RequestMapping("/relay")
  public Map<String, Object> relay() {
    return Collections.singletonMap("relay", "Hello from resource server!");
  }
}
