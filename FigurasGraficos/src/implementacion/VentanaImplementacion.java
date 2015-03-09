package implementacion;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JFrame;

import clases.Circulo;
import clases.Cuadrado;
import clases.Rectangulo;

public class VentanaImplementacion extends Canvas{
	private JFrame ventana;
	private final int ANCHO_VENTANA= 500;//Constante para el ancho de la ventana
	private final int ALTO_VENTANA = 350;//Constante para el alto de la ventana
	
	//Contenedores de figuras
	private ArrayList<Circulo> circulos= new ArrayList<Circulo>();
	private ArrayList<Rectangulo> rectangulos= new ArrayList<Rectangulo>();
	private ArrayList<Cuadrado> cuadrados= new ArrayList<Cuadrado>();
	
	public VentanaImplementacion(){
		ventana = new JFrame(); //Instanciacion de la ventana
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Definir que al hacer click en la X el programa finalice
		ventana.setSize(ANCHO_VENTANA, ALTO_VENTANA);//Establecer dimensiones
		ventana.setLocationRelativeTo(null);//Centrar la ventana en la pantalla
		ventana.setTitle("Titulo de la ventana"); //Establecer el titulo
		
		ventana.add(this); //Agregar canvas a la ventana
		//Instanciacion de figuras
		
		Circulo c1 = new Circulo(1,12,"123,45,77",true,20);
		Circulo c2 = new Circulo(14,12,"111,45,77",true,35);
		Circulo c3 = new Circulo(11,125,"222,45,123",false,25);
		circulos.add(c1);
		circulos.add(c2);
		circulos.add(c3);
		
		Rectangulo r1 = new Rectangulo(22,13,"156,123,111",true,300,100);
		Rectangulo r2 = new Rectangulo(30,200,"156,100,111",false,150,100);
		Rectangulo r3 = new Rectangulo(200,50,"20,123,111",false,30,100);
		rectangulos.add(r1);
		rectangulos.add(r2);
		rectangulos.add(r3);
		
		ventana.setVisible(true); //Mostrar ventana
	}
	
	public static void main(String[] args) {
		new VentanaImplementacion();
	}
	
	@Override
	public void paint(Graphics g){
		Graphics2D g2D = (Graphics2D)g;
		
		for(int i=0;i<circulos.size();i++){
			circulos.get(i).dibujar(g2D);
		}
		
		for(int i=0;i<rectangulos.size();i++){
			rectangulos.get(i).dibujar(g2D);
		}
	}

}
