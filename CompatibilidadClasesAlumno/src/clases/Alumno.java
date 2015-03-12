package clases;

public class Alumno extends Persona{
	private String carrera;

	public Alumno(String nombre, 
			String apellido, 
			int edad, String carrera) {
		super(nombre, apellido, edad);
		this.carrera = carrera;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public String toString(){
		return super.toString() +","+carrera;
	}
}
