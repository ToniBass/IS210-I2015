package clases;

public abstract class Figura {
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
	
	public abstract void dibujar();

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
