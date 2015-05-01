import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;


public class EjemploEscribirConfiguraciones {
	public EjemploEscribirConfiguraciones(){
		try {
			Properties propiedades = new Properties();
			propiedades.setProperty("base_datos", "alumnos");
			propiedades.setProperty("direccion_ip", "192.168.0.1");
			propiedades.setProperty("puerto_conexion", "1521");		
			propiedades.store(new FileOutputStream("configuraciones.ini"), "Este es un comentario");
			System.out.println("Finalizo la escritura");
		} catch (IOException e){
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new EjemploEscribirConfiguraciones();

	}

}
