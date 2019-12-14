package com.hps.project;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloProject {

    @RequestMapping("/project")
    public String project() {
       return "Hello Project";
    }
}
