package com.transaction.demo.Servce1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("service1/v1")
public class Service1Controller {

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }
}
