package clases;

public class Bicicleta extends Vehiculo{
	private String registro;
	private String estilo;
	
	public Bicicleta(String color, String marca, String modelo, String registro, String estilo){
		super(color, marca, modelo);
		this.registro = registro;
		this.estilo = estilo; 
	}
	
	public String toString(){
		return super.toString() + ","+registro+","+estilo;
	}
	
}
