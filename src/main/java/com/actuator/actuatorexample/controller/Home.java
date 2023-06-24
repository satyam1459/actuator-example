package com.actuator.actuatorexample.controller;

import com.actuator.actuatorexample.helper.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class Home {

    @Autowired
    private Student student;

    @GetMapping("/get-data")
    public Map<String,String> getData(){
        return Map.of("Name","Satyam Jaiswal");
    }
}
