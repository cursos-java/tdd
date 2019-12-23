package com.gradletdd.gradletdd.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * HomeController
 */
@RestController
@RequestMapping(path = "api/v1/home")
public class HomeController {

    @GetMapping(value="")
    public ResponseEntity<?> helloWorld() {
        Map<String, Object> json = new HashMap<>();
        json.put("nome", "Thiago Cunha");
        json.put("idade", 30);
        return ResponseEntity.ok(json);
    }
    
    
}