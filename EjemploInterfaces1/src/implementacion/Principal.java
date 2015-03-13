package implementacion;

import clases.ClasePrueba;

public class Principal {
	private ClasePrueba prueba1;
	public Principal(){
		prueba1 = new ClasePrueba();
		prueba1.metodoA();
		prueba1.metodoB();
		prueba1.metodoX();
		prueba1.metodoY();		
	}

	public static void main(String[] args) {
		new Principal();
	}

}
