import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class EjemploFileWriter {
	public EjemploFileWriter(){
		try {
			File archivo = new File("archivo.txt");
			FileWriter fileWriter = new FileWriter(archivo);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write("Hola mundo");
			bufferedWriter.newLine();
			bufferedWriter.write("Todo bien");
			System.out.println("Finalizo la escritura");
			bufferedWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new EjemploFileWriter();
	}

}
