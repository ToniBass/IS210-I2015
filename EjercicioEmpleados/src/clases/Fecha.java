package clases;

public class Fecha{
	private int dia;
	private int mes;
	private int anio;
	
	//Constructor con 3 parametros
	public Fecha(int dia, int mes, int anio){
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}
	
	//Segundo constructor sobrecargado
	public Fecha(String fecha){
		String partes[] = fecha.split("/"); //Tokenizar un string por el delimitador /
		dia = Integer.valueOf(partes[0]);
		mes = Integer.valueOf(partes[1]);
		anio = Integer.valueOf(partes[2]);
	}
	
	//Metodos establecer (sets)
	public void establecerDia(int dia){
		this.dia = dia;
	}
	
	public void establecerMes(int mes){
		this.mes = mes;
	}
	
	public void establecerAnio(int anio){
		this.anio = anio;
	}

	//Metodos obtener (gets)
	public int obtenerDia(){
		return this.dia;
	}
	
	public int obtenerMes(){
		return this.mes;
	}
	
	public int obtenerAnio(){
		return this.anio;
	}
	
	//Metodo para obtener la fecha en formato de texto
	public String toString(){
		return dia + "/" + mes + "/" + anio;
	}
	
	public boolean verificarFecha(){
		//0 y 31, mes entre 1 y 12 y año si esta entre 0 y 9999
		if (dia <= 0 || dia >31)
			return false;
		if (mes <=0 || mes >12)
			return false;
		if (anio <=0 || anio >=9999)
			return false;
		//Si no entra en ninguna condicion entonces el valor es correcto
		return true;	
	}
}