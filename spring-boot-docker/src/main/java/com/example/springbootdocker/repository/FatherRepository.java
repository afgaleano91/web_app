package com.example.springbootdocker.repository;

import com.example.springbootdocker.model.Father;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FatherRepository extends JpaRepository <Father, Long> {
}
