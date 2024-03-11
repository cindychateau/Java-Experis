package com.experis.cynthia.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorBase {
	
	/*
	 Petición GET: me permite obtener a través de la ruta una URL y nos da una respuesta
	 URLs sean únicas, nombre método único
	 */
	@GetMapping("/")
	public String home() {
		return "¡Hola desde SpringBoot!";
	}
	
	@GetMapping("/despliega")
	public String despliegaUsuarios() {
		String usuarios[] = {"Elena de Troya", "Juana de Arco", "Pablo Picasso"};
		String respuesta = "";
		for(int i=0; i<usuarios.length; i++) {
			respuesta += "<h2>"+usuarios[i]+"</h2>";
		}
		
		return respuesta;
	}
	
	@GetMapping("/hola") //    /hola?nombre=Elena
	public String holaNombre(@RequestParam(value="nombre") String name) {
		return "Hola "+name;
	}
	
	@GetMapping("/hello/{nombre}") //   /hello/Elena
	public String helloNombre(@PathVariable("nombre") String name) {
		return "Hello "+name;
	}
	
	//Ruta   /repite/hola/5
	/*
	 palabra = "hola"
	 veces = 5
	 cadena = "";
	 cadena = "hola ";
	 cadena = "hola hola ";
	 cadena = "hola hola hola ";
	 cadena = "hola hola hola hola ";
	 cadena = "hola hola hola hola hola ";
	 */
	@GetMapping("/repite/{palabra}/{veces}")
	public String repite(@PathVariable("palabra") String palabra,
						 @PathVariable("veces") int veces) {
		
		String cadena = "";
		for(int i=0; i<veces; i++) {
			cadena += palabra+" ";
		}
		
		return cadena;
		
	}
	
	
	
}
