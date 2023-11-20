package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Cliente;
import com.example.demo.model.ClienteDTO;
import com.example.demo.model.ClienteMapper;
import com.example.demo.repository.ClienteRepository;
import java.util.stream.Collectors;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ClienteMapper clienteMapper;

    // Obtener todos los clientes
    public List<ClienteDTO> findAll() {
        // Obtener todos los clientes como un Iterable
        Iterable<Cliente> clientesIterable = clienteRepository.findAll();

        // Convertir Iterable a List
        List<Cliente> clientes = new ArrayList<>();
        for (Cliente cliente : clientesIterable) {
            clientes.add(cliente);
        }

        // Convertir List<Cliente> a List<ClienteDTO>
        List<ClienteDTO> clienteDTOs = new ArrayList<>();
        for (Cliente cliente : clientes) {
            ClienteDTO clienteDTO = clienteMapper.entityToDto(cliente);
            clienteDTOs.add(clienteDTO);
        }

        return clienteDTOs;
    }

    // Buscar un cliente por ID
    public ClienteDTO findById(Long id) {
        return clienteRepository.findById(id)
                                .map(clienteMapper::entityToDto)
                                .orElse(null);
    }

    // Guardar o actualizar un cliente
    public ClienteDTO save(ClienteDTO clienteDTO) {
        Cliente cliente = clienteMapper.dtoToEntity(clienteDTO);
        return clienteMapper.entityToDto(clienteRepository.save(cliente));
    }

    // Eliminar un cliente
    public void delete(Long id) {
        clienteRepository.deleteById(id);
    }
}
