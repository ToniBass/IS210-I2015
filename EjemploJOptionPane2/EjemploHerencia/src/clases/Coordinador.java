package clases;

public class Coordinador extends Maestro{
	private String x;
	
	public Coordinador(String nombre,
			String apellido,
			int edad,
			String genero,
			String codigoEmpleado,
			double sueldo,
			String x){
		super(nombre,apellido,edad,genero,codigoEmpleado,sueldo);
		this.x = x;
		
	}
	public void mostrarDatos(){
		System.out.println(nombre+"\t\t"+codigoEmpleado);
	}
}
