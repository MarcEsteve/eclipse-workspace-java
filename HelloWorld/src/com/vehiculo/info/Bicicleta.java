package com.vehiculo.info;

//Especialización de la superclase Vehiculo, es decir, una clase hija
public class Bicicleta extends Vehiculo {
	//Atributos
	private int cambios;
	//Constructores
	public Bicicleta() {
		super(); //Llama al constructor de la superclase Vehiculo
		this.cambios = 13;
		System.out.println("Constructor de la clase hija, tiene estos cambios: "+ this.cambios);
	}
	public Bicicleta(float velocidad, int cambios , int asientos, int orientacionRuedas) {
		super(velocidad , asientos , orientacionRuedas);
		this.cambios = 4;
	}
}
