package ejemplo;

public class EjemploRandom {

	public static void main(String[] args) {
		//0.0 - 1.0
		System.out.println("Aleatorio: " + (int)(Math.random() * 5));
		//0.0-5.0
		System.out.println("Aleatorio: " + (int)(Math.random() * 5));
		
		//Aleatorio definiendo un valor minimo y un valor maximo:
		int min = 6;
		int max = 21;
		int aleatorio=(min+(int)(Math.random()*(max-min)+1));
		
		System.out.println("Aleatorio: " +aleatorio);	
		
	}

}
