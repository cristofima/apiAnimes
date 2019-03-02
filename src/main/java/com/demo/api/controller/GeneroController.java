package com.demo.api.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.api.model.Genero;
import com.demo.api.repository.GeneroRepository;

@RestController
@RequestMapping(value = "/api/generos")
public class GeneroController {

	@Autowired
	private GeneroRepository generoRepository;

	@RequestMapping(method = RequestMethod.GET)
	public Page<Genero> getAll(Pageable pageable) {
		return generoRepository.findAll(pageable);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Optional<Genero> getGenero(@PathVariable int id) {
		return generoRepository.findById(id);
	}

	@RequestMapping(method = RequestMethod.POST)
	public Genero create(@Valid @RequestBody Genero genero) {
		return generoRepository.save(genero);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public Optional<Object> update(@PathVariable int id, @Valid @RequestBody Genero genero) {
		return generoRepository.findById(id).map(question -> {
			question.setGenNombre(genero.getGenNombre());
			return generoRepository.save(question);
		});
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public Optional<Object> delete(@PathVariable int id) {
		return generoRepository.findById(id).map(question -> {
			generoRepository.delete(question);
			return ResponseEntity.ok().build();
		});
	}
}
