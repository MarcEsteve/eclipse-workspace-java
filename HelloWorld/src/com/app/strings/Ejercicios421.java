package com.app.strings;

public class Ejercicios421 {

	public static void main(String[] args) {
		
		//EJERCICIO 1
		//Ejercicio: escribe un programa que concatene 
		//dos StringBuilder, utilizando append y tambi?n 
		//el operador concatenaci?n.
		StringBuilder strb1 = new StringBuilder("buenas");
		StringBuilder strb2 = new StringBuilder("tardes");
		//Ejercicio 1 A append()
		//strb1.append(strb2);
		//System.out.println(strb1);
		//Ejercicio 1 B concatenaci?n +
		String strb3 = strb1.toString() 
							+ strb2.toString();
		System.out.println(strb3);
		
		//EJERCICIO 2
		//Ejercicio: escribe un programa que elimine 
		//el ?ltimo car?cter de un StringBuilder.
		int ultimoIndice=strb1.length()-1;
		strb1.deleteCharAt(ultimoIndice);
		System.out.println(strb1);
		//EJERCICIO 3
		//Ejercicio: escribe un programa que inserte 
		//el car?cter 'b' cada tres posiciones en un
		//StringBuilder.
		StringBuilder strb4 = 
					new StringBuilder("buenas tardes");
		System.out.println(strb4);
		for (int i=0;i<strb4.length()-1;i+=3) {
			strb4.insert(i,"b");
			System.out.println(strb4);
		}
		//System.out.println(strb4);
		//EJERCICIO 4
		//Ejercicio: escribe un programa que convierta 
		//en may?sculas la primera letra de cada palabra 
		//de un StringBuilder.
		StringBuilder strb5 = 
						new StringBuilder("Ayer cay? un rayo");
	    String conv=strb5.toString();
	    int pos= 0;
	    String espacio=" ";
	    String letra="";
	    System.out.println(conv);
	    //For recorre todo el array
	    for(int i=0;i<conv.length();i++) {
	    	//Asignamos string conv una sola letra a letra
	    	letra=letra.valueOf(conv.charAt(i));
	    	//Poner solo una letra may?scula
	    	letra=letra.toUpperCase();
	    	//System.out.println(letra);
	    	//Solo modifica cuando tengamos espacios
	    	if (letra.equals(espacio)) {
	    		pos=i;
	    		//System.out.println(i);
	    		letra=letra.valueOf(conv.charAt(pos+1));
	    		letra=letra.toUpperCase();
	    		//Modifique la letra solo posterior al espacio
	    		strb5.replace(i+1,i+2, letra);
                //Primera vez seria [4] para la "C"
                //System.out.println(strb5);
            }
	    }
	    System.out.println(strb5);

	    /* strb8.setCharAt(0, 'H'); //Adri?n
	     * 
	     * while (pos<=conv.length()) { //Miguel
	        char caract=conv.charAt(pos);
	        strb5.setCharAt(0, 'H');
	            if (caract == ' ') {
	                pos++;
	                conv.toUpperCase();
	            }else {
	                pos++;
	            }
	    }*/
		
	}

}
