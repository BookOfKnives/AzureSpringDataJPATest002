package com.example.azurespringdatajpatest002.greetingscontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Greetingscontroller {
@RequestMapping("/hello") @ResponseBody
    public String hello(@RequestParam(defaultValue="User") String name){
    return "Greetings, " + name + "!";
    }
}
