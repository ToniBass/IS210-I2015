package clases;

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
	public void dibujar(){
		System.out.println("Dibujar rectangulo");
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
