import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		/* Ejercicio proyecto (Main4): reutiliza el programa desarrollado para mostrar los mensajes
		(Gestores, Clientes, Transferencias, Mensajes, Pr�stamos) en m�todos (un m�todo por
		cada mensaje).
		*/
		Scanner keyboard= new Scanner(System.in);
		int numero =0;
		System.out.println("---\n"
				+ "1. Gestores\r\n"
				+ "2. Clientes\r\n"
				+ "3. Transferencias\r\n"
				+ "4. Mensajes\r\n"
				+ "5. Pr�stamos\r\n"
				+ "6. Salir\r\n");
		while (numero !=6) {
			System.out.println("Introduzca un n�mero: ");
			numero =keyboard.nextInt();
			if (numero == 1) {
				Main4.mensajeGestores1();
			} else if (numero == 2) {
				System.out.println("2--> Clientes");
			} else if (numero == 3) {
				System.out.println("3--> Transferencias");
			} else if (numero == 4) {
				System.out.println("4--> Mensajes");
			} else if (numero == 5) {
				System.out.println("5--> Prestamos");
			}
		}
		System.out.println("6--> Salir");
		keyboard.close();

	}
	public static void mensajeGestores1() {
		System.out.println("1--> Gestores");
	}

}
