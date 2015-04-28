package ejemplo;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EjemploObjectInputStream {
	public EjemploObjectInputStream(){
		try {
			ObjectInputStream ois = 
					new ObjectInputStream(new FileInputStream("archivo.dat"));
			try{
				while(true){
					Persona p = (Persona)ois.readObject();
					System.out.println("Nombre: "+p.getNombre()+" "+p.getApellido());
				}
			}catch (EOFException e) {}
			
			ois.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new EjemploObjectInputStream();
	}

}
