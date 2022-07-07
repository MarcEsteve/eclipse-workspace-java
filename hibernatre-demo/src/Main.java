
//import java.sql.Connection;
//import java.sql.DriverManager;
public class Main {

	public static void main(String[] args) {
		//String jdbcUrl= "jdbc:mysql://localhost:3306/hibernate-demo";
		//String usuario= "root";
		//String contra= "";
		/*
		Creación del objeto SessionFactory. Hibernate buscará por defecto el 
		archivo	hibernate.cfg.xml, aunque no se le indique, por lo que no 
		es necesario establecerlo como parámetro en el método configure
		*/
		System.out.println("Iniciando conexión");
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Estudiante.class)
				.buildSessionFactory();
		System.out.println("Conexión correcta");
		// creación de un objeto de tipo Session a partir del SessionFactory
		Session session = factory.getCurrentSession();
		
		try {
			//Conexión directa:
			//System.out.println("Conectando a la base de datos: " + jdbcUrl);
			//Connection conexion = DriverManager
			//		.getConnection(jdbcUrl,usuario,contra);
			//System.out.println("Conexión exitosa");
			
			//Obtención, Manipulación y Almacenamiento de Objetos
			//INSERT INTO
			Estudiante estudiante = new Estudiante("Marc","Esteve Garcia",36);
			//Comienza la transacción commit/rollback
			session.beginTransaction();
			//Guarda el objeto
			session.save(estudiante);
			
			//Finaliza y guardar la transacción (INSERT INTO en la BBDD)
			session.getTransaction().commit();
			
		} finally {
			factory.close();
		}

	}

}
