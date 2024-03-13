package com.experis.cynthia.repositorios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.experis.cynthia.modelos.Direccion;

@Repository
public interface RepositorioDirecciones extends CrudRepository<Direccion, Long> {
	
	List<Direccion> findAll();
	
	// CRUD 
	// findAll(Iterable), save, findById, deleteById
}
