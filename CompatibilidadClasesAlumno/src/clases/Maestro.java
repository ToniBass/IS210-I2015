package clases;

public class Maestro extends Persona{
	private double sueldo;

	public Maestro(String nombre, 
			String apellido, 
			int edad, 
			double sueldo) {
		super(nombre, apellido, edad);
		this.sueldo = sueldo;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public String toString(){
		return super.toString() +","+sueldo;
	}
}
