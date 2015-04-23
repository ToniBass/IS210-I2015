package ejemplo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EjemploFileReader {
	public EjemploFileReader(){
		try {
			//La opcion comentada tambien es valida
			/*File archivo = new File("C:/prueba/HolaMundo.java");		
			FileReader fileReader = new FileReader(archivo);
			BufferedReader bufferedReader = new BufferedReader(fileReader);*/ 
			
			BufferedReader bufferedReader = 
					new BufferedReader(new FileReader("C:/prueba/HolaMundo.java"));
			String linea;
			while ((linea = bufferedReader.readLine())!=null){
				System.out.println(linea);
			}
			bufferedReader.close();
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new EjemploFileReader();
	}

}
