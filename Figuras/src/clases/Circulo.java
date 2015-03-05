package clases;

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
	public void dibujar(){
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
