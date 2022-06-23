package conectaBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class EliminaBD {

	public static void main(String[] args) {
		try {
			//1. Conexi�n con la base de datos
			Connection conexion = DriverManager.getConnection(""
					+ "jdbc:mysql://localhost:3306/ventas",
					"root", "");
			System.out.println("Esta conectado");
			//2. Crear objeto Statement
			Statement miStatement = conexion.createStatement();
			System.out.println("Creado Statement");
			
			//3. Generamos en un String la consulta SQL
			String eliminaSQL= "DELETE FROM PRODUCTOS "
					+ "WHERE `C�DIGOART�CULO`=\"AR77\";";
			//4. Con el m�todo executeUpdate("") introducimos 
			//la instrucci�n SQL del String anterior
			miStatement.executeUpdate(eliminaSQL);
			System.out.println("Datos eliminados correctamente");
			
		}
		catch (Exception e) {
			System.out.println("No esta conectado u otro error");
			e.getStackTrace();
		}

	}

}
