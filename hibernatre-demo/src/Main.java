import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl= "jdbc:mysql://localhost:3306/hibernate-demo";
		String usuario= "root";
		String contra= "";
		
		try {
			
			System.out.println("Conectando a la base de datos: " + jdbcUrl);
			
			Connection conexion = DriverManager.getConnection(jdbcUrl,usuario,contra);
			
			System.out.println("Conexión exitosa");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
