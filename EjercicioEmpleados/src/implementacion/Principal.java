package implementacion;

import java.util.Scanner;

import clases.Empleado;
import clases.Fecha;

public class Principal{
	static Scanner entrada = new Scanner(System.in);
	static Empleado empleados[];
	
	public static void mostrarDatos(Empleado empleados[]){
		System.out.println("---------------------------------------------------------------");
		System.out.println("A continuacion se muestra los registros previamente ingresados:");
		for (int i = 0; i < empleados.length; i++){
			System.out.print((i+1) + "\t");
			System.out.println(
					empleados[i].obtenerNombreCompleto() + "\t" +
					empleados[i].obtenerGenero() + "\t" +
					empleados[i].obtenerEdad() + "\t" +
					empleados[i].obtenerProfesion() + "\t" +
					empleados[i].obtenerFechaIngreso() + "\t" +
					empleados[i].obtenerSueldoBase() + "\t" +
					empleados[i].obtenerImpuestoSobreLaRenta() + "\t" +
					empleados[i].obtenerSeguroDeVida()
			);
		}
	}
	
	public static void ingresarEmpleado(int indice){
		System.out.println("-----------------------");
		System.out.println("Datos del empleado #" + (indice+1));
				
		System.out.print("Nombre: ");
		empleados[indice].establecerNombre(entrada.next());			
		
		System.out.print("Apellido: ");
		empleados[indice].establecerApellido(entrada.next());
		
		System.out.print("Genero: ");
		empleados[indice].establecerGenero(entrada.next());
		
		System.out.print("Edad: ");
		empleados[indice].establecerEdad(entrada.nextInt());
		
		System.out.print("Profesion: ");
		empleados[indice].establecerProfesion(entrada.next());
		
		System.out.print("Fecha de ingreso (formato DD/MM/YYYY): ");
		Fecha fechaIngreso = new Fecha(entrada.next());
		empleados[indice].establecerFechaIngreso(fechaIngreso);
		
		System.out.print("Sueldo base: ");
		empleados[indice].establecerSueldoBase(entrada.nextDouble());
		
		System.out.print("Impuestos sobre la renta: ");
		empleados[indice].establecerImpuestoSobreLaRenta(entrada.nextDouble());
		
		System.out.print("Seguro de vida: ");
		empleados[indice].establecerSeguroDeVida(entrada.nextDouble());
	}
	
	//Metodo main
	public static void main(String[] args){
		//Declaracion de variables
		int cantidadEmpleados;
		
		System.out.println("Cuantos empleados desea registrar:");
		cantidadEmpleados = entrada.nextInt();
		
		empleados = new Empleado[cantidadEmpleados];//No se instancia
		
		for (int i = 0; i < empleados.length; i++){
			empleados[i] = new Empleado(); //Instancia
			ingresarEmpleado(i);
		}		
		mostrarDatos(empleados);	
	
		
		int opcion = 0;
		int empleadoModificar;
		do{
			System.out.println("---------MENU---------");
			System.out.println("1 Mostrar Empleados");
			System.out.println("2 Modificar datos de Empleados");
			System.out.println("3 Salir");
			
			opcion = entrada.nextInt();
			
			switch  (opcion){
				case 1: //Opcion para mostrar la lista de empleados.
					mostrarDatos(empleados);
					break;
				case 2: //Opcion para modificar la lista de empleados.
					System.out.println("Que empleado del 0 al "+ (cantidadEmpleados-1) +" quiere modificar? ");
					empleadoModificar = entrada.nextInt();
					
					ingresarEmpleado(empleadoModificar);
					break;
			}
		} while (opcion != 3);
		System.out.println("Fin del programa");
		entrada.close();
	}
}