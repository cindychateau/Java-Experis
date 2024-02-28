package com.experis.cynthia;

public class Bicicleta extends Vehiculo implements manejarVehiculo {
	
	private String tipo;

	public Bicicleta(int anio, String marca, String modelo, String color, int cantidadRuedas, String tipo) {
		super(anio, marca, modelo, color, 2);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void acelerar() {
		System.out.println("Pedaleo más rápido");
		velocidad += 1;
		System.out.println("Mi velocidad es de:"+velocidad);
	}
	
	public void desacelerar() {
		System.out.println("Bajo la velocidad bajando despacio mis pies");
		velocidad -= 1;
		System.out.println("Mi velocidad es de:"+velocidad);
	}
	
	
}
