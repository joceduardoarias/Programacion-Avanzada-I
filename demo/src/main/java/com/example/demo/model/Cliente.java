package com.example.demo.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
@Entity
public class Cliente {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    @NotEmpty(message = "El nombre no puede estar vacío")
	    private String nombre;
	    @NotEmpty(message = "El email no puede estar vacío")
	    private String email;
	    
	 // Constructor por defecto
	    public Cliente() {
	    }

	    // Constructor con parámetros
	    public Cliente(Long id, String nombre, String email) {
	        this.id = id;
	        this.nombre = nombre;
	        this.email = email;
	    }
	    
	 // Getters y setters
	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    // Método toString (depuración)
	    @Override
	    public String toString() {
	        return "Cliente{" +
	               "id=" + id +
	               ", nombre='" + nombre + '\'' +
	               ", email='" + email + '\'' +
	               '}';
	    }

}
