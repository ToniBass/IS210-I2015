package ejemplos;

public class Aritmetica {
	public static void main(String args[]){
		int a   = 17;
		int b   = 10;
		float c = 17f;
		float d = 10f;
		
		int suma   = a + b;
		int resta  = a - b;
		int mult   = a * b;
		float div  = c / d;
		int modulo = a % b;
 
		System.out.print("Suma :");
		System.out.println((a + b));		
		System.out.println("Resta :" + resta);
		System.out.println("Multiplicacion :" + mult);
		System.out.println("Division :" + div);
		System.out.println("Modulo :" + modulo);
	}
}