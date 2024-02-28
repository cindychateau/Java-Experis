package com.experis.cynthia;

//Vehiculo super, Auto subclase
public class Auto extends Vehiculo {
	
	
	private String placas;

	public Auto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Auto(int anio, String marca, String modelo, String color, int cantidadRuedas) {
		super(anio, marca, modelo, color, cantidadRuedas);
		// TODO Auto-generated constructor stub
	}

	public Auto(int anio, String marca, String modelo, String color, int cantidadRuedas, String placas) {
		super(anio, marca, modelo, color, cantidadRuedas);
		this.placas = placas;
	}

	public String getPlacas() {
		return placas;
	}

	public void setPlacas(String placas) {
		this.placas = placas;
	}
	
	//Polimorfismo
	public void imprimir() {
		//Basarme en la clase superior
		super.imprimir();
		System.out.println("Y las placas son:"+placas);
	}
	
}
