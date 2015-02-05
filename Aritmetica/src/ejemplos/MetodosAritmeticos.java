package ejemplos;

public class MetodosAritmeticos{
	static int sumar(int a,int b){
		int suma = a + b;
		a = 23;
		return suma;
	}
	static int restar(int a,int b){
		return a-b;
	}
	static float dividir(int a,int b){
		return (float)a/ (float)b;
	}
	static int multiplicar(int a,int b){
		return a*b;
	}
	public static void main(String[] args){
		int x = 5;
		int y = 4;
		System.out.println("Suma: " + sumar(x,y));
		System.out.println("Resta: " + restar(x,y));
		System.out.println("Multiplicacion: " + multiplicar(x,y));
		System.out.println("Division: " + dividir(x,y));
	}
}
