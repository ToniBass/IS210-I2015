package ejemplos;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

/* Definicion de la clase principal, con extends la clase principal 
 * se convierte en un Canvas, hereda todas las propiedades y atributos.
 * Herencia es un tema de la unidad II.
 * 
 */

public class EjemploGraficos extends Canvas{
	private JFrame ventana; //Declaracion de una ventana grafica
	public EjemploGraficos(){		
		ventana = new JFrame(); //Instanciacion de la ventana
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Si el usuario da click sobre la X de la ventana el programa finaliza.
		ventana.setSize(600, 600); //Establecer las dimensiones ANCHO, ALTO
		ventana.setLocationRelativeTo(null); //Centrar la ventana
		ventana.setTitle("Ejemplo Graphics2D"); //Establecer el titulo
		ventana.setVisible(true); //Mostrar la ventana
		
		ventana.add(this);		//Agregar la clase EjemploGraficos a la ventana,  
	}							//recuerde que esta clase se convirtio en un canvas al utilizar extends

	/*
	 * El metodo paint es llamado al momento de dibujar la ventana.
	 * utiliza un objeto del tipo Graphics el cual es utilizado para dibujar sobre una superficie.
	 * No es necesario crear una instancia de la clase Graphics.
	 * 
	 */
	public void paint(Graphics g){ 	
		
		Graphics2D g2D = (Graphics2D)g; //Se recibe un objeto del tipo Graphics, se hace un cast o conversion a la clase Graphics2D		
		g2D.setColor(Color.BLACK);//Se define el color de contexto como Negro, todo lo que se dibuje de aqui en adelante ser de color negro		
		g2D.fillRect(0, 0, 600, 600);//Dibujar un rectangulo en las coordenadas x=0,y=0 con las dimensiones ancho = 600 y alto = 600		
		g2D.setColor(Color.WHITE);//Se redefine el color de contexto como Blanco, todo lo que se dibuje de aqui en adelante ser de color negro		
		g2D.drawString("Hola Mundo",100,100);//Se dibuja la frase "Hola Mundo" en las coordenadas x=100 y=100		
		g2D.drawRoundRect(10, 10, 30, 30, 5, 5);//Se dibuja un rectangulo con las esquinas redondeadas en las coordenadas 10,10 con dimensiones 30,30 y con angulos de redondeo 5,5
	}
	public static void main(String[] args){
		new EjemploGraficos(); //Crear una instancia de la clase EjemploGraficos para poder inicializar la ventana.
	}
}