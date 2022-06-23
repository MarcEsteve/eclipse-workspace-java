package conectaBD;

import java.sql.*;

public class Conecta_Ventas {

	public static void main(String[] args) {
		
		try {
			//1. Conexión con la base de datos
			Connection miConexion = DriverManager.getConnection(""
					+ "jdbc:mysql://localhost:3306/ventas",
					"root", "");
			System.out.println("Esta conectado");
			//2. Crear objeto Statement
			Statement miStatement = miConexion.createStatement();
			System.out.println("Creado Statement");
			//3. Instrucción SQL
			ResultSet miResultset = miStatement.executeQuery("SELECT * FROM PRODUCTOS");
			System.out.println("Creado Resultset con SQL");
			//4. Leer/recorrer el ResultSet
			
			while(miResultset.next()) {
				System.out.println(miResultset.getString("CÓDIGOARTÍCULO") + " " 
						+ miResultset.getString("NOMBREARTÍCULO") + " "
						+ miResultset.getDouble("PRECIO")*1.21);
			}
			System.out.println("Recorrido de la info BD");
			
		}
		catch (Exception e) {
			System.out.println("No esta conectado");
			e.getStackTrace();
		}
		
	}

}
