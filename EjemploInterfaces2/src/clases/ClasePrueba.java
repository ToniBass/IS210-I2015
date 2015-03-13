package clases;

import interfaces.InterfazA;
import interfaces.InterfazX;

public class ClasePrueba extends ClasePadre implements InterfazA, InterfazX{
	
	@Override
	public void metodoX() {
		System.out.println("Metodo X");
	}

	@Override
	public void metodoY() {
		System.out.println("Metodo Y");
	}

	@Override
	public void metodoA() {
		System.out.println("Metodo A");
	}

	@Override
	public void metodoB() {
		System.out.println("Metodo B");
	}

}
