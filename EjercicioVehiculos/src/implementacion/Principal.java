package implementacion;

import java.util.ArrayList;

import clases.Bicicleta;
import clases.Carro;
import clases.Vehiculo;

public class Principal{
	private Vehiculo v1;
	private Vehiculo v2;
	private Vehiculo v3;
	private Carro c1;
	private Carro c2;
	private Carro c3;
	private Bicicleta b1;
	private Bicicleta b2;
	private ArrayList<Vehiculo> vehiculos; 
	
	
	public Principal(){
		vehiculos = new ArrayList<Vehiculo>();
		v3 = new Vehiculo("Amarillo","Patito","X");
		
		c1 = new Carro("Verde","Toyota","Prado","PDK1231","43534lkjl",123213,"Gasolina");
		c2 = new Carro("Rojo","Toyota","Corola","PDK11111","313213213",6666555,"Gasolina");
		
		b1 = new  Bicicleta("Anaranjada","Bacini","M3","21321","estiloX");
		b2 = new  Bicicleta("Rosada","Bacini","M5","15644","estiloY");
		
		//Hacer cast de clases hijas a clases padre
		v1 = (Vehiculo)c1;//Hija->Padre
		//c3 = (Carro)v3;//Padre->Hijo No se puede hacer el cast
		
		
		//Instanciar objetos de clases padre utilizando
		//Constructores de clases hijas
		v2 = new Carro("Morado","Honda","Pilot","PDG123","14444",123,"Gasolina");
		
		//Almacenar objetos tanto de clases hijas como padres
		//dentro de una coleccion.
		vehiculos.add(v1);
		vehiculos.add(v2);
		vehiculos.add(v3);
		vehiculos.add(c1);
		vehiculos.add(c2);
		vehiculos.add(b1);
		vehiculos.add(b2);
		
		for(int i = 0; i<vehiculos.size();i++){
			System.out.println(vehiculos.get(i).toString());
		}
	}
	
	public static void main(String args[]){
		new Principal();
	}
}
