package com.experis.cynthia.repositorios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.experis.cynthia.modelos.Usuario;

@Repository
public interface RepositorioUsuarios extends CrudRepository<Usuario, Long> { //CRUD = Create Read Update Delete
	
	List<Usuario> findAll(); //SELECT * FROM usuarios
	
	
	Usuario save(Usuario nuevoUsuario); //INSERT y UPDATE
	
	//Existen en CrudRepo: findAll(), findById(id), save(Obj ob), deleteById(id)
	
	//SELECT * FROM usuarios WHERE email = <email que recibamos>
	List<Usuario> findByEmail(String email);
	
	//SELECT * FROM usuarios WHERE nombre = <nombre que recibamos>
	List<Usuario> findByNombre(String nombre);
	
	//SELECT * FROM usuarios WHERE nombre LIKE "<recibamos>%"
	List<Usuario> findByNombreStartingWith(String palabra);
	
}
