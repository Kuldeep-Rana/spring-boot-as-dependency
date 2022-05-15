package com.transaction.demo.service2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("service2/v1")
public class Service2Controller {

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }
}
