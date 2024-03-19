package com.experis.cynthia.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.experis.cynthia.modelos.Salon;
import com.experis.cynthia.modelos.Usuario;
import com.experis.cynthia.servicios.Servicios;

import jakarta.validation.Valid;

@Controller
public class ControladorUsuarios {
	
	
	@Autowired
	private Servicios s;
	
	
	@GetMapping("/usuarios")
	public String usuarios(Model model) {
		
		model.addAttribute("titulo", "Título para mis usuarios");
		
		String usuarios[] = {"Elena de Troya", "Juana de Arco", "Pablo Picasso"};
		model.addAttribute("listaUsuarios", usuarios);
		
		
		return "usuarios.jsp";
	}
	
	/*2 Rutas para formulario. 1.- Que muestre el formulario. 2.- Que reciba la info*/
	@GetMapping("/formulario")
	public String formulario() {
		return "formulario.jsp";
	}
	
	@PostMapping("/registrarme")
	public String registrarme(@RequestParam("nombre") String nombre,
							  @RequestParam("email") String email) {
		
		System.out.println("El nombre es: "+nombre);
		
		//Recibir los parámetros.... Crear un objeto que puede ser guardado
		
		
		return "redirect:/usuarios";
	}
	
	@GetMapping("/nuevo-salon") //Mostrar formulario
	public String nuevoSalon(@ModelAttribute("salon") Salon salon) {
		
		return "nuevo-salon.jsp";
	}
	
	@PostMapping("/crear-salon") //@Valid me permite validar la info del objeto
	public String crearSalon(@Valid @ModelAttribute("salon") Salon salon,
							 BindingResult result /*Encargado de enviar los mensajes de validación*/) {
		
		if(result.hasErrors()) {
			return "nuevo-salon.jsp";
		} else {
			s.guardarSalon(salon);
			return "redirect:/usuarios";
		}
		
	}
	
	@GetMapping("/nuevo-usuario")
	public String nuevoUsuario(@ModelAttribute("usuario") Usuario usuario,
							   Model model) {
		
		List<Salon> salones = s.muestraSalones();
		model.addAttribute("salones", salones);
		
		return "nuevo-usuario.jsp";
		
	}
	
	@PostMapping("/crear-usuario")
	public String crearUsuario(@Valid @ModelAttribute("usuario") Usuario usuario,
							   BindingResult result,
							   Model model) {
		if(result.hasErrors()) {
			List<Salon> salones = s.muestraSalones();
			model.addAttribute("salones", salones);
			return "nuevo-usuario.jsp";
		} else {
			s.guardarUsuarioFormulario(usuario);
			return "redirect:/dashboard";
		}
	}
	
	@GetMapping("/dashboard")
	public String dashboard(Model model) {
		//Enviar la lista de usuarios
		List<Usuario> usuarios = s.todosUsuarios();
		model.addAttribute("usuarios", usuarios);
		
		return "dashboard.jsp";
	}
	
	@DeleteMapping("/borrar/{id}")
	public String borrarUsuario(@PathVariable("id") Long id) {
		s.borrarUsuario(id);
		return "redirect:/dashboard";
	}
	
}
