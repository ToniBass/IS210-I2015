package codigo;

public class HolaMundo{
	public static void main(String args[]){
		String frase = "Hola Mundo";
		String partes[] = frase.split(" ");
		System.out.println(partes[0]+" - "+ partes[1]);
	}
}