package ejemplos;

import java.util.Scanner;


public class EjemploMetodoVerificarFecha{
	static boolean verificarDia(int dia){
		if(dia < 1 || dia > 31){
			System.out.println("Dato incorrecto, intente de nuevo");
			return false;
		}
		else 
			return true;
	}
	static boolean verificarMes(int mes){
		if(mes < 1 || mes > 12){
			System.out.println("Dato incorrecto, intente de nuevo");
			return false;
		}
		else 
			return true;
	}
	static boolean verificarAnio(int anio){
		if(anio < 1000 || anio > 9999){
			System.out.println("Dato incorrecto, intente de nuevo");
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
			System.out.println("Dia: ");
			dia = entrada.nextInt();
		}while(verificarDia(dia) == false);
		
		do{
			System.out.println("Mes: ");
			mes = entrada.nextInt();
		}while(!verificarMes(mes));
		
		do{
			System.out.println("Año: ");
			anio = entrada.nextInt();
		}while(!verificarAnio(anio));
		
		/*System.out.println("Verificacion Dia: " + verificarDia(dia));
		System.out.println("Verificacion Mes: " + verificarMes(mes));
		System.out.println("Verificacion Año: " + verificarAnio(anio));*/
		
		System.out.println("Fecha:"+ 
				dia + "/" + mes + "/" + anio);
		
		entrada.close();
	}
}