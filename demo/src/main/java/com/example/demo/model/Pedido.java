package com.example.demo.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Pedido {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private Date fecha;
	    private String detalles;

	    @ManyToOne
	    @JoinColumn(name = "cliente_id")
	    private Cliente cliente;
	    
	 // Constructor por defecto
	    public Pedido() {
	    }

	    // Constructor con parámetros
	    public Pedido(Long id, Date fecha, String detalles, Cliente cliente) {
	        this.id = id;
	        this.fecha = fecha;
	        this.detalles = detalles;
	        this.cliente = cliente;
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

	    public Cliente getCliente() {
	        return cliente;
	    }

	    public void setCliente(Cliente cliente) {
	        this.cliente = cliente;
	    }

	    // Método toString (opcional pero útil para depuración)
	    @Override
	    public String toString() {
	        return "Pedido{" +
	               "id=" + id +
	               ", fecha=" + fecha +
	               ", detalles='" + detalles + '\'' +
	               ", cliente=" + (cliente != null ? cliente.getId() : null) +
	               '}';
	    }

}
