package ejercicio;

import java.util.Scanner;

public class Matrices {
	
	static Scanner entrada = new Scanner(System.in);
	//Ingresar los datos de una matriz
	static void ingresarDatos(int matriz[][]){
		for (int i=0; i<matriz.length;i++){
			for (int j=0; j<matriz[i].length;j++){
				System.out.print("Valor ["+i+"]["+j+"]:");
				matriz[i][j] = entrada.nextInt();
			}
		}
	}
	
	static void mostrarDatos(int matriz[][]){
		System.out.println("----------------------------");
		for (int i=0; i<matriz.length;i++){
			for (int j=0; j<matriz[i].length;j++){
				System.out.print(matriz[i][j]+"\t\t");
			}
			System.out.print("\n");
		}
	}
	
	static int[][] sumarMatrices(int matrizX[][],int matrizY[][]){
		int resultado[][] = new int[matrizX.length][matrizX[0].length];		
		for (int i = 0;i<matrizX.length;i++){
			for (int j = 0;j<matrizX[i].length;j++){
				resultado[i][j] = matrizX[i][j]+matrizY[i][j];
			}
		}
		return resultado;
	}
	
	static int[][] transpuesta(int matriz[][]){
		int matrizTraspuesta[][] = new int[matriz[0].length][matriz.length];
		for (int i=0;i<matrizTraspuesta.length;i++){
			for (int j=0;j<matrizTraspuesta[i].length;j++){
				matrizTraspuesta[i][j] = matriz[j][i]; 	
			}
		}
		return matrizTraspuesta;
	}
	
	public static void main(String[] args) {
		int opcion;
		int matrizA[][]={};
		int matrizB[][]={};
		int m;
		int n;
		
		do{
			System.out.println("----------------------------\n"
					+ "0 Salir\n"
					+ "1 Ingresar datos de una matriz\n"
					+ "2 Mostrar datos de una matriz\n"
					+ "3 Sumar dos matrices\n"
					+ "4 Matriz traspuesta\n"
					+ "----------------------------");
			System.out.println("Elija una opción:");
			opcion = entrada.nextInt();	
			switch(opcion){
				case 0:
					System.out.println("Fin del programa");
					break;
				case 1:
					//Ingresar el tamaño de la matriz
					System.out.println("Defina el tamaño de las matrices");
					System.out.println("Filas:");
					m = entrada.nextInt();
					System.out.println("Columnas:");
					n = entrada.nextInt();
					//Inicializar el tamaño de las matrices
					matrizA = new int[m][n];
					matrizB = new int[m][n];
					
					//Ingresar datos de las matrices
					System.out.println("Ingresar datos de la matriz A");
					ingresarDatos(matrizA);
					System.out.println("Ingresar datos de la matriz B");
					ingresarDatos(matrizB);
					break;
				case 2:
					System.out.println("Matriz A");
					mostrarDatos(matrizA);
					System.out.println("Matriz B");
					mostrarDatos(matrizB);
					break;
				case 3:
					System.out.println("Resultado matrizA + matrizB");
					mostrarDatos(sumarMatrices(matrizA,matrizB));
					break;
				case 4:
					mostrarDatos(transpuesta(matrizA));
					mostrarDatos(transpuesta(matrizB));
					break;
				default:
					System.err.println("Opción inválida");
					break;
			}
		}while(opcion!=0);
	}
}