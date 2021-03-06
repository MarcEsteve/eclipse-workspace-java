package com.app.f1;

public class manejoExcepciones {

	public static void main(String[] args) {
		/* se generaci?n una excepci?n porque en la sexta iteraci?n del bucle se realiza la
		operaci?n matem?tica 5/0 (infinito) y ese valor no puede ser almacenado en una
		variable de tipo int. Se arroja una excepci?n de tipo ArithmeticException y el programa
		se detiene en ese punto
		for(int i = -5; i < 5; i++) {
			int c = 5 / i;
			System.out.println(c);
		}*/
		/*
		Exception in thread "main" java.lang.ArithmeticException: / by zero
		at manejoExcepciones.main(manejoExcepciones.java:10)
		*/
		//Programa con TRY/CATCH
		// trata de ejecutar el c?digo que se encuentra entre las llaves
		/*try {
			for(int i = -5; i < 5; i++) {
				int c = 5 / i;
				System.out.println(c);
			}
		}
		// captura la excepci?n de tipo ArithmeticException
		catch (ArithmeticException e) {
			System.out.println("Excepci?n arim?tica");
		}
		// captura cualquier otra excepci?n que pueda producirse
		catch (Exception e) {
			System.out.println("Otro error desconocido");
		}
		System.out.println("Programa finalizado");*/
		/*try {
			for (int i = -5; i < 5; i++) {
				if (i == 0) {
				// arroja expl?citamente la excepci?n ArithmeticException, que es capturada por elcatch
					throw new ArithmeticException();
				}
				int c = 5 / i;
				System.out.println(c);
			}
		}
		// captura la excepci?n de tipo ArithmeticException
		catch (ArithmeticException e) {
			System.out.println("Excepci?n aritm?tica");
		}*/
		// trata de ejecutar el c?digo que se encuentra entre las llaves
		/*try {
			for(int i = -5; i < 5; i++) {
				int c = 5 / i;
				System.out.println(c);
			}
		}
		// captura todas las excepciones que puedan producirse
		catch (Exception e) {
		// arroja la excepci?n ArithmeticException, que no es capturada
			System.out.println(5 / 0);
		}
		// este c?digo se ejecuta siempre, se produzca excepci?n (dentro del bloque try o catch) o no
		finally {
			System.out.println("Este c?digo se ejecuta siempre");
		}
		// esta l?nea no se ejecuta porque se produce una excepci?n no capturada dentro del catch
		System.out.println("Programa finalizado");*/
		//Uso de printStackTrace()
		try {
			for(int i = -5; i < 5; i++) {
				int c = 5 / i;
				System.out.println(c);
			}
		}
		// captura cualquier excepci?n que pueda producirse
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("El programa puede continuar a partir de aqui");
		//Siguiente parte del c?digo
	}
}