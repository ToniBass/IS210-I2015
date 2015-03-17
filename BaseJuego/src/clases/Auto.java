package clases;

import java.awt.Canvas;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class Auto {
	private int posicionX;
	private int posicionY;
	private String imagen;//Llave de referencia para el hashmap
	private int velocidad;
	
	
	public Auto(int posicionX, int posicionY, String imagen, int velocidad) {
		this.posicionX = posicionX;
		this.posicionY = posicionY;
		this.imagen = imagen;
		this.velocidad = velocidad;
	}
	
	public void mover(){
		if(posicionX<=650)//Condicion para que el vehiculo no avance hasta la posicionX 550
			posicionX+=velocidad;  
		else
			posicionX=-250;//Ubicar el auto al principio
	}
	
	public void pintar(Graphics2D g2D, BufferedImage imagen, Canvas canvas){
		g2D.drawImage(imagen, posicionX, posicionY, canvas);
	}
	
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	public int getPosicionX() {
		return posicionX;
	}
	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}
	public int getPosicionY() {
		return posicionY;
	}
	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
}
