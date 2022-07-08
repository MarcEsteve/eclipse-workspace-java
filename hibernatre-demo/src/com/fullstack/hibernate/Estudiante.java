package com.fullstack.hibernate;
// Hibernate recomienda utilizar las librerías de JPA (un estándar) para importar
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="estudiante")
public class Estudiante {
	// el atributo id será una clave primaria única
	@Id
	// autoincremental
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/*
	en este caso (y en los siguientes), el atributo name es redundante 
	porque tiene el mismo nombre que tendrá la columna de la base de datos
	*/
	// id (atributo) --> id (columna en la tabla estudiante)
	@Column(name="id")
	private int id;
	// nombre (atributo) --> nombre (columna en la tabla estudiante)
	@Column(name="nombre")
	private String nombre;
	// apellidos (atributo) --> apellidos (columna en la tabla estudiante)
	@Column(name="apellidos")
	private String apellidos;
	// edad (atributo) --> edad (columna en la tabla estudiante)
	@Column(name="edad")
	private int edad ;
	
	//Contructor por defecto
	public Estudiante() {}
	
	//Contructor con los campos (id no incluida porque es autoincrementada)
	public Estudiante(String nombre, String apellidos, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getId() {
		return id;
	}
}
