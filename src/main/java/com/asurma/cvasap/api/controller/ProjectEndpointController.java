package com.asurma.cvasap.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project")
public class ProjectEndpointController {

    @GetMapping("/hello")
    public String getHello() {
        return "This is a first endpoint. DELETE ME";
    }

}
