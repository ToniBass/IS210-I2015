package clases;

public class Tweet{
	private String mensaje;
	private Fecha fechaPublicacion;
	private Usuario usuario;
	private boolean tieneImagen;
	private String urlImagen;

	public Tweet(String mensaje, Fecha fechaPublicacion, Usuario usuario,
			boolean tieneImagen, String urlImagen) {
		this.mensaje = mensaje;
		this.fechaPublicacion = fechaPublicacion;
		this.usuario = usuario;
		this.tieneImagen = tieneImagen;
		this.urlImagen = urlImagen;
	}
	
	public Tweet(){}
	
	public boolean verificarMensaje(){
		if (mensaje.length()>140)
			return false;
		else
			return true;
	}
	
	public String getMensaje() {
		return mensaje;
	}
	public Fecha getFechaPublicacion() {
		return fechaPublicacion;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public boolean getTieneImagen() {
		return tieneImagen;
	}
	public String getUrlImagen() {
		return urlImagen;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public void setFechaPublicacion(Fecha fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public void setTieneImagen(boolean tieneImagen) {
		this.tieneImagen = tieneImagen;
	}
	public void setUrlImagen(String urlImagen) {
		this.urlImagen = urlImagen;
	}
	
	
}