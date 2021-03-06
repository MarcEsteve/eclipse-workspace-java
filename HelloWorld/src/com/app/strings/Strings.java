package com.app.strings;

public class Strings {

	public static void main(String[] args) {
		String texto = "Esto es un texto";
		int longitudString=texto.length();
		int ultimaPosicionString= longitudString-1;
		System.out.println(longitudString);
		// devuelve el primer car?cter del String
		System.out.println(texto.charAt(0));
		// devuelve el tercer car?cter del String
		System.out.println(texto.charAt(2));
		// devuelve el ?ltimo car?cter del String
		System.out.println(texto.charAt(ultimaPosicionString));
		// Error porque el String texto posee una longitud 
		//de 16 caracteres. Se genera un excepci?n de tipo 
		//StringIndexOutOfBoundsException
		// System.out.println(texto.charAt(222));
		// 3
		System.out.println(texto.indexOf('o'));
		// 9
		System.out.println(texto.indexOf('n'));
		// -1
		System.out.println(texto.indexOf('z'));
		// 5, donde se inicia "es"
		System.out.println(texto.indexOf("es"));
		// 15, encuentra la ?ltima "o"
		System.out.println(texto.indexOf('o', 4));
		// -1, no encuentra a partir del ?ndice 6 "es"
		System.out.println(texto.indexOf("es", 6));
		// 15
		System.out.println(texto.lastIndexOf('o'));
		// -1
		System.out.println(texto.lastIndexOf('z'));
		// 5
		System.out.println(texto.lastIndexOf("es"));
		// true
		System.out.println(texto.startsWith("Esto"));
		// false
		System.out.println(texto.startsWith("a"));
		// true
		System.out.println(texto.endsWith("to"));
		// false
		System.out.println(texto.endsWith("a"));
		String texto3 = "";
		// true
		System.out.println(texto3.isEmpty());
		String texto1 = "hola";
		String texto2 = "adi?s";
		// true
		System.out.println(texto1.equals("hola"));
		// false
		System.out.println(texto2.equals("hola"));
		// false porque el primer car?cter se encuentra en may?sculas
		System.out.println(texto1.equals("Hola"));
		String texto4 = "AdI?S";
		// true
		System.out.println(texto1.equalsIgnoreCase("hOlA"));
		// true
		System.out.println(texto4.equalsIgnoreCase("adi?s"));
		// true
		System.out.println(texto1.contains("ol"));
		// false
		System.out.println(texto1.equals("al"));
		String textoSaludo = "Hola, c?mo est?s";
		// c?mo est?s
		System.out.println(textoSaludo.substring(6));
		// c?mo e
		System.out.println(textoSaludo.substring(6, 12));
		String hello = "heLlo";
		// HELLO
		System.out.println(hello.toUpperCase());
		// hello
		System.out.println(hello.toLowerCase());
		// Esto es un texto m?s grande
		System.out.println(texto.concat(" m?s grande "
										+ "y concatenado"));
		String quijote = "En un lugar de la Mancha";
		String quijoteConEspacios = " En un lugar de la Mancha ";
		// En un lugur de lu Munchu
		System.out.println(quijote.replace("a", "u"));
		// En un lugur de la Mancha
		System.out.println(quijote.replaceFirst("a", "u"));
		// En un lugar de tu Mancha
		System.out.println(quijote.replaceFirst("la", "tu"));
		System.out.println(quijoteConEspacios);
		//Quita esos espacios del principio y final del string
		System.out.println(quijoteConEspacios.trim());
		// convierte de booleano a String
		String str1 = String.valueOf(true);
		System.out.println(str1);
		// convierte de int a String
		String str2 = String.valueOf(1);
		System.out.println(str2);
		// convierte de char a String
		String str3 = String.valueOf('a');
		System.out.println(str3);
		//CONCATENACI?N
		// 3
		System.out.println(1+2);
		// 12
		System.out.println("1" + 2);
		// 11
		System.out.println("1" + "1");
		int i = 20;
		// El valor es 2020
		System.out.println("El valor es " + i + 20);
		// El valor es 40
		System.out.println("El valor es " + (i + 20));
		String textoCorto = "Esto es un texto";
		String textoLargo = textoCorto.concat(" mayor");
		// Esto es un texto
		System.out.println(textoCorto);
		// Esto es un texto mayor
		System.out.println(textoLargo);
		//Inmutabilidad "String constant pool"
		String s1 = "Welcome";
		// no se crea una nueva instancia, 
		//sino que se aprovecha de la anterior
		String s2 = "Welcome";
		if(s1==s2) {
			System.out.println("Son iguales");
		}
		else {
			System.out.println("No son iguales");
		}
		
	}

}
