package com.experis.cynthia;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiculo v1 = new Vehiculo();
		v1.setColor("rojo");
		System.out.println(v1.getColor());
		v1.imprimir();
		
		
		Auto automovil1 = new Auto(2010, "Honda", "Civic", "rojo", 4, "123ABC");
		System.out.println(automovil1.getPlacas());
		automovil1.imprimir();
		
		Bicicleta bici1 = new Bicicleta(2024, "Apache", "Nuevo", "verde", 10, "Bici de ninios");
		System.out.println("Cantidad de ruedas de bici:"+bici1.getCantidadRuedas());
		
	}

}
