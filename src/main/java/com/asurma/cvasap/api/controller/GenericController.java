package com.asurma.cvasap.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GenericController {

    @GetMapping("/hello")
    public String getHello() {
        return "Hello, this is a test API endpoint.";
    }

}
