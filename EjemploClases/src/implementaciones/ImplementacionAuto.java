package implementaciones;

import clases.Auto;

public class ImplementacionAuto{
	public static void main(String args[]){
		Auto x = new Auto();
		Auto a = new Auto("PDV2134",
				"Azul",
				"Toyota",
				"Prado",
				2015,
				"453453450",
				"45lklkfdgdf");//Instanciacion
		
		
		System.out.println(a.getModelo());
		int b[] = new int[5]; //No se instancia
		
		Auto autos[] = new Auto[5];
		autos[0] = new Auto("PDV4562"); //Instanciacion
		autos[1] = new Auto("PDV4562"); //Instanciacion
		autos[2] = new Auto("PDV4562"); //Instanciacion
		
		autos[0].setMarca("Toyota");
		System.out.println("Marca elemento 0: "+ 
				autos[0].getMarca());
		
		//Llamado a metodo estatico
		a.mostrarMensaje();
		Auto.mostrarMensaje();
		
	}
}