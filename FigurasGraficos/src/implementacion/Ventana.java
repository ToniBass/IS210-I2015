package implementacion;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

public class Ventana extends Canvas{
	private JFrame ventana;
	private final int ANCHO_VENTANA= 500;//Constante para el ancho de la ventana
	private final int ALTO_VENTANA = 350;//Constante para el alto de la ventana
	public Ventana(){
		ventana = new JFrame(); //Instanciacion de la ventana
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Definir que al hacer click en la X el programa finalice
		ventana.setSize(ANCHO_VENTANA, ALTO_VENTANA);//Establecer dimensiones
		ventana.setLocationRelativeTo(null);//Centrar la ventana en la pantalla
		ventana.setTitle("Titulo de la ventana"); //Establecer el titulo
		
		ventana.add(this); //Agregar canvas a la ventana
		
		ventana.setVisible(true); //Mostrar ventana
	}
	
	public static void main(String[] args) {
		new Ventana();
	}
	
	@Override
	public void paint(Graphics g){
		Graphics2D g2D = (Graphics2D)g;		
		g2D.setColor(new Color(12,126,255));
		g2D.drawString("Hola Mundo", 10, 100);
		//Figuras solo con contorno
		g2D.drawRect(100, 100, 100, 200);
		g2D.drawOval(100, 100, 100, 200);
		//Figuras con Relleno
		g2D.setColor(Color.BLUE);
		g2D.fillOval(200, 200, 100, 100);
	}

}
