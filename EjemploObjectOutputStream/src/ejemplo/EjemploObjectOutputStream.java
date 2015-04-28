package ejemplo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EjemploObjectOutputStream {
	public EjemploObjectOutputStream(){
		try {
			ObjectOutputStream oos = new 
					ObjectOutputStream(
							new FileOutputStream("archivo.dat",true)
							);
			Persona p1 = new Persona("Jose","Martinez",30,"M");
			Persona p2 = new Persona("Mario","Dominguez",35,"M");
			Persona p3 = new Persona("Luis","Lainez",50,"M");
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.writeObject(p3);
			oos.close();
			System.out.println("Termino de escribir el archivo");
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	public static void main(String[] args) {
		new EjemploObjectOutputStream();

	}

}
