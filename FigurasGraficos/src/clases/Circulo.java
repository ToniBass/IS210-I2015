package clases;

import java.awt.Color;
import java.awt.Graphics2D;

public class Circulo extends Figura {
	private int radio;
	
	public Circulo(int posicionX, 
			int posicionY, 
			String color, 
			boolean relleno,
			int radio) {
		super(posicionX, posicionY, color, relleno);
		this.radio = radio;
	}

	@Override
	public void dibujar(Graphics2D g2D){
		/*int[] codigoColor = obtenerRGB();
		g2D.setColor(new Color(codigoColor[0],codigoColor[1],codigoColor[2]));*/
		if (relleno)
			g2D.fillOval(posicionX, posicionY, radio*2, radio*2);
		else
			g2D.drawOval(posicionX, posicionY, radio*2, radio*2);
		
		System.out.println("Dibujar circulo en la posicion "+
					posicionX+","+posicionY);
	}
	
	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}
}
