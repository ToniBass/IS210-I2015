package clases;

import java.awt.Color;
import java.awt.Graphics2D;

public class Cuadrado extends Rectangulo {
	private int lado;

	public Cuadrado(int posicionX, 
			int posicionY, 
			String color,
			boolean relleno, 
			int lado){
		super(posicionX, posicionY, 
				color, relleno, lado, lado);
		this.lado = lado;
	}
	
	@Override
	public void dibujar(Graphics2D g2D){
		/*int[] codigoColor = obtenerRGB();
		g2D.setColor(new Color(codigoColor[0],codigoColor[1],codigoColor[2]));*/
		if (relleno)
			g2D.fillRect(posicionX, posicionY, lado, lado);
		else 
			g2D.drawRect(posicionX, posicionY, lado, lado);
		
		System.out.println("Dibujar cuadrado en la posicion "+
				posicionX +","+ posicionY);
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
}
