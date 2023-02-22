package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;

@RestController

public class name{

@GetMapping("/")

public String getName(){

String studentName="IanNeo!"; return "Welcome "+studentName+"!";
}}