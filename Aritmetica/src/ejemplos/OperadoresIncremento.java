package ejemplos;

public class OperadoresIncremento{
	public static void main(String args[]){
		final float MAX_VALUE = 100f;
		int a = 2;
		int b = 2;
		System.out.println(a--); //Imprime 2
		System.out.println(--b); //Imprime 3
		System.out.print("Estado Final (a) :");
		System.out.println(a); //Imprime 3
		System.out.print("Estado Final (b) :");
		System.out.println(b); //Imprime 3
		System.out.println(MAX_VALUE ); //Imprime 3
	}
}