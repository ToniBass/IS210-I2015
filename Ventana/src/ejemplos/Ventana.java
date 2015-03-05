package ejemplos;

import javax.swing.JFrame;

public class Ventana{		
	private final int ANCHO_VENTANA= 500;//Constante para el ancho de la ventana
	private final int ALTO_VENTANA = 350;//Constante para el alto de la ventana
	private JFrame ventana; //Definicion de la ventana
	
	public Ventana(){		
		ventana = new JFrame(); //Instanciacion de la ventana
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Definir que al hacer click en la X el programa finalice
		//ventana.setSize(ANCHO_VENTANA, ALTO_VENTANA);//Establecer dimensiones
		ventana.setBounds(0, 0, 100, 100);
		//ventana.setLocationRelativeTo(null);//Centrar la ventana en la pantalla
		ventana.setAlwaysOnTop(true);
		//ventana.setResizable(false);
		ventana.setTitle("Titulo de la ventana"); //Establecer el titulo
		ventana.setVisible(true); //Mostrar ventana
	}

	public static void main(String[] args){
		new Ventana(); //Crear una instancia del formulario.
	}
}