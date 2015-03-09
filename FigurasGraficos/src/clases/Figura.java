package clases;

import java.awt.Graphics2D;

public class Figura {
	protected int posicionX;
	protected int posicionY;
	protected String color;
	protected boolean relleno;
	
	public Figura(int posicionX, 
			int posicionY, 
			String color, 
			boolean relleno) {
		this.posicionX = posicionX;
		this.posicionY = posicionY;
		this.color = color;
		this.relleno = relleno;
	}
	
	public void dibujar(Graphics2D g2D){}
	
	public int[] obtenerRGB(){
		String partes[] = this.color.split(",");
		int[] coloresRGB = new int[3];
		coloresRGB[0] = Integer.valueOf(partes[0]);
		coloresRGB[1] = Integer.valueOf(partes[1]);
		coloresRGB[2] = Integer.valueOf(partes[2]);
		return coloresRGB;
	}

	public int getPosicionX() {
		return posicionX;
	}

	public int getPosicionY() {
		return posicionY;
	}

	public String getColor() {
		return color;
	}

	public boolean isRelleno() {
		return relleno;
	}

	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}

	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setRelleno(boolean relleno) {
		this.relleno = relleno;
	}
	
}
