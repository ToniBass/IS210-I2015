package implementacion;

import java.util.ArrayList;

import clases.Alumno;
import clases.Maestro;
import clases.Persona;

public class Principal {
	private Alumno a1;
	private Alumno a2;
	private Alumno a3;
	private Maestro m1;
	private Maestro m2;
	private Maestro m3;
	
	private ArrayList<Persona> personas;
	
	public Principal(){
		personas = new ArrayList<Persona>();
		
		a1 = new Alumno("Juan","Perez",16,"Ing Sistemas");
		a2 = new Alumno("Pedro","Dominguez",20,"Ing Sistemas");
		a3 = new Alumno("Carlos","Meza",20,"Ing Quimica");
		
		m1 = new Maestro("Maria","Dominguez",70,3213);
		m2 = new Maestro("Laura","Perez",66,88132);
		m3 = new Maestro("Mario","Mendez",30,92132);
		
		personas.add(a1);
		personas.add(m3);
		personas.add(a3);
		personas.add(m1);
		personas.add(a2);
		personas.add(m2);
		
		mostrarAlumnos();
		mostrarMaestros();
	}
	
	public void mostrarAlumnos(){
		System.out.println("-----Listado de alumnos-----");
		for(int i = 0;i<personas.size();i++){
			if(personas.get(i) instanceof Alumno)
				System.out.println(personas.get(i).toString());
		}
	}
	public void mostrarMaestros(){
		System.out.println("-----Listado de maestros-----");
		for(int i = 0;i<personas.size();i++){
			if(personas.get(i) instanceof Maestro)
				System.out.println(personas.get(i).toString());
		}
	}
	
	public static void main(String[] args) {
		new Principal();
	}

}
