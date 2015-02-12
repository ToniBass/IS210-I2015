package clases;

public class ImplementacionComputadora{
	public static void main(String args[]){
		int a;
		Computadora b; //Valor por defecto es null
		b = new Computadora(); //Instanciacion
		
		//b.marca = "Asus";
		//System.out.println("La marca es: "+b.marca);
		b.setMarca("Asus");
		System.out.println("Marca: " + b.getMarca());
	}
}