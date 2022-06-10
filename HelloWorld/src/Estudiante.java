
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
	//Constructor con un par�metro
	public Estudiante(int id) {
		this.id=id;
		this.edat=23;
		this.telefono=699999996;
		this.numeroDeNotas=3;
		this.sumaDeNotas=7;
		this.notaMedia=7.5;
	}
	//Constructor con dos par�metros
	public Estudiante(int id, int edat) {
		this.id=id;
		this.edat=edat;
		this.telefono=699999996;
		this.numeroDeNotas=3;
		this.sumaDeNotas=7;
		this.notaMedia=7.5;
	}
	//Constructor con todos los par�metros
	public Estudiante(int id,int edat,int telefono,int numeroDeNotas,int sumaDeNotas,double notaMedia) {
		this.id=id;
		this.edat=edat;
		this.telefono=telefono;
		this.numeroDeNotas=numeroDeNotas;
		this.sumaDeNotas=sumaDeNotas;
		this.notaMedia=notaMedia;
	}
	//Atributos privados es lo normal
	private int id;
	private int edat;
	private int telefono;
	private int numeroDeNotas;
	private int sumaDeNotas;
	private double notaMedia;
	//M�todos p�blicos
	public void mostrarInfo() {};
	public void agragarNuevaNota() {};
	public int getId() {
		return id;
	};
	public void SetId(int id) {
		this.id = id;
	};
}
