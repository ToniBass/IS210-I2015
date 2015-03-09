package ejemplos;

import javax.swing.JOptionPane;

public class EjemploJOptionPane {
	private String nombre;
	private int edad;

	public EjemploJOptionPane(){
		nombre = JOptionPane.showInputDialog("Ingrese su nombre","Pedro");
		JOptionPane.showMessageDialog(null, "Hola " + nombre);
		
		edad = Integer.valueOf(JOptionPane.showInputDialog("Edad:"));
		JOptionPane.showMessageDialog(null, "Edad: " + edad,"Este es el titulo",JOptionPane.ERROR_MESSAGE);
	}
	
	public static void main(String args[]){
		new EjemploJOptionPane();
	}
}
