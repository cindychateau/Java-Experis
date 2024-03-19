package com.experis.cynthia.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.experis.cynthia.modelos.Direccion;
import com.experis.cynthia.modelos.Hobby;
import com.experis.cynthia.modelos.Salon;
import com.experis.cynthia.modelos.Usuario;
import com.experis.cynthia.repositorios.RepositorioDirecciones;
import com.experis.cynthia.repositorios.RepositorioHobbies;
import com.experis.cynthia.repositorios.RepositorioSalones;
import com.experis.cynthia.repositorios.RepositorioUsuarios;

@Service
public class Servicios {
	
	
	@Autowired
	private RepositorioUsuarios repoUsuarios;
	
	@Autowired
	private RepositorioDirecciones repoDirecciones;
	
	@Autowired
	private RepositorioSalones repoSalones;
	
	@Autowired
	private RepositorioHobbies repoHobbies;
	
	//Me regrese una lista con todos los usuarios
	public List<Usuario> todosUsuarios(){
		return repoUsuarios.findAll();
	}
	
	//Guardar usuario
	public Usuario guardarUsuario(Usuario nuevoUsuario, Long salon_id) {
		//Obtengo el salon en base al id
		Salon salonUsuario = muestraSalon(salon_id);
		nuevoUsuario.setSalon(salonUsuario);
		
		return repoUsuarios.save(nuevoUsuario);
	}
	
	public Usuario guardarUsuarioFormulario(Usuario nuevoUsuario) {
		return repoUsuarios.save(nuevoUsuario);
	}
	
	//Me regrese un obj usuario en base a su ID
	public Usuario buscarUsuario(Long id) {
		return repoUsuarios.findById(id).orElse(null);
		//Me regresa un usuario y si no lo encuentra regresar null
	}
	
	//Borre en base a su ID
	public void borrarUsuario(Long id) {
		repoUsuarios.deleteById(id);
	}
	
	public Direccion guardarDireccion(Direccion nuevaDireccion, Long usuario_id ) {
		//Obtengo el usuario que queremos que se relacione
		Usuario usuario_direccion = buscarUsuario(usuario_id); //encuentra al usuario que tiene ese id
		//Establecemos ese usuario en la dirección
		nuevaDireccion.setUsuario(usuario_direccion);
		//Guardamos y regresamos la nuevaDireccion
		return repoDirecciones.save(nuevaDireccion);
		
	}
	
	public List<Salon> muestraSalones() {
		return repoSalones.findAll();
	}
	
	public Salon muestraSalon(Long id) {
		return repoSalones.findById(id).orElse(null);
	}
	
	public Hobby muestraHobby(Long id) {
		return repoHobbies.findById(id).orElse(null);
	}
	
	public void guardarUsuarioHobby(Long usuario_id, Long hobby_id) {
		//Obtenemos el objeto de usuario
		Usuario miUsuario = buscarUsuario(usuario_id);
		
		//Obtenemos el objeto hobby
		Hobby miHobby = muestraHobby(hobby_id);
		
		miUsuario.getHobbies().add(miHobby); //miHobby.getUsuarios().add(miUsuario);
		
		repoUsuarios.save(miUsuario); //repoHobbies.save(miHobby);
		
	}
	
	public Salon guardarSalon(Salon nuevoSalon) {
		return repoSalones.save(nuevoSalon);
	}
	
}
