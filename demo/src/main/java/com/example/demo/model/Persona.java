package com.example.demo.model;

import jakarta.validation.constraints.NotEmpty;

public class Persona {

	@NotEmpty//Validando que el nombre no este vacío 
    private String nombre;
    private String apellido;
    private int edad;
    private String direccion;

    // Constructor vacío (es necesario para ser un POJO)
    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
    }

    // Getters y setters para cada atributo (necesarios para ser un POJO)

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Método toString para imprimir el objeto de manera legible
    @Override
    public String toString() {
        return "Persona {" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}

