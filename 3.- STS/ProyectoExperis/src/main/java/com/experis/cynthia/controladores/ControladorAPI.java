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

import com.experis.cynthia.modelos.Direccion;
import com.experis.cynthia.modelos.Salon;
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
								   @RequestParam("email") String email,
								   @RequestParam("salon_id") Long salon_id) { //@RequestBody Usuario nuevoUsuario
		
		
		Usuario nuevo = new Usuario(nombre, apellido, email);
		return s.guardarUsuario(nuevo, salon_id);
		
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
									@RequestParam("email") String email,
									@RequestParam("salon_id") Long salon_id) {
		
		Usuario actualizado = new Usuario(id, nombre, apellido, email);
		return s.guardarUsuario(actualizado, salon_id);
		
	}
	
	@PostMapping("/direcciones")
	public Direccion apiGuardarDireccion(@RequestParam("calle") String calle,
										 @RequestParam("numero") String numero,
										 @RequestParam("cp") int cp,
										 @RequestParam("ciudad") String ciudad,
										 @RequestParam("pais") String pais,
										 @RequestParam("usuario_id") Long usuario_id) {
		
		Direccion nuevaDireccion = new Direccion();
		nuevaDireccion.setCalle(calle);
		nuevaDireccion.setNumero(numero);
		nuevaDireccion.setCp(cp);
		nuevaDireccion.setCiudad(ciudad);
		nuevaDireccion.setPais(pais);
		
		//Direccion nuevaDireccion = new Direccion(calle, numero, ciudad, cp, pais);
		
		return s.guardarDireccion(nuevaDireccion, usuario_id);
		
	}
	
	@GetMapping("/salones")
	public List<Salon> apiMuestraSalones() {
		return s.muestraSalones();
	}
	
	// /hobbies/agregar/1/2
	@GetMapping("/hobbies/agregar/{usuario_id}/{hobby_id}")
	public void agregarHobby(@PathVariable("usuario_id") Long usuario_id,
							 @PathVariable("hobby_id") Long hobby_id) {
		
		s.guardarUsuarioHobby(usuario_id, hobby_id);
		
	}
	
	
	// /hobbies/eliminar/1/2
	
	
}
