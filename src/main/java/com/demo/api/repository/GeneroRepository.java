package com.demo.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import com.demo.api.model.Genero;

@Repository
@RestResource(rel = "api/generos", path="api/generos")
public interface GeneroRepository extends JpaRepository<Genero, Integer>{

}
