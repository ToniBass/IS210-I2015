package ejemplos;

import java.util.Scanner;

public class EjercicioOperacionesBasicas {

	public static void main(String[] args){
		int a;
		int b;
		float resultado;
		String operador;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca un entero:");
		a = entrada.nextInt();
		System.out.println("Introduzca otro entero:");
		b = entrada.nextInt();
		System.out.println("Introduzca el operador aritmetico:");
		operador = entrada.next();
		switch (operador){ // > JDK 1.7 (Java 7)
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
				if (b != 0)
					resultado = (float)a/(float)b;
				else
					resultado = 0;
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
