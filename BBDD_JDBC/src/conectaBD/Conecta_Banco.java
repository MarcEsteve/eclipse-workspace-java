package conectaBD;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conecta_Banco {

	public static void main(String[] args) {
		
		try {
			//1. Conexión con la base de datos
			Connection miConexionBanco = DriverManager.getConnection(""
					+ "jdbc:mysql://localhost:3306/banco",
					"banco", "banco");
			System.out.println("Esta conectado");
			// muestra información del tipo de sistema de base de datos (MySQL)
			System.out.println("Base de datos: " +
					miConexionBanco.getMetaData().getDatabaseProductName());
		}
		catch (Exception e) {
			System.out.println("No esta conectado");
			e.getStackTrace();
		}

	}

}
