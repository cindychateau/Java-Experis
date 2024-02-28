package com.experis.cynthia;

public class Bicicleta extends Vehiculo {
	
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
	
	
	
	
}
