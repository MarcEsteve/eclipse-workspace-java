
public class Estudiante {
	//Constructor por defecto
	public Estudiante() {
		this.id=1;
		this.edat=18;
		this.telefono=699999999;
		this.numeroDeNotas=1;
		this.sumaDeNotas=10;
		this.notaMedia=5;
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
	//Atributos
	private int id;
	private int edat;
	private int telefono;
	private int numeroDeNotas;
	private int sumaDeNotas;
	private double notaMedia;
	//Métodos
	public void mostrarInfo() {};
	public void agragarNuevaNota() {};
}
