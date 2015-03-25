package clases;

import java.util.ArrayList;

public class LineaTelefonica {
	private String nombre;
	private String identidad;
	private String telefono;
	private String operador;
	private String marca;
	private ArrayList<String> tecnologias = new ArrayList<String>();
	
	public LineaTelefonica(String nombre, 
			String identidad, 
			String telefono,
			String operador, 
			String marca, 
			ArrayList<String> tecnologias) {
		this.nombre = nombre;
		this.identidad = identidad;
		this.telefono = telefono;
		this.operador = operador;
		this.marca = marca;
		this.tecnologias = tecnologias;
	}

	public String getNombre() {
		return nombre;
	}

	public String getIdentidad() {
		return identidad;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getOperador() {
		return operador;
	}

	public String getMarca() {
		return marca;
	}

	public ArrayList<String> getTecnologias() {
		return tecnologias;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setIdentidad(String identidad) {
		this.identidad = identidad;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setOperador(String operador) {
		this.operador = operador;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setTecnologias(ArrayList<String> tecnologias) {
		this.tecnologias = tecnologias;
	}
	
	public String toString(){
		String strTecnologias="";
		for (int i=0;i<tecnologias.size();i++)
			strTecnologias += tecnologias.get(i)+"/";
		return nombre + "\t" +
				identidad + "\t" +
				telefono + "\t" +
				operador + "\t" +
				marca + "\t" +
				strTecnologias;
	}
	
	
	
	
}
