package clases;

public class Video{
	private String nombreVideo;
	private Usuario usuario;
	private String tiempo;
	private String resolucion;
	private int megabytes;
	private String formato;
	
	public boolean verificarTiempo(){
		String partes[] = tiempo.split(":"); //HH:MM:SS
		if (Integer.valueOf(partes[1])<0 ||Integer.valueOf(partes[1])>60)
			return false;
		if (Integer.valueOf(partes[2])<0 ||Integer.valueOf(partes[1])>60)
			return false;
		
		return true;
	}
	
	public boolean verificarResolucion(){
		String partes[] = resolucion.split("x"); //1024x768
		if(partes.length!=2)
			return false;
		else
			return true;
	}
	
	public boolean verificarTamanio(){
		if (megabytes>25)
			return false;
		return true;
	}
	
	public String getNombreVideo() {
		return nombreVideo;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public String getTiempo() {
		return tiempo;
	}
	public String getResolucion() {
		return resolucion;
	}
	public int getMegabytes() {
		return megabytes;
	}
	public String getFormato() {
		return formato;
	}
	public void setNombreVideo(String nombreVideo) {
		this.nombreVideo = nombreVideo;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public void setTiempo(String tiempo) {
		this.tiempo = tiempo;
	}
	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}
	public void setMegabytes(int megabytes) {
		this.megabytes = megabytes;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	
}