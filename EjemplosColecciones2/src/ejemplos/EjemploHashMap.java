package ejemplos;

import java.util.HashMap;

public class EjemploHashMap {
	private HashMap<Integer, String> coleccion;
	public EjemploHashMap(){
		coleccion = new HashMap<Integer, String>();
		coleccion.put(0, "Hola");
		coleccion.put(2, "Mundo");
		coleccion.put(3, "Pedro");
		
		
		System.out.println(coleccion.get("valor 1") + " " +
							coleccion.get("valor 2"));
		
	}
	
	public static void main(String[] args) {
		new EjemploHashMap();
	}

}
