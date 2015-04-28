package ejemplo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EjemploFileInputStream {
	private int valor;
	
	public EjemploFileInputStream(){
		try {
			BufferedInputStream bis = new BufferedInputStream(
					new FileInputStream("C:/prueba/HolaMundo.java"));
			while ((valor = bis.read())!=-1)
				System.out.print((char)valor);
			bis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	public static void main(String[] args) {
		new EjemploFileInputStream();
	}

}
