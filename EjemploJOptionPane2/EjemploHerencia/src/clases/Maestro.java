package clases;

public class Maestro extends Persona{
	protected String codigoEmpleado;
	protected double sueldo;
	
	public Maestro(String nombre,
			String apellido,
			int edad,
			String genero,
			String codigoEmpleado,
			double sueldo){
		super(nombre, apellido, edad, genero);
		this.codigoEmpleado =codigoEmpleado;
		this.sueldo = sueldo;		
	}

	public String getCodigoEmpleado() {
		return codigoEmpleado;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setCodigoEmpleado(String codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	@Override
	public void mostrarDatos(){
		System.out.println(nombre + "\t\t"+
				apellido + "\t\t"+
				edad + "\t\t"+
				genero + "\t\t"+
				codigoEmpleado + "\t\t"+
				sueldo);
	}	
}
