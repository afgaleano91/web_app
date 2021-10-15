package com.example.springbootdocker.repository;

import com.example.springbootdocker.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository <Persona, Long> {
}
