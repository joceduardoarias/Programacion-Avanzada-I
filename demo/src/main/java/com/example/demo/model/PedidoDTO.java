package com.example.demo.model;

import java.util.Date;

public class PedidoDTO {
    private Long id;
    private Date fecha;
    private String detalles;
    private Long clienteId; // Solo el ID del cliente, no el objeto completo

    // Constructor sin argumentos
    public PedidoDTO() {
    }

    // Constructor con argumentos
    public PedidoDTO(Long id, Date fecha, String detalles, Long clienteId) {
        this.id = id;
        this.fecha = fecha;
        this.detalles = detalles;
        this.clienteId = clienteId;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    // Método toString (opcional pero útil para depuración)
    @Override
    public String toString() {
        return "PedidoDTO{" +
               "id=" + id +
               ", fecha=" + fecha +
               ", detalles='" + detalles + '\'' +
               ", clienteId=" + clienteId +
               '}';
    }
}

