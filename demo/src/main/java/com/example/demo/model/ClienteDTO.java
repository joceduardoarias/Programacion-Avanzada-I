package com.example.demo.model;

public class ClienteDTO {
    private Long id;
    private String nombre;
    private String email;

    // Constructor sin argumentos
    public ClienteDTO() {
    }

    // Constructor con argumentos
    public ClienteDTO(Long id, String nombre, String email) {
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

    // Método toString (opcional pero útil para depuración)
    @Override
    public String toString() {
        return "ClienteDTO{" +
               "id=" + id +
               ", nombre='" + nombre + '\'' +
               ", email='" + email + '\'' +
               '}';
    }
}

