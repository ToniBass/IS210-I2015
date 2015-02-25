package ejemplos;

import java.util.HashMap;

public class EjemploHashMap {
	private HashMap<String, String> coleccion;

	public EjemploHashMap(){
		coleccion = new HashMap<String,String>();
		
		coleccion.put("valor 1", "Hola");
		coleccion.put("valor 2", "Mundo");
		coleccion.put("valor 2", "Pedro");
		
		
		System.out.println(coleccion.get("valor 1") + " " + 
					coleccion.get("valor 2"));
	}
	
	public static void main(String[] args) {
		new EjemploHashMap();
	}

}
