package com.example.springbootdocker.rest;

import com.example.springbootdocker.model.Father;
import com.example.springbootdocker.service.FatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/father")
public class FatherREST {

    @Autowired
    private FatherService fatherService;

    @GetMapping
    private ResponseEntity<List<Father>> getAllFather(){
        return ResponseEntity.ok(fatherService.findAll());
    }
}
