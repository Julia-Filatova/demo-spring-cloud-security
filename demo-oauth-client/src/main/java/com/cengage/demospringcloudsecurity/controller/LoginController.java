package com.cengage.demospringcloudsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

  @RequestMapping("/dashboard/login")
  public String dashboard() {
    return "redirect:/#/";
  }
}