package com.example.Examen2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Examen2.entity.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long>{

}
