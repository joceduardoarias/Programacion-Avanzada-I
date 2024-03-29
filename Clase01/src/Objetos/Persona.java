package Objetos;
//POJO -> Plain Old Java Object
public class Persona {
	private int dni;
	private String nombre;
	
	public Persona(int dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}

	/**
	 * @return the dni
	 */
	public int getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(int dni) {
		this.dni = dni;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override 
	public String toString() {
		return "Usuario: " + this.getNombre() + "\n" + "DNI: " + this.getDni();
	}
	
	@Override 
	public boolean equals(Object objeto) {
		boolean result = false;
		
		if (this == objeto) return true;
		
		if(objeto != null) {
			if( objeto instanceof Persona) {
				Persona p =(Persona)objeto;
				
				if(p.dni == this.dni) {
					result = true;
				}
			}
		}
		return result;
	}
	
	@Override
	public int hashCode() {
	    int result = 17;  // Número primo inicial
	    result = 31 * result + (nombre == null ? 0 : nombre.hashCode());  // 31 es otro número primo
	    result = 31 * result + dni;
	    return result;
	}

}
