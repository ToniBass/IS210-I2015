package clases;

public class Usuario{
	private String usuario;
	private String nombre;
	private String apellido;
	private int edad;
	private String genero;
	private String correo;
	
	public Usuario(String usuario,
			String nombre,
			String apellido,
			int edad,
			String genero,
			String correo){
		this.usuario = usuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.genero = genero;
		this.correo = correo;
	}
	
	public Usuario(){}
	
	public Usuario(String nombre,String apellido){
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public String nombreCompleto(){
		return nombre + " " + apellido + "[[" + usuario +"]]";	
	}
	
	public String getUsuario() {
		return usuario;
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
	public String getCorreo() {
		return correo;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
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
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
}