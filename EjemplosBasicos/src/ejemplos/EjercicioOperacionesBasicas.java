package ejemplos;

import java.util.Scanner;

public class EjercicioOperacionesBasicas {

	public static void main(String[] args){
		int a;
		int b;
		int resultado;
		String operador;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca un entero:");
		a = entrada.nextInt();
		System.out.println("Introduzca otro entero:");
		b = entrada.nextInt();
		System.out.println("Introduzca el operador aritmetico:");
		operador = entrada.next();
		switch (operador){
			case "+":
				resultado = a+b;
				break;
			case "-":
				resultado = a-b;
				break;
			case "*":
				resultado = a*b;
				break;
			case "/":
				resultado = a/b;
				break;
			case "%":
				resultado = a%b;
				break;
			default:
				resultado = 0;
				System.out.println("Operacion no valida.");
				break;
		}
		System.out.println("Resultado: "+resultado);
		entrada.close();
	}

}
