package clases;

public class Cuadrado extends Rectangulo {
	private int lado;

	public Cuadrado(int posicionX, 
			int posicionY, 
			String color,
			boolean relleno, 
			int lado) {
		super(posicionX, posicionY, 
				color, relleno, lado, lado);
		this.lado = lado;
	}
	
	@Override
	public void dibujar(){
		System.out.println("Dibujar cuadrado");
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
}
