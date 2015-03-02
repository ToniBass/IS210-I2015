package clases;

public class Fecha{
	private int dia;
	private int mes;
	private int anio;
	
	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}
	
	public Fecha(){}
	
	public Fecha(String fecha) {
		String partes[] = fecha.split("/");
		this.dia = Integer.valueOf(partes[0]);
		this.mes = Integer.valueOf(partes[1]);
		this.anio = Integer.valueOf(partes[2]);
	}
	
	public boolean verificarFecha(){
		if (dia<0 || dia>31)
			return false;
		if (mes<0 || mes>12)
			return false;
		if (anio<0 || anio>9999)
			return false;
		
		return true;
	}
	
	public int getDia() {
		return dia;
	}
	public int getMes() {
		return mes;
	}
	public int getAnio() {
		return anio;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public String toString(){
		return dia+"/"+mes+"/"+anio;
	}
	
	
}