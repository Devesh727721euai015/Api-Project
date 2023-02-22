package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class value{
    @RequestMapping
    public String getName(){
        return "Welcome";
    }
}