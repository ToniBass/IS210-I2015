package clases;

public class Alumno {
	private String cuenta;
	private String nombre;
	private String apellido;
	private int edad;
	private String genero;
	
	public Alumno(String cuenta, String nombre, String apellido, int edad,
			String genero) {
		this.cuenta = cuenta;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.genero = genero;
	}
	
	public String getCuenta() {
		return cuenta;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public int getEdad() {
		return edad;
	}
	public String getGenero() {
		return genero;
	}
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String toString(){
		return cuenta + "\t\t" + nombre + "\t\t" 
				+ apellido + "\t\t" + edad + "\t\t" +
				genero;
	}
	
}
