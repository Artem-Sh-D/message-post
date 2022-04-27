package com.example.testapp.controller;

import com.example.testapp.domain.Message;
import com.example.testapp.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/message")
public class RestController {

    @Autowired
    private Service service;


    @PostMapping("/")
    public String dataUser(@RequestBody Message message) {
        service.dataSave(message);
        return "FUCK";
    }

    @GetMapping
    public ResponseEntity getUser() {
        try {
           return ResponseEntity.ok("Good!");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Bad!");
        }
    }

}
