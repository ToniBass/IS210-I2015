package ejemplo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class EjemploLeerConfiguraciones {
	public EjemploLeerConfiguraciones(){
		Properties propiedades = new Properties();
		try {
			propiedades.load(new FileInputStream("configuraciones.ini"));
			System.out.println("Vidas:"+propiedades.getProperty("vidas"));
			System.out.println("Velocidad:"+propiedades.getProperty("velocidad"));
			System.out.println("Imagen:"+propiedades.getProperty("nombre_imagen"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new EjemploLeerConfiguraciones();
	}

}
