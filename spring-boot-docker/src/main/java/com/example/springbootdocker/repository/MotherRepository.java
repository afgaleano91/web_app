package com.example.springbootdocker.repository;

import com.example.springbootdocker.model.Mother;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotherRepository extends JpaRepository <Mother, Long> {
}
