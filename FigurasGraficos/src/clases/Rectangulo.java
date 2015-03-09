package clases;

import java.awt.Color;
import java.awt.Graphics2D;

public class Rectangulo extends Figura {
	protected int largo;
	protected int ancho;
	
	public Rectangulo(int posicionX, 
			int posicionY, 
			String color,
			boolean relleno, 
			int largo, 
			int ancho) {
		super(posicionX, posicionY, color, relleno);
		this.largo = largo;
		this.ancho = ancho;
	}
	
	@Override
	public void dibujar(Graphics2D g2D){
		/*int[] codigoColor = obtenerRGB();
		g2D.setColor(new Color(codigoColor[0],codigoColor[1],codigoColor[2]));*/
		if (relleno)
			g2D.fillRect(posicionX, posicionY, largo, ancho);
		else 
			g2D.drawRect(posicionX, posicionY, largo, ancho);
		
		System.out.println("Dibujar rectangulo en la posicion  "+
				posicionX +","+ posicionY);
	}
	
	public int getLargo() {
		return largo;
	}
	public int getAncho() {
		return ancho;
	}
	public void setLargo(int largo) {
		this.largo = largo;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}	
}
