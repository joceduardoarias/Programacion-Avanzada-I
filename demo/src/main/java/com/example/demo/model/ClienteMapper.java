package com.example.demo.model;


import org.springframework.stereotype.Component;

@Component
public class ClienteMapper {

    // Convierte de Cliente (entidad) a ClienteDTO
    public ClienteDTO entityToDto(Cliente cliente) {
        if (cliente == null) {
            return null;
        }

        ClienteDTO dto = new ClienteDTO();
        dto.setId(cliente.getId());
        dto.setNombre(cliente.getNombre());
        dto.setEmail(cliente.getEmail());
        return dto;
    }

    // Convierte de ClienteDTO a Cliente (entidad)
    public Cliente dtoToEntity(ClienteDTO dto) {
        if (dto == null) {
            return null;
        }

        Cliente cliente = new Cliente();
        cliente.setId(dto.getId());
        cliente.setNombre(dto.getNombre());
        cliente.setEmail(dto.getEmail());
        return cliente;
    }
}

