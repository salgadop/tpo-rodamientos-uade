package modelo;

import java.io.Serializable;
import java.util.Set;

@SuppressWarnings("serial")
public class Rodamiento implements Serializable{

	private int codigo;
	private String caracteristicas;
	private String marca;
	private String paisOrigen;
	private Integer nroSerie;
	private Set<Rodamiento> equivalentes;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	public Set<Rodamiento> getEquivalentes() {
		return equivalentes;
	}

	public void setEquivalentes(Set<Rodamiento> equivalentes) {
		this.equivalentes = equivalentes;
	}

	public Integer getNroSerie() {
		return nroSerie;
	}

	public void setNroSerie(Integer nroSerie) {
		this.nroSerie = nroSerie;
	}
}
