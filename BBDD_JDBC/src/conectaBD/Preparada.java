package conectaBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Preparada {

	public static void main(String[] args) {
		try {
			//1. Conexión con la base de datos
			Connection conexion =
					DriverManager.getConnection(""
							+ "jdbc:mysql://localhost:3306/banco", 
							"banco", "banco");
			System.out.println("Esta conectado con Banco");
			
			PreparedStatement ps = conexion.prepareStatement(""
					+ "INSERT INTO gestor(usuario,password, correo) "
					+ "VALUES (?,?,?)");
			// se sustituye la primera aparición del carácter ? con el valor gestor10
			ps.setString(1, "gestor13");
			// se sustituye la segunda aparición del carácter ? con el valor gestor10
			ps.setString(2, "gestor13");
			// se sustituye la tercera aparición del carácter ? con el valor gestor10@correo.com
			ps.setString(3, "gestor13@correo.com");
			// se ejecuta la instrucción SQL siguiente:
			// INSERT INTO gestor(usuario, password, correo) VALUES ('gestor10', 'gestor10','gestor10@correo.com')
			if (ps.executeUpdate() != 1) {
			throw new SQLException("Error en la Inserción");
			}
			System.out.println("Programa finalizado");
		}
		catch (Exception e) {
			System.out.println("No esta conectado");
			e.getStackTrace();
		}

	}

}
