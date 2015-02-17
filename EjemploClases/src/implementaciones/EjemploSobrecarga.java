package implementaciones;

public class EjemploSobrecarga{
	public static double suma(int a, int b){
		return a+b;
	}
	
	public static double suma(int a, int b, int c){
		return a+b+c;
	}
	
	public static double suma(double a, double b){
		return a+b;
	}
	
	public static double suma(float a, float b){
		return a+b;
	}
	
	public static void main(String args[]){
		System.out.println(suma(4,5));
		System.out.println(suma(4,5,6));
		System.out.println(suma(4.3f,5.2f));
		System.out.println(suma(4.3d,5.2d));
	}
}