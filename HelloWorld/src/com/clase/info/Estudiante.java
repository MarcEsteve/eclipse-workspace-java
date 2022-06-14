package com.clase.info;

public class Estudiante extends Persona {
	//Constructor por defecto
	public Estudiante() {
		this.id=1;
		this.edat=18;
		this.telefono=699999999;
		this.numeroDeNotas=1;
		this.sumaDeNotas=10;
		this.notaMedia=5.0;
	}
	//Constructor con un parámetro
	public Estudiante(int id) {
		this.id=id;
		this.edat=23;
		this.telefono=699999996;
		this.numeroDeNotas=3;
		this.sumaDeNotas=7;
		this.notaMedia=7.5;
	}
	//Constructor con dos parámetros
	public Estudiante(int id, int edat) {
		this.id=id;
		this.edat=edat;
		this.telefono=699999996;
		this.numeroDeNotas=3;
		this.sumaDeNotas=7;
		this.notaMedia=7.5;
	}
	//Constructor con todos los parámetros
	public Estudiante(int id,int edat,int telefono,int numeroDeNotas,int sumaDeNotas,double notaMedia) {
		this.id=id;
		this.edat=edat;
		this.telefono=telefono;
		this.numeroDeNotas=numeroDeNotas;
		this.sumaDeNotas=sumaDeNotas;
		this.notaMedia=notaMedia;
	}
	//Atributos privados es lo normal
	private int numeroDeNotas;
	private int sumaDeNotas;
	private double notaMedia;
	private static int idEstudiante;
	//public static float crearEstudiante = Estudiante();
	//Métodos públicos
	public void mostrarInfo() {
		getNumeroDeNotas();
		getSumaDeNotas();
		getNotaMedia();
	};
	public int getNumeroDeNotas() {
		return numeroDeNotas;
	};
	public void setNumeroDeNotas(int numeroDeNotas) {
		this.numeroDeNotas = numeroDeNotas;
	};
	public int getSumaDeNotas() {
		return sumaDeNotas;
	};
	public void setSumaDeNotas(int sumaDeNotas) {
		this.sumaDeNotas = sumaDeNotas;
	};
	public double getNotaMedia() {
		return notaMedia;
	};
	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	};
	//Ejercicio 379 por resolver
	public static float crearEstudiante(String... args) {
		return idEstudiante;
		/*return edat;
		return telefono;
		return numeroDeNotas;
		return sumaDeNotas;
		return notaMedia;*/
	}
	public void agregarNuevaNota() {
		numeroDeNotas++;
	}
	//Ejercicio pág 380
	public void agregarNuevaNota(int nota) {
		agregarNuevaNota();
		sumaDeNotas+=nota;
		notaMedia=sumaDeNotas/numeroDeNotas;
	}
	public void agregarNuevaNota(int nota, boolean notaTrue) {
		if (notaTrue) {
			numeroDeNotas=0;
			sumaDeNotas=0;
			notaMedia=0;
		} else {
			agregarNuevaNota();
			agregarNuevaNota(nota);
		}
		
	}
	@Override
	public void mostrarID() {
		System.out.println("La id del estudiante es: "+ this.id + " - Su nota media es: " + this.notaMedia ); 		
	}
}
