package com.ecommerce.user_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserQueryController {

    @GetMapping
    public String test(){
        return "I am from user service";
    }
}
