
public class MainEstudiante {

	public static void main(String[] args) {
		Estudiante isaac = new Estudiante();
		Estudiante albert = new Estudiante(3);
		Estudiante laura = new Estudiante(5,19);
		Estudiante alison = new Estudiante(5 , 25 , 696999999, 8 , 8 , 8.0);
		//Mostrar la id del estudiante albert solo si es visible, es decir, "public"
		//System.out.println(albert.id);
	}
}
