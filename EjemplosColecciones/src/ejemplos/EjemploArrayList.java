package ejemplos;

import java.util.ArrayList;

public class EjemploArrayList {
	//Agregar
	//Acceder
	//Modificar
	//Eliminar
	private ArrayList<String> coleccion;
	
	public EjemploArrayList(){
		coleccion = new ArrayList<String>();
		coleccion.add("Elemento 1"); //0
		coleccion.add("Elemento 2"); //1
		coleccion.add("Elemento 3"); //2
		coleccion.add("Elemento 4"); //3  //2
		
		coleccion.remove(2);
		coleccion.set(2, "Ultimo elemento");
		
		for(int i=0;i<coleccion.size();i++){
			System.out.println("Valor " + i + ":" + coleccion.get(i));
		}
	}
	
	public static void main(String[] args) {
		new EjemploArrayList();
	}

}
