
public class numeroPrimos {

	public static void main(String[] args) {
		
		int numPrimo = 4;
		
		//A�adir un bucle for con una variable i para que decremente el numPrimo y haga la siguiente condicion: numPrimo%i!=0
		if (numPrimo>1 && numPrimo/numPrimo==1 && numPrimo/1==numPrimo) {
			System.out.printf("Es numero primo"); 
		} else {
			System.out.printf("No es numero primo"); 
		}

	}

}
