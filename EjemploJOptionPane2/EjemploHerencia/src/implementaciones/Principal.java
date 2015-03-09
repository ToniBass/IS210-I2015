package implementaciones;

import clases.Alumno;
import clases.Maestro;
import clases.Persona;

public class Principal {

	public Principal(){
		/*Alumno a = new Alumno();
		a.setNombre("Pedro");
		a.setApellido("Martinez");
		a.setEdad(20);
		a.setGenero("M");
		a.setCuenta("20061012125");
		a.setCarrera("Ing en sistemas");
		
		Maestro b = new Maestro();
		b.setNombre("Juan");
		b.setApellido("Mendez");
		b.setEdad(45);
		b.setGenero("M");
		b.setCodigoEmpleado("fss213213");
		b.setSueldo(5645.12);
		
		Persona c = new Persona();
		c.setNombre("Maria");
		c.setApellido("Gonzalez");
		c.setEdad(12);
		c.setGenero("F");
		*/
		
		Alumno a = new Alumno("Pedro","Martinez",
				20,"M","20061012125","Ing en sistemas");
		
		a.mostrarDatos();
		//b.mostrarDatos();
		//c.mostrarDatos();
		
	}
	
	public static void main(String[] args) {
		new Principal();

	}

}
