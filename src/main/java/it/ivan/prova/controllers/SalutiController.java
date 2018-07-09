package it.ivan.prova.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SalutiController {

  @RequestMapping("/")
  public String unSaluto(){
    return "ciao-mondo";
  }
}