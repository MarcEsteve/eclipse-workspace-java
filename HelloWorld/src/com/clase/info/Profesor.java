package com.clase.info;

public class Profesor extends Persona {
	//Atributos
	private int numeroDeEdadesEstudiantes;
	private int sumaDeEdadesEstudiantes;
	private float estudiantesEdadMedia;
	//Constructor
	public Profesor() {
		super(13, 25, 699999999);
		/*
		 * Equivalente sin super():
		this.id=1;
		this.edat=18;
		this.telefono=699999999;
		*/
		this.numeroDeEdadesEstudiantes=3;
		this.sumaDeEdadesEstudiantes=10;
		this.estudiantesEdadMedia=18.0f;
	}

	public Profesor(int id, int edat, int telefono) {
		super(id , edat , telefono);
		this.numeroDeEdadesEstudiantes=3;
		this.sumaDeEdadesEstudiantes=10;
		this.estudiantesEdadMedia=20.0f;
	}
	//M?todos
	public void agregarEdadEstudiante() {}
	public void mostrarInfo() {
		getNumeroDeEdadesEstudiantes();
		getSumaDeEdadesEstudiantes();
		getEstudiantesEdadMedia();
	}
	public int getNumeroDeEdadesEstudiantes() {
		return numeroDeEdadesEstudiantes;
	};
	public int getSumaDeEdadesEstudiantes() {
		return sumaDeEdadesEstudiantes;
	};
	public float getEstudiantesEdadMedia() {
		return estudiantesEdadMedia;
	}
	@Override
	public void mostrarID() {
		System.out.println("La id del profesor es: "+ this.id + " - Y la edad media de los estudiantes es: " + this.estudiantesEdadMedia ); 				
	}
}
