package com.experis.cynthia.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.experis.cynthia.modelos.Usuario;
import com.experis.cynthia.servicios.Servicios;

@RestController
@RequestMapping("/api") //Todas mis rutas comienzan con /api
public class ControladorAPI {
	
	@Autowired
	private Servicios s;
	
	@GetMapping("/usuarios")
	public List<Usuario> apiMuestraUsuarios(){
		return s.todosUsuarios();
	}
	
	@PostMapping("/usuarios")
	public Usuario apiCrearUsuario(@RequestParam("nombre") String nombre,
								   @RequestParam("apellido") String apellido,
								   @RequestParam("email") String email) {
		
		
		Usuario nuevo = new Usuario(nombre, apellido, email);
		return s.guardarUsuario(nuevo);
		
	}
	
	@GetMapping("/usuarios/{id}") // /api/usuarios/2
	public Usuario apiMuestraUsuario(@PathVariable("id") Long id) {
		return s.buscarUsuario(id);
	}
	
	@DeleteMapping("/usuarios/{id}")
	public void apiBorrar(@PathVariable("id") Long id) {
		s.borrarUsuario(id);
	}
	
	@PutMapping("/usuarios/{id}")
	public Usuario apiEditarUsuario(@PathVariable("id") Long id,
									@RequestParam("nombre") String nombre,
									@RequestParam("apellido") String apellido,
									@RequestParam("email") String email) {
		
		Usuario actualizado = new Usuario(id, nombre, apellido, email);
		return s.guardarUsuario(actualizado);
		
	}
	
}
