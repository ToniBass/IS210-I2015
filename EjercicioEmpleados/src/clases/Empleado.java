package clases;

public class Empleado{
	private String nombre;
	private String apellido;
	private String genero;
	private int edad;
	private String profesion;
	private Fecha fechaIngreso;
	private double sueldoBase;
	private double impuestoSobreLaRenta;
	private double seguroDeVida;
	
	//Metodos establecer (sets)
	public void establecerNombre(String nombre){
		this.nombre = nombre;
	}
	
	public void establecerApellido(String apellido){
		this.apellido = apellido;
	}
	
	public void establecerGenero(String genero){
		this.genero = genero;
	}
	
	public void establecerEdad(int edad){
		this.edad = edad;
	}
	
	public void establecerProfesion(String profesion){
		this.profesion = profesion;
	}
	
	public void establecerFechaIngreso(Fecha fechaIngreso){
		this.fechaIngreso = fechaIngreso;
	}
	
	public void establecerSueldoBase(double sueldoBase){
		this.sueldoBase = sueldoBase;
	}
	
	public void establecerImpuestoSobreLaRenta(double impuestoSobreLaRenta){
		this.impuestoSobreLaRenta = impuestoSobreLaRenta;
	}
	
	public void establecerSeguroDeVida(double seguroDeVida){
		this.seguroDeVida = seguroDeVida;
	}
	
	//Metodos obtener (gets)
	public String obtenerNombre(){
		return this.nombre;
	}
	
	public String obtenerApellido(){
		return this.apellido;
	}
	
	public String obtenerGenero(){
		return this.genero;
	}
	
	public int obtenerEdad(){
		return this.edad;
	}
	
	public String obtenerProfesion(){
		return this.profesion;
	}
	
	public String obtenerFechaIngreso(){
		return this.fechaIngreso.toString();
	}
	
	public double obtenerSueldoBase(){
		return this.sueldoBase;
	}
	
	public double obtenerImpuestoSobreLaRenta(){
		return this.impuestoSobreLaRenta;
	}
	
	public double obtenerSeguroDeVida(){
		return this.seguroDeVida;
	}
	
	//Calculo de sueldo Neto
	public double obtenerSueldoNeto(){
		return sueldoBase - (impuestoSobreLaRenta + seguroDeVida);
	}
	
	public String obtenerNombreCompleto(){
		return nombre + " " + apellido;
	}
}
