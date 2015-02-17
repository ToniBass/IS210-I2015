package clases;
//POJO
public class Auto{
	public  String placa;
	private String color;
	private String marca;
	private String modelo;
	private int anio;
	private String motor;
	private String chasis;
	
	public static int valorEstatico = 20;
	public final int CONSTANTE = 100;
	
	public static final int MAX_VALUE = 100;
	
	public Auto(String placa,
			String color,
			String marca,
			String modelo,
			int anio,
			String motor,
			String chasis){
		this.placa = placa; 
		this.color = color;
		this.modelo = modelo;
		this.anio = anio;
		this.motor = motor;
		this.chasis = chasis;
	}
	
	public Auto(String placa){
		this.placa = placa;
	}
	
	public Auto(){}
	
	public static void mostrarMensaje(){
		System.out.println("Hola desde un metodo estatico");
	}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public String getChasis() {
		return chasis;
	}
	public void setChasis(String chasis) {
		this.chasis = chasis;
	}
}