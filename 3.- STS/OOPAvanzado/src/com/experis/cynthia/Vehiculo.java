package com.experis.cynthia;

public class Vehiculo {
	
	private int anio;
	private String marca;
	private String modelo;
	private String color;
	private int cantidadRuedas;
	
	protected int velocidad = 0;
	
	public Vehiculo() {
	}

	public Vehiculo(int anio, String marca, String modelo, String color, int cantidadRuedas) {
		this.anio = anio;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.cantidadRuedas = cantidadRuedas;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCantidadRuedas() {
		return cantidadRuedas;
	}

	public void setCantidadRuedas(int cantidadRuedas) {
		this.cantidadRuedas = cantidadRuedas;
	}
	
	public void imprimir() {
		System.out.println("Anio:"+anio+" Marca:"+marca+" Modelo:"+modelo+" Color:"+color+" Ruedas:"+cantidadRuedas);
	}

	@Override
	public String toString() {
		return "Detalles del vehiculo: [anio=" + anio + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color
				+ ", cantidadRuedas=" + cantidadRuedas + ", velocidad=" + velocidad + "]";
	}
	
	
	
}
