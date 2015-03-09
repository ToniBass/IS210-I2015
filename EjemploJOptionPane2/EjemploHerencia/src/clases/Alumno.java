package clases;

public class Alumno extends Persona{
	private String cuenta;
	private String carrera;
	
	public Alumno(String nombre,
				String apellido,
				int edad,
				String genero,
				String cuenta, 
				String carrera){
		super(nombre, apellido, edad, genero);
		this.cuenta = cuenta;
		this.carrera = carrera;
	}
	
	public String getCuenta() {
		return cuenta;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	@Override
	public void mostrarDatos(){
		System.out.println(nombre + "\t\t"+
				apellido + "\t\t"+
				edad + "\t\t"+
				genero + "\t\t"+
				cuenta + "\t\t"+
				carrera);
	}
}
