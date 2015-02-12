package clases;

public class Computadora{
	private String marca;
	private String color;
	private int memoria;
	private int procesador;
	private String resolucion;
	
	//SET
	public void setMarca(String marca){
		this.marca = marca;
	}
	
	//GET
	public String getMarca(){
		return marca;
	}
	
	public void setColor(String colorParametro){
		color = colorParametro;
	}
	
	public String getColor(){
		return color;
	}
}