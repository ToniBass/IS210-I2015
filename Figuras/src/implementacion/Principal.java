package implementacion;

import java.util.ArrayList;

import clases.Circulo;
import clases.Cuadrado;
import clases.Rectangulo;

public class Principal {
	private ArrayList<Circulo> circulos= new ArrayList<Circulo>();
	private ArrayList<Rectangulo> rectangulos= new ArrayList<Rectangulo>();
	private ArrayList<Cuadrado> cuadrados= new ArrayList<Cuadrado>();
	
	public Principal(){
		Circulo c1 = new Circulo(1,12,"123,45,77",true,20);
		Circulo c2 = new Circulo(14,12,"111,45,77",true,35);
		Circulo c3 = new Circulo(11,125,"222,45,123",false,25);
		
		circulos.add(c1);
		circulos.add(c2);
		circulos.add(c3);
		
		for (int i = 0; i< circulos.size(); i++){
			circulos.get(i).dibujar();
		}
		
	}
	public static void main(String[] args) {
		new Principal();
	}

}
