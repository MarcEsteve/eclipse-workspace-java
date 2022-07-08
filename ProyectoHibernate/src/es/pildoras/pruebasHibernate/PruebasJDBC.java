package es.pildoras.pruebasHibernate;

import java.sql.Connection;
import java.sql.DriverManager;

public class PruebasJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String jdbcUrl= "jdbc:mysql://localhost:3306/pruebasHibernate?useSSL=false";
		String usuario= "root";
		String contra= "";
		
		try {
			
			//Conexión directa:
			System.out.println("Conectando a la base de datos: " + jdbcUrl);
			Connection conexion = DriverManager
					.getConnection(jdbcUrl,usuario,contra);
			System.out.println("Conexión exitosa");
			
		} catch(Exception e) {
			
		}
		

	}

}
