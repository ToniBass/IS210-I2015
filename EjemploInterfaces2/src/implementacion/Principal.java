package implementacion;

import clases.ClasePrueba;

public class Principal {
	private ClasePrueba prueba;
	public Principal(){
		prueba = new ClasePrueba();
		prueba.metodoA();
		prueba.metodoB();
		prueba.metodoX();
		prueba.metodoY();
		System.out.println("Atributo Prueba: "+
					prueba.getAtributoPrueba());
		
	}
	
	public static void main(String[] args) {
		new Principal();
	}

}
