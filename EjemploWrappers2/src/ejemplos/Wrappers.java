package ejemplos;

public class Wrappers {
	public Wrappers(){
		int a = 5;
		
		Integer x = 10;
		Integer y = new Integer(10);
		int b = Integer.valueOf("20");
		
		Boolean expresion = true;
		Boolean expresion2 = new Boolean(true);
		boolean c = Boolean.valueOf("true");
		
		
		String nombre = "Pedro";
		String nombre2 = new String("Pedro");
		
		Integer arreglo[] = new Integer[4];
	}
	
	public static void main(String[] args) {
		new Wrappers();
	}

}
