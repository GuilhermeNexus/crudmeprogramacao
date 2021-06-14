package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class cursoController {


	cursoRepository repository;
	
	@GetMapping("/curso")
	public List<Curso> getAllcurso(){
		return repository.findAll();
	}
	
	@GetMapping("/curso/{id}")
	public Curso getCursoid(@PathVariable long id) {
		return repository.getById(id);
	}
	@PostMapping("/curso")
	public Curso salvarcurso(@RequestBody Curso curso) {
		return repository.save(curso);
	}
	@DeleteMapping("/curso/{id}")
 	public void deletarCurso(@PathVariable long id) {
		repository.deleteById(id);
	}
}
