package com.example.Examen2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Examen2.entity.Libro;
import com.example.Examen2.service.LibroService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/libros")
@CrossOrigin(origins = "http://localhost:4200")
public class LibroController {
	@Autowired
	private LibroService libroservice;
	
	@GetMapping
	public ResponseEntity<List<Libro>> readAll(){
		try {
			List<Libro> Libro = libroservice.readAll();
			if(Libro.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(Libro, HttpStatus.OK);
		} catch(Exception e){
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	}
	@PostMapping
     public ResponseEntity<Libro> create(@Valid @RequestBody Libro ac){
    	 try {
    		 Libro a = libroservice.create(ac);
    		 return new ResponseEntity<>(a, HttpStatus.CREATED);
    	 } catch (Exception e) {
    		 return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    	 }
     }
     
     @GetMapping("/{id}")
     public ResponseEntity<Libro> getLibroId(@PathVariable("id")Long id){
    	 try {
    		 Libro a = libroservice.read(id).get();
    		 return new ResponseEntity<>(a, HttpStatus.CREATED);
    	 } catch (Exception e) {
    		 return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    	 }
     }
     
     @DeleteMapping("/{id}")
     public ResponseEntity<Libro> delLibroId(@PathVariable("id")Long id){
    	 try {
    		 libroservice.delete(id);
    		 return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    	 } catch (Exception e) {
    		 return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    	 }
     }
     
     @PutMapping("/{id}")
     public ResponseEntity<?> updateLibro(@PathVariable("id") Long id, @Valid @RequestBody Libro ac){
    	 Optional <Libro> a = libroservice.read(id);
    		 if(!a.isEmpty()) {
    			 return new ResponseEntity<>(libroservice.update(ac), HttpStatus.OK); 
    		 } else {
    			 return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    		 }
     }

	}
