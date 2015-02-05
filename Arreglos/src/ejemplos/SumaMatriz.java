package ejemplos;

import java.util.Scanner;

public class SumaMatriz{
	public static void main(String args[]){
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		Scanner entrada = new Scanner(System.in);
		int resultado[][] = new int[3][3];

		//Asignar valores
		for (int i = 0;i<a.length;i++){
			for (int j = 0;j<a.length;j++){
				a[i][j] = (i+1) * (j+1);
				b[i][j] = (i+1);
			}
		}
		
		System.out.println("Matriz A:");
		for (int i = 0;i<a.length;i++){
			for (int j = 0;j<a[i].length;j++){
				System.out.print(a[i][j]+"\t\t");
			}
			System.out.print("\n");
		}
		
		System.out.println("Matriz B:");
		for (int i = 0;i<b.length;i++){
			for (int j = 0;j<b[i].length;j++){
				System.out.print(b[i][j]+"\t\t");
			}
			System.out.print("\n");
		}
		
		//Realizar la operacion aritmetica
		for (int i = 0;i<a.length;i++){
			for (int j = 0;j<b[i].length;j++){
				resultado[i][j] = a[i][j]+b[i][j];
			}
		}
		
		System.out.println("Matriz resultado:");
		for (int i = 0;i<resultado.length;i++){
			for (int j = 0;j<resultado[i].length;j++){
				System.out.print(resultado[i][j]+"\t\t");
			}
			System.out.print("\n");
		}
		entrada.close();
	}
}