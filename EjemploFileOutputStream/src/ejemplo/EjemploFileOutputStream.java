package ejemplo;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EjemploFileOutputStream {
	public EjemploFileOutputStream(){
		try {
			BufferedOutputStream bos = 
					new BufferedOutputStream(new FileOutputStream("archivo.txt",true));
			String frase = "Hola Mundo\n";
			String frase2 = "Que tal?";
			bos.write(frase.getBytes());
			bos.write(13);//Codigo del enter
			bos.write(frase2.getBytes());
			bos.close();
			System.out.println("Termino de escribir");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	public static void main(String[] args) {
		new EjemploFileOutputStream();

	}

}
