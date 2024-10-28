package com.example.Examen2.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Examen2.dao.LibroDao;
import com.example.Examen2.entity.Libro;
import com.example.Examen2.service.LibroService;

@Service
public class LibroServiceImpl implements LibroService{
@Autowired
private LibroDao librodao;
	@Override
	public Libro create(Libro a) {
		// TODO Auto-generated method stub
		return librodao.create(a);
	}

	@Override
	public Libro update(Libro a) {
		// TODO Auto-generated method stub
		return librodao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		librodao.delete(id);
	}

	@Override
	public Optional <Libro> read(Long id) {
		// TODO Auto-generated method stub
		return librodao.read(id);
	}

	@Override
	public List<Libro> readAll() {
		// TODO Auto-generated method stub
		return librodao.readAll();
	}

}
