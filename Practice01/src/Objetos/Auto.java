package Objetos;

import java.util.Objects;

public class Auto {
	private String patente;
	private String modelo;	
	private int precio;
	
	public Auto(String patente, String modelo, int precio, MarcaDeAuto marca) {
		super();
		this.patente = patente;
		this.modelo = modelo;
		this.precio = precio;
		this.marca = marca;
	}
	@Override
	public int hashCode() {
		return Objects.hash(marca, modelo, patente, precio);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Auto other = (Auto) obj;
		return marca == other.marca && Objects.equals(modelo, other.modelo) && Objects.equals(patente, other.patente)
				&& precio == other.precio;
	}
	/**
	 * @return the patente
	 */
	public String getPatente() {
		return patente;
	}
	/**
	 * @param patente the patente to set
	 */
	public void setPatente(String patente) {
		this.patente = patente;
	}	
	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/**
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	/**
	 * @return the marca
	 */
	public MarcaDeAuto getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(MarcaDeAuto marca) {
		this.marca = marca;
	}
	private MarcaDeAuto marca;
	
}
