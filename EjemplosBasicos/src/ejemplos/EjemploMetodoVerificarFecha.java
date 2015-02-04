package ejemplos;

import java.util.Scanner;

public class EjemploMetodoVerificarFecha{
	static boolean verificarDia(int dia){
		if (dia < 1 || dia > 31){
			System.out.println("Dia incorrecto, ingrese el dato nuevamente");
			return false;
		}	
		else
			return true;
	}
	static boolean verificarMes(int mes){
		if (mes < 1 || mes > 12){			
			System.out.println("Mes incorrecto, ingrese el dato nuevamente");
			return false;
		}
		else
			return true;
	}
	static boolean verificarAnio(int anio){
		if (anio < 1000 || anio > 9999){
			System.out.println("Año incorrecto, ingrese el dato nuevamente");
			return false;
		}
		else
			return true;
	}
	
	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);
		int dia;
		int mes;
		int anio;
		
		do{
			System.out.println("Ingrese el dia:");
			dia = entrada.nextInt();
		}while(!verificarDia(dia));
		
		do{
			System.out.println("Ingrese el mes:");
			mes = entrada.nextInt();
		}while(!verificarMes(mes));
		
		do{
			System.out.println("Ingrese el año:");
			anio = entrada.nextInt();
		}while(!verificarAnio(anio));
		
		/*System.out.println("Dia valido: " + verificarDia(dia));
		System.out.println("Mes valido: " + verificarMes(mes));
		System.out.println("Año valido: " + verificarAnio(anio));*/
	}
}