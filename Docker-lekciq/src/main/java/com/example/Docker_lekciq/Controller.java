package com.example.Docker_lekciq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    Config config;

    @Autowired
    ServiceClass serviceClass;

    @GetMapping("/")
    public int hi() {

        return 1;
    }

    @GetMapping("/hi")
    public int hello(@RequestParam int a) {
        return 5 / a;

    }

}
