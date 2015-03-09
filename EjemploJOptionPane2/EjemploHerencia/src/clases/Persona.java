package clases;

public class Persona{
	protected String nombre;
	protected String apellido;
	protected int edad;
	protected String genero;
	
	public Persona(String nombre,
					String apellido,
					int edad,
					String genero){
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.genero = genero;
	}
	
	public Persona(){
		
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
	
	public void mostrarDatos(){
		System.out.println(nombre + "\t\t"+
							apellido + "\t\t"+
							edad + "\t\t"+
							genero + "\t\t");
	}
}
