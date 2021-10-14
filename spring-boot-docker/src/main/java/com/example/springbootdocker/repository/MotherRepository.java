package com.example.springbootdocker.repository;

import com.example.springbootdocker.model.Father;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotherRepository extends JpaRepository <Father, Long> {
}
