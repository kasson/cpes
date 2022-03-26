package com.kasson.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author KassonWu
 */
@RestController
public class HelloController {

   @RequestMapping("/hello")
    public String hello() {
        return "Hello Spring boot 2.6";
    }
}
