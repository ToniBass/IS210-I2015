package clases;

public class Carro extends Vehiculo {
	private String placa;
	private String chasis;
	private long kilometraje;
	private String combustible;

	public Carro(
			String color, 
			String marca, 
			String modelo, 
			String placa, 
			String chasis, 
			long kilometraje,
			String combustible){
		super(color, marca, modelo); 
		this.placa = placa;
		this.chasis = chasis;
		this.kilometraje = kilometraje;
		this.combustible = combustible;
	}

	public String toString(){
		return super.toString() +
				placa+","+chasis+","+kilometraje+","+combustible;
	}
}
