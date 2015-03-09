package ejemplos;

import javax.swing.JOptionPane;

public class EjemploJOptionPane {
	private String nombre;
	private int edad;
	public EjemploJOptionPane(){
		nombre = JOptionPane.showInputDialog("Ingrese su nombre","Pedro");
		JOptionPane.showMessageDialog(null, "Hola "+nombre,
				"Este es el titulo",JOptionPane.ERROR_MESSAGE);
		
		edad = Integer.valueOf(JOptionPane.showInputDialog("Edad: "));
		JOptionPane.showMessageDialog(null, "Edad: " + edad);
		
		
	}
	
	public static void main(String args[]){
		new EjemploJOptionPane();
	}
}
