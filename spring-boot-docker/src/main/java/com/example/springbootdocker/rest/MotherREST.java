package com.example.springbootdocker.rest;

import com.example.springbootdocker.model.Mother;
import com.example.springbootdocker.service.MotherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mother")
public class MotherREST {

    @Autowired
    private MotherService motherService;

    @GetMapping
    private ResponseEntity<List<Mother>> getAllMother() {
        return ResponseEntity.ok(motherService.findAll());
    }
}