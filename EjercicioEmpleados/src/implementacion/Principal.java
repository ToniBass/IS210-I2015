package implementacion;

import java.util.Scanner;

import clases.Empleado;
import clases.Fecha;

public class Principal{
	//Metodo main
	public static void main(String[] args){
		//Declaracion de variables
		int cantidadEmpleados;
		Empleado empleados[];
		Scanner entrada;
		
		entrada = new Scanner(System.in);
		
		System.out.println("Cuantos empleados desea registrar:");
		cantidadEmpleados = entrada.nextInt();
		
		
		empleados = new Empleado[cantidadEmpleados];//No se instancia
		for (int i = 0; i < cantidadEmpleados; i++){
			System.out.println("-----------------------");
			System.out.println("Datos del empleado #" + (i+1));
			empleados[i] = new Empleado(); //Instancia
			
			System.out.print("Nombre: ");
			empleados[i].establecerNombre(entrada.next());			
			
			System.out.print("Apellido: ");
			empleados[i].establecerApellido(entrada.next());
			
			System.out.print("Genero: ");
			empleados[i].establecerGenero(entrada.next());
			
			System.out.print("Edad: ");
			empleados[i].establecerEdad(entrada.nextInt());
			
			System.out.print("Profesion: ");
			empleados[i].establecerProfesion(entrada.next());
			
			System.out.print("Fecha de ingreso (formato DD/MM/YYYY): ");
			Fecha fechaIngreso = new Fecha(entrada.next());
			empleados[i].establecerFechaIngreso(fechaIngreso);
			
			System.out.print("Sueldo base: ");
			empleados[i].establecerSueldoBase(entrada.nextDouble());
			
			System.out.print("Impuestos sobre la renta: ");
			empleados[i].establecerImpuestoSobreLaRenta(entrada.nextDouble());
			
			System.out.print("Seguro de vida: ");
			empleados[i].establecerSeguroDeVida(entrada.nextDouble());
		}
		
		System.out.println("---------------------------------------------------------------");
		System.out.println("A continuacion se muestra los registros previamente ingresados:");
		for (int i = 0; i < cantidadEmpleados; i++){
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
					//Esta seccion de codigo puede ser encapsulada en un metodo para ahorrar lineas de codigo.
					System.out.println("---------------------------------------------------------------");
					System.out.println("A continuacion se muestra los registros previamente ingresados:");
					for (int i = 0; i < cantidadEmpleados; i++){
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
					break;
				case 2: //Opcion para modificar la lista de empleados.
					System.out.println("Que empleado del 0 al "+ (cantidadEmpleados-1) +" quiere modificar? ");
					empleadoModificar = entrada.nextInt();
					
					//El siguiente codigo puede ser encapsulado para minimizar la2s lineas de codigo
					System.out.println("Datos del empleado #" + (empleadoModificar + 1));
					empleados[empleadoModificar] = new Empleado();
					
					System.out.print("Nombre: ");
					empleados[empleadoModificar].establecerNombre(entrada.next());			
					
					System.out.print("Apellido: ");
					empleados[empleadoModificar].establecerApellido(entrada.next());
					
					System.out.print("Genero: ");
					empleados[empleadoModificar].establecerGenero(entrada.next());
					
					System.out.print("Edad: ");
					empleados[empleadoModificar].establecerEdad(entrada.nextInt());

					
					System.out.print("Profesion: ");
					empleados[empleadoModificar].establecerProfesion(entrada.next());
					
					System.out.print("Fecha de ingreso (formato DD/MM/YYYY): ");
					Fecha fechaIngreso = new Fecha(entrada.next());
					empleados[empleadoModificar].establecerFechaIngreso(fechaIngreso);
						
					System.out.print("Sueldo base: ");
					empleados[empleadoModificar].establecerSueldoBase(entrada.nextDouble());
					
					System.out.print("Impuestos sobre la renta: ");
					empleados[empleadoModificar].establecerImpuestoSobreLaRenta(entrada.nextDouble());
					
					System.out.print("Seguro de vida: ");
					empleados[empleadoModificar].establecerSeguroDeVida(entrada.nextDouble());
					
					System.out.println("Los datos fueron modificados\n\n");
					break;
			}
		} while (opcion != 3);
		System.out.println("Fin del programa");
		entrada.close();
	}
}