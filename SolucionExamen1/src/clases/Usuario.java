package clases;

public class Usuario{
	private String nombre;
	private String nombreUsuario;
	private String correo;
	
	public Usuario(String nombre, String nombreUsuario, String correo) {
		this.nombre = nombre;
		this.nombreUsuario = nombreUsuario;
		this.correo = correo;
	}
	
	public Usuario(){}
	
	public String getNombre() {
		return nombre;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public String getCorreo() {
		return correo;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
}