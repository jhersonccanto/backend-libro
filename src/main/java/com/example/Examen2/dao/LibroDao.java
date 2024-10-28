package com.example.Examen2.dao;

import java.util.List;
import java.util.Optional;

import com.example.Examen2.entity.Libro;

public interface LibroDao {
	Libro create(Libro a);
	Libro update(Libro a);
	void delete(Long id);
	Optional <Libro> read(Long id);
	List<Libro> readAll();

}
