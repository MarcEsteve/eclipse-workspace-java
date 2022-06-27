package inyecciones;

import java.io.IOException;
import java.net.InetSocketAddress;
import com.sun.net.httpserver.HttpServer;

public class Main {

	public static void main(String[] args) {
		try {
			HttpServer server = HttpServer.create(new InetSocketAddress(9000), 0);
			System.out.println("Servidor ejecutándose en el puerto 9000");
			server.createContext("/", new RootHandler());
			server.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
