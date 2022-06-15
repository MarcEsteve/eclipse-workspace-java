package com.vehiculo.info;

//Especializaci�n de la superclase Vehiculo, es decir, una clase hija
public class Coche extends Vehiculo {
	
	private float caballos;
	
	public Coche() {
		super(0.0f , 4 , 0);
		this.caballos = 0.0f;
	}
	public Coche(float velocidad, float caballos, int asientos, int orientacionRuedas) {
		super(velocidad , asientos , orientacionRuedas);
		this.caballos = caballos;
	}
	/*public Coche(int asientos) {
		this.velocidad = 5.0f;
		this.caballos = 0.0f;
		this.asientos = asientos;
		this.orientacionRuedas = 0;
	}
	public Coche(float velocidad, float caballos) {
		this.velocidad = velocidad;
		this.caballos = caballos;
		this.asientos = 5;
		this.orientacionRuedas = 0;
	}*/
	
	public static float factorConversionCvKw =2.3f;

	//M�todo static que convierte los cv a kw
	public static float convertirCvKw(float caballos) {
		return caballos / factorConversionCvKw;
	}
	//M�todo static que convierte los kw a cv
	public static float convertirKwCv(float kilowatios) {
		return kilowatios * factorConversionCvKw;
	}
}