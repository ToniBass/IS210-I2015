package ejemplos;

public class Cast{
	public static void main(String args[]){
		System.out.println("Conversion de float a int");
		float a = 10.5f;
		int b;
		b = (int)a; //Cast de float a int
		System.out.println("Valor: "+b);//El valor mostrado sera 10
		System.out.println("Valor: "+a);//El valor mostrado sera 10
		
		System.out.println("Conversion de float a double");
		double c = 10.523123123544554;
		float d;
		d = (float)c; //Cast de float a int
		System.out.println("Valor: "+c);//El valor mostrado sera 10
		System.out.println("Valor: "+d);//El valor mostrado sera 10
	}
}