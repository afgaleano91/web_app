package com.example.springbootdocker.rest;

import com.example.springbootdocker.model.Child;
import com.example.springbootdocker.service.ChildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/child")
public class ChildREST {

    @Autowired
    private ChildService childService;


    @GetMapping
    private ResponseEntity<List<Child>> getAllChild(){
        return ResponseEntity.ok(childService.findAll());
    }
}
