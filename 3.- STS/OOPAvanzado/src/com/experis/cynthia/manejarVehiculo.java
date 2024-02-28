package com.experis.cynthia;

public interface manejarVehiculo {
	
	public default void manejar() {
		System.out.println("Se esta manejando el vehiculo");
	}
	
	abstract void acelerar();
	abstract void desacelerar();
	
}
