package implementacion;

import java.util.Scanner;

import clases.Fecha;
import clases.Tweet;
import clases.Usuario;

public class Principal{
	public static void main(String args[]){
		Tweet tweets[];
		Scanner entrada = new Scanner(System.in);
		int cantidadMensajes;
		System.out.println("Cuantos mensajes desea ingresar:");
		cantidadMensajes = entrada.nextInt();
		
		tweets = new Tweet[cantidadMensajes];
		
		for(int i=0; i< tweets.length; i++){
			tweets[i] = new Tweet();
			
			//Definir los datos del usuario
			Usuario usuario = new Usuario();
			System.out.println("Nombre:");
			usuario.setNombre(entrada.next());
			System.out.println("Nombre de Usuario:");
			usuario.setNombreUsuario(entrada.next());
			System.out.println("Correo:");
			usuario.setCorreo(entrada.next());
			
			tweets[i].setUsuario(usuario);
			
			System.out.println("Fecha (DD/MM/YYYY):");
			Fecha fecha = new Fecha(entrada.next());
			tweets[i].setFechaPublicacion(fecha);
			
			do{
				System.out.println("Ingrese el mensaje: ");
				tweets[i].setMensaje(entrada.next());
			}while(!tweets[i].verificarMensaje());
			
			System.out.println("Contiene una imagen (1=Si/0=No):");
			int contieneImagen = entrada.nextInt();
			if(contieneImagen==0)
				tweets[i].setTieneImagen(false);
			else if (contieneImagen==1)
				tweets[i].setTieneImagen(true);
			
			System.out.println("Url de la imagen");
			tweets[i].setUrlImagen(entrada.next());
		}
		
		for(int i = 0; i<tweets.length; i++){
			System.out.println(
					tweets[i].getUsuario().getNombre() + "\t\t"+
					tweets[i].getUsuario().getNombreUsuario() +"\t\t"+
					tweets[i].getUsuario().getCorreo() +"\t\t"+
					tweets[i].getFechaPublicacion().toString()+"\t\t"+
					tweets[i].getMensaje()+"\t\t"+
					tweets[i].getTieneImagen()+"\t\t"+
					tweets[i].getUrlImagen()+"\t\t");
		}
		
		int opcion;
		do{
			System.out.println("1. Mostrar datos\n2. Salir");
			opcion = entrada.nextInt();
			switch(opcion){
				case 1:
					for(int i = 0; i<tweets.length; i++){
						System.out.println(
								tweets[i].getUsuario().getNombre() + "\t\t"+
								tweets[i].getUsuario().getNombreUsuario() +"\t\t"+
								tweets[i].getUsuario().getCorreo() +"\t\t"+
								tweets[i].getFechaPublicacion().toString()+"\t\t"+
								tweets[i].getMensaje()+"\t\t"+
								tweets[i].getTieneImagen()+"\t\t"+
								tweets[i].getUrlImagen()+"\t\t");
					}
					break;
				case 2:
					System.out.println("Fin del programa");
					break;
			}
		}while(opcion!=2);
		
		entrada.close();
	}
}