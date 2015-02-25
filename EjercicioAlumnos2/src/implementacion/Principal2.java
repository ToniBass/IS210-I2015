package implementacion;

import java.util.Scanner;

import clases.Alumno;

public class Principal2{
	private Alumno alumnos[];
	private Scanner entrada = new Scanner(System.in);
	
	public Principal2(){
		int cantidadAlumnos;
		System.out.println("Cuantos alumnos desea registrar: ");
		cantidadAlumnos = entrada.nextInt(); 
		alumnos = new Alumno[cantidadAlumnos];//Tamaño
		for (int i = 0; i<alumnos.length; i++){
			alumnos[i] = new Alumno();
			ingresarAlumno(i);
		}
		
		mostrarDatos();
		
		int opcion;
		int indiceModificar;
		do{
			System.out.println("1. Mostrar Datos\n"+
								"2. Modicar Alumno\n"+
								"3. Salir");
			System.out.println("Que opcion desea: ");
			opcion = entrada.nextInt();
			
			switch(opcion){
				case 1:
					mostrarDatos();
					break;
				case 2:
					System.out.println("Que alumno desea modifica del 0 al "+ (alumnos.length-1));
					indiceModificar = entrada.nextInt();
					ingresarAlumno(indiceModificar);
					break;
			}
		}while(opcion!=3);
		
		System.err.println("Fin del programa");
		entrada.close();
	}
	
	public void mostrarDatos(){
		System.out.println("Datos de los alumnos registrados");
		System.out.println("Nombre\t\tNota Promedio");
		for(int i = 0; i<alumnos.length; i++){
			System.out.println(alumnos[i].getNombre() + "\t\t"+
			alumnos[i].getNotaPromedio());
		}
	}
	
	public void ingresarAlumno(int indice){
		System.out.println("Nombre Alumno " + indice + ": ");
		alumnos[indice].setNombre(entrada.next());
		
		System.out.println("Nota promedio: ");
		alumnos[indice].setNotaPromedio(entrada.nextDouble());
	}
	
	public static void main(String args[]){
		new Principal2();
	}
}