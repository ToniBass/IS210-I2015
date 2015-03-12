package clases;

public class Vehiculo {
	protected String color;
	protected String marca;
	protected String modelo;
	
	public Vehiculo(String color, String marca, String modelo){
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public String toString(){
		return color+","+marca+","+modelo;
	}
}
