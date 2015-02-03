package ejemplos;

public class Arreglos{
	public static void main(String args[]){
		int valores[];
		int tamanio = 0;
		//tamanio = //Entrada del usuario
		valores = new int[tamanio];
		valores[0] = 10;
		valores[1] = 20;
		valores[2] = 30;
		valores[3] = 40;
		valores[4] = 50;

		for (int i = 0; i < valores.length;i++){
			System.out.println(valores[i]);
		}
		
		String cadenas[] = {"Hola"," Mundo"};
		System.out.println(cadenas[0] + cadenas[1]);
		
	}
}