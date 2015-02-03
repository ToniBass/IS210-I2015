package ejemplos;

import java.util.Scanner;

public class ArregloBidimensional{
	public static void main(String args[]){
		int matriz[][];
		matriz = new int[5][5];		
		
		//int matriz2[][] = new int[5][5];
		//Asignar valores
		for (int i = 0;i<matriz.length;i++){
			for (int j = 0;j<matriz[i].length;j++){
				matriz[i][j] = (i+1) * (j+1);
			}
		}
		
		//Imprimir valores
		for (int i = 0;i<matriz.length;i++){
			for (int j = 0;j<matriz[i].length;j++){
				//System.out.println("Elemento ["+i+"]["+j+"]: " + matriz[i][j]);
				System.out.print(matriz[i][j]+"\t\t");
			}
			System.out.print("\n");
		}
	}
}