package ejemplos;

import java.util.ArrayList;

public class EjemploArrayList {
	private ArrayList<String> coleccion;
	private ArrayList<Integer> enteros;
	
	
	public EjemploArrayList(){
		coleccion = new ArrayList<String>();
		enteros = new ArrayList<Integer>();
		
		enteros.add(5);
		
		coleccion.add("Elemento 1"); //0
		coleccion.add("Elemento 2"); //1
		coleccion.add("Elemento 3"); //2
		coleccion.add("Elemento 4"); //3 //2
		
		coleccion.remove(2);
		coleccion.set(2, "Ultima linea");
		
		for(int i=0; i < coleccion.size();i++){
			System.out.println(coleccion.get(i));
		}
		
	}
	
	public static void main(String[] args) {
		new EjemploArrayList();
	}

}
