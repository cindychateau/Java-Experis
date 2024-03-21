package com.codingdojo.cynthia.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.cynthia.modelos.Usuario;

@Repository
public interface RepositorioUsuarios extends CrudRepository<Usuario, Long> {
	
	//SELECT * FROM usuarios WHERE email = EMAIL QUE RECIBIMOS
	Usuario findByEmail(String email);
	
}
