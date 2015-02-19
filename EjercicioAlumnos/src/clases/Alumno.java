package clases;

public class Alumno{
	private String nombre;
	private double notaPromedio;
	
	public Alumno(String nombre, double notaPromedio){
		this.nombre = nombre;
		this.notaPromedio = notaPromedio;
	}
	
	public Alumno(){}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getNotaPromedio() {
		return notaPromedio;
	}
	public void setNotaPromedio(double notaPromedio) {
		this.notaPromedio = notaPromedio;
	}
}