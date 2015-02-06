package ejemplos;

public class ParametrosValorReferencia{
	static void metodo(int a){
		a = 10;
	}
	static void metodoArreglo(int a[]){
		a[0] = 10;
	}
	public static void main(String args[]){
		int x = 5;
		metodo(x);
		System.out.println(x);
		
		int y[] = {5};
		metodoArreglo(y);
		System.out.println(y[0]);
	}
}