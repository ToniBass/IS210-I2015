package implementacion;

import java.util.Scanner;

import clases.Usuario;
import clases.Video;

public class Principal{
	public static void main(String args[]){
		Video videos[];
		int cantidadVideos;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Cuantos videos desea registrar: ");
		cantidadVideos = entrada.nextInt();
		videos = new Video[cantidadVideos];
		
		for(int i = 0;i<videos.length; i++){
			videos[i] = new Video();
			System.out.println("Nombre Video");
			videos[i].setNombreVideo(entrada.next());
			
			do{
				System.out.println("Resolucion: ");
				videos[i].setResolucion(entrada.next());
			}while(!videos[i].verificarResolucion());
			
			do{
				System.out.println("Tamaño: ");
				videos[i].setMegabytes(entrada.nextInt());
			}while(!videos[i].verificarTamanio());
			
			do{
				System.out.println("Tiempo: ");
				videos[i].setTiempo(entrada.next());
			}while(!videos[i].verificarTiempo());
			
			System.out.println("Formato: ");
			videos[i].setFormato(entrada.next());
			
			System.out.println("----Datos del usuario----");
			
			Usuario usuario = new Usuario();
			System.out.println("Nombre:");
			usuario.setNombre(entrada.next());
			System.out.println("Apellido:");
			usuario.setApellido(entrada.next());
			System.out.println("Usuario:");
			usuario.setUsuario(entrada.next());
			System.out.println("Edad:");
			usuario.setEdad(entrada.nextInt());
			System.out.println("Genero:");
			usuario.setNombre(entrada.next());
			
			videos[i].setUsuario(usuario);
		}
		System.out.println("Datos ingresados:");
		for (int i=0;i<videos.length;i++){
			System.out.println(
					videos[i].getNombreVideo() +"\t\t"+
					videos[i].getFormato() +"\t\t"+
					videos[i].getMegabytes() +"\t\t"+
					videos[i].getResolucion() +"\t\t"+
					videos[i].getTiempo() +"\t\t"+
					videos[i].getUsuario().nombreCompleto()					);
		}		
	}
}