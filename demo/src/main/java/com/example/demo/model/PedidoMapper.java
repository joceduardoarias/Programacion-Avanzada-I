package com.example.demo.model;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.example.demo.repository.ClienteRepository;

@Component
public class PedidoMapper {

    // Convierte de Pedido (entidad) a PedidoDTO
    public PedidoDTO entityToDto(Pedido pedido) {
        if (pedido == null) {
            return null;
        }

        PedidoDTO dto = new PedidoDTO();
        dto.setId(pedido.getId());
        dto.setFecha(pedido.getFecha());
        dto.setDetalles(pedido.getDetalles());
        dto.setClienteId(pedido.getCliente() != null ? pedido.getCliente().getId() : null);
        return dto;
    }

    // Convierte de PedidoDTO a Pedido (entidad)
    public Pedido dtoToEntity(PedidoDTO dto, ClienteRepository clienteRepository) {
        if (dto == null) {
            return null;
        }

        Pedido pedido = new Pedido();
        pedido.setId(dto.getId()); // En caso de actualizaciones
        pedido.setFecha(dto.getFecha());
        pedido.setDetalles(dto.getDetalles());

        // Establecer el cliente basado en el clienteId del DTO
        if (dto.getClienteId() != null) {
            Optional<Cliente> cliente = clienteRepository.findById(dto.getClienteId());
            cliente.ifPresent(pedido::setCliente);
        }

        return pedido;
    }
}

