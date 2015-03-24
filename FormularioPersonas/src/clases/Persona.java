package clases;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	private String genero;
	
	public Persona(String nombre, 
			String apellido, 
			int edad, 
			String genero) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.genero = genero;
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
}
