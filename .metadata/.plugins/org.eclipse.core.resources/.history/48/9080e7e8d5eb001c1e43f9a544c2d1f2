
public class MainCoche {

	public static void main(String[] args) {
		Coche honda = new Coche();
		Coche audi = new Coche(0.0f , 350.0f , 2, 0);
		//invocación de los métodos estáticos
		//Primer método le pasamos 350CV y nos convierte a 259.26Kw
		//float kw = Coche.convertirCvKw(350.0f);
		//Primer método le pasamos 259.26Kw y nos convierte a 350CV
		//float cv = Coche.convertirKwCv(kw);
		
		//Mostrar el resultado de los dos cálculos de los métodos static
		//System.out.println(kw); //259.26Kw
		//System.out.println(cv); //350CV
		
		//También se puede llamar al método estatico desde un objeto
		//audi.convertirCvKw(350.0f);
		//No necesita invocar a través de un Objeto
		System.out.println(Coche.factorConversionCvKw);
		Coche.factorConversionCvKw = 2.36f;
		System.out.println(Coche.factorConversionCvKw);
	}

}
