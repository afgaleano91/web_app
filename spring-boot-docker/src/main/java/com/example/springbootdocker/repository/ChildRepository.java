package com.example.springbootdocker.repository;

import com.example.springbootdocker.model.Child;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChildRepository extends JpaRepository <Child, Long> {
}
