package implementacion;

import java.util.Scanner;

import clases.Alumno;

public class Principal{
	static Alumno alumnos[];
	static Scanner entrada = new Scanner(System.in);
	
	static void mostrarInformacion(){
		System.out.println("Datos de los alumnos registrados");
		System.out.println("Nombre\t\tNota Promedio");
		for(int i = 0;i<alumnos.length;i++){
			System.out.println(
					alumnos[i].getNombre()+"\t\t"+
					alumnos[i].getNotaPromedio()
					);
		}
	}
	
	static void ingresarAlumno(int indice){
		System.out.println("Nombre del Alumno " + indice + ":");
		alumnos[indice].setNombre(entrada.next());
		
		System.out.println("Nota Promedio: ");
		alumnos[indice].setNotaPromedio(entrada.nextDouble());
	}
	
	public static void main(String args[]){
		
		int cantidadAlumnos;
		
		System.out.println("Cuantos alumnos desea registrar?:");
		cantidadAlumnos = entrada.nextInt();
		alumnos = new Alumno[cantidadAlumnos];
		
		//Ingresar datos del alumno
		for(int i=0;i<alumnos.length;i++){
			alumnos[i] = new Alumno();
			ingresarAlumno(i);
		}
		
		mostrarInformacion();
		
		//Menu
		int opcion;
		int indiceModificar;
		do{
			System.out.println("1. Mostrar Informacion\n"
					+ "2. Modificar Informacion\n"
					+ "3. Salir");
			System.out.println("Que opcion desea: ");
			opcion = entrada.nextInt();
			
			switch(opcion){
				case 1:
					mostrarInformacion();
					break;
				case 2:
					System.out.println("Que alumno desea modificar 0 al " +
							(alumnos.length - 1));
					indiceModificar = entrada.nextInt();
					ingresarAlumno(indiceModificar);
					break;
			}
		}while(opcion!=3);
		System.err.println("Fin del programa");
		entrada.close();
	}
}
