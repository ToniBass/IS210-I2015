package ejemplos;

import java.util.Scanner;

public class Potencia {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int base;
		int exponente;
		int resultado = 1;
		System.out.println("Introduzca la base: ");
		base = entrada.nextInt();
		System.out.println("Introduzca el exponente: ");
		exponente = entrada.nextInt(); 
		for(int i=0; i<exponente; i++){
			resultado *= base;
		}
		System.out.println("Resultado de " + 
					base + " ^ "+ 
				exponente + ": " + resultado);
		entrada.close();
	}

}
