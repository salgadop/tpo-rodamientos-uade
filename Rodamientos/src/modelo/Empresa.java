package modelo;

import java.io.Serializable;

public class Empresa implements Serializable{

	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
