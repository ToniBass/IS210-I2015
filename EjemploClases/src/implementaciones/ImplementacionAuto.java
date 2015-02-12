package implementaciones;

import clases.Auto;

public class ImplementacionAuto{
	public static void main(String args[]){
		Auto a = new Auto();
		int b[] = new int[5]; //No se instancia
		Auto autos[] = new Auto[5];
		autos[0] = new Auto(); //Instanciacion
		autos[1] = new Auto(); //Instanciacion
		autos[2] = new Auto(); //Instanciacion
		
		autos[0].setMarca("Toyota");
		System.out.println("Marca elemento 0: "+ 
				autos[0].getMarca());
	}
}