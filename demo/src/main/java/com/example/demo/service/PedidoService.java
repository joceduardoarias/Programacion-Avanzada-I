package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Pedido;
import com.example.demo.model.PedidoDTO;
import com.example.demo.model.PedidoMapper;
import com.example.demo.repository.ClienteRepository;
import com.example.demo.repository.PedidoRepository;
import java.util.ArrayList;
import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;
    
    @Autowired
    private ClienteRepository clienteRepository;
    
    @Autowired
    private PedidoMapper pedidoMapper;

    // Obtener todos los pedidos
    public List<PedidoDTO> findAll() {
        Iterable<Pedido> pedidosIterable = pedidoRepository.findAll();
        List<PedidoDTO> pedidoDTOs = new ArrayList<>();
        for (Pedido pedido : pedidosIterable) {
            pedidoDTOs.add(pedidoMapper.entityToDto(pedido));
        }
        return pedidoDTOs;
    }

    // Buscar un pedido por ID
    public PedidoDTO findById(Long id) {
        return pedidoRepository.findById(id)
                               .map(pedidoMapper::entityToDto)
                               .orElse(null);
    }

 // // Guardar o actualizar un pedido
    public PedidoDTO save(PedidoDTO pedidoDTO) {
        Pedido pedido = pedidoMapper.dtoToEntity(pedidoDTO, clienteRepository); // Cambiado a dtoToEntity
        return pedidoMapper.entityToDto(pedidoRepository.save(pedido));
    }

    // Eliminar un pedido
    public void delete(Long id) {
        pedidoRepository.deleteById(id);
    }
}
