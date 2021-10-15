package com.example.springbootdocker.rest;

import com.example.springbootdocker.model.Persona;
import com.example.springbootdocker.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaREST {

    @Autowired
    private PersonaService personaService;

    @GetMapping
    private ResponseEntity<List<Persona>> getAllPersona(){
        return ResponseEntity.ok(personaService.findAll());
    }
}
