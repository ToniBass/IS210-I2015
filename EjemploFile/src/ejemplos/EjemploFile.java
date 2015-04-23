package ejemplos;

import java.io.File;
import java.io.IOException;

public class EjemploFile {
	public EjemploFile(){
		//Hace referencia a un archivo sin importar si existe
		String rutaArchivo = "archivo.txt";
		System.out.println(rutaArchivo);
		File archivo = new File(rutaArchivo);
		if(archivo.exists())
			System.out.println("Si existe");
		else 
			System.out.println("No existe");
		
		try {
			archivo.createNewFile();
			System.out.println("Archivo creado");
		} catch (IOException e) {
			e.printStackTrace();
		}
		//Borrar archivo
		//archivo.delete();
		
		//Imprimir la ruta del archivo
		System.out.println(archivo.getAbsolutePath());
		
		if(archivo.isFile())
			System.out.println("Es un archivo");
		
		System.out.println("Tamaño: "+archivo.length());
		
		File directorio = new File("C:/prueba/subcarpeta");
		if(directorio.isDirectory())
			System.out.println("Es un directorio");
		directorio.mkdir();	
	}
	
	public static void main(String[] args) {
		new EjemploFile();
	}

}
