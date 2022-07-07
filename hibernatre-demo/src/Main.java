
//import java.sql.Connection;
//import java.sql.DriverManager;
public class Main {

	public static void main(String[] args) {
		//String jdbcUrl= "jdbc:mysql://localhost:3306/hibernate-demo";
		//String usuario= "root";
		//String contra= "";
		/*
		Creaci�n del objeto SessionFactory. Hibernate buscar� por defecto el 
		archivo	hibernate.cfg.xml, aunque no se le indique, por lo que no 
		es necesario establecerlo como par�metro en el m�todo configure
		*/
		System.out.println("Iniciando conexi�n");
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Estudiante.class)
				.buildSessionFactory();
		System.out.println("Conexi�n correcta");
		// creaci�n de un objeto de tipo Session a partir del SessionFactory
		Session session = factory.getCurrentSession();
		
		try {
			//Conexi�n directa:
			//System.out.println("Conectando a la base de datos: " + jdbcUrl);
			//Connection conexion = DriverManager
			//		.getConnection(jdbcUrl,usuario,contra);
			//System.out.println("Conexi�n exitosa");
			
			//Obtenci�n, Manipulaci�n y Almacenamiento de Objetos
			//INSERT INTO
			Estudiante estudiante = new Estudiante("Marc","Esteve Garcia",36);
			//Comienza la transacci�n commit/rollback
			session.beginTransaction();
			//Guarda el objeto
			session.save(estudiante);
			
			//Finaliza y guardar la transacci�n (INSERT INTO en la BBDD)
			session.getTransaction().commit();
			
		} finally {
			factory.close();
		}

	}

}
