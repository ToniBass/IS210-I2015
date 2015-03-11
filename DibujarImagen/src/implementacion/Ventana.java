package implementacion;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Ventana extends Canvas{
	private JFrame ventana;
	private final int ANCHO_VENTANA= 600;//Constante para el ancho de la ventana
	private final int ALTO_VENTANA = 400;//Constante para el alto de la ventana
	
	//Imagenes
	BufferedImage mario;
	BufferedImage background;
	
	public Ventana(){
		cargarImagenes();
		ventana = new JFrame(); //Instanciacion de la ventana
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Definir que al hacer click en la X el programa finalice
		ventana.setSize(ANCHO_VENTANA, ALTO_VENTANA);//Establecer dimensiones
		ventana.setLocationRelativeTo(null);//Centrar la ventana en la pantalla
		ventana.setTitle("Titulo de la ventana"); //Establecer el titulo
		ventana.add(this); //Agregar canvas a la ventana
		ventana.setVisible(true); //Mostrar ventana
	}
	
	public void cargarImagenes(){
		try {
			mario = ImageIO.read(getClass().getResource("/recursos/mario.png"));
			background = ImageIO.read(getClass().getResource("/recursos/background.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
	public static void main(String[] args) {
		new Ventana();
	}
	
	@Override
	public void paint(Graphics g){
		Graphics2D g2D = (Graphics2D)g;
		g2D.drawImage(background,0,0,this);
		g2D.drawImage(mario,100,260,this);
	}

}
