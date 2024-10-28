package com.example.Examen2.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Examen2.dao.LibroDao;
import com.example.Examen2.entity.Libro;
import com.example.Examen2.repository.LibroRepository;

@Component
public class LibroDaoImpl implements LibroDao{
@Autowired
private LibroRepository librorepository;
	@Override
	public Libro create(Libro a) {
		// TODO Auto-generated method stub
		return librorepository.save(a);
	}

	@Override
	public Libro update(Libro a) {
		// TODO Auto-generated method stub
		return librorepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		librorepository.deleteById(id);
	}

	@Override
	public Optional<Libro> read(Long id) {
		// TODO Auto-generated method stub
		return librorepository.findById(id);
	}

	@Override
	public List<Libro> readAll() {
		// TODO Auto-generated method stub
		return librorepository.findAll();
	}

}
