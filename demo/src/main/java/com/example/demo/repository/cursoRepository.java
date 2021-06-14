package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Curso;

public interface cursoRepository extends JpaRepository<Curso, Long>{

}
