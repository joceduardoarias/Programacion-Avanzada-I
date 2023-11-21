package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.ClienteDTO;
import com.example.demo.service.ClienteService;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    // Obtener todos los clientes
    @GetMapping
    public ResponseEntity<List<ClienteDTO>> getAllClientes() {
        List<ClienteDTO> clientes = clienteService.findAll();
        return ResponseEntity.ok(clientes);
    }

    // Obtener un cliente por ID
    @GetMapping("/{id}")
    public ResponseEntity<ClienteDTO> getClienteById(@PathVariable Long id) {
        ClienteDTO clienteDTO = clienteService.findById(id);
        if (clienteDTO != null) {
            return ResponseEntity.ok(clienteDTO);
        }
        return ResponseEntity.notFound().build();
    }

    // Crear un nuevo cliente
    @PostMapping
    public ResponseEntity<ClienteDTO> createCliente(@RequestBody @Validated ClienteDTO clienteDTO) {
        ClienteDTO nuevoCliente = clienteService.save(clienteDTO);
        return ResponseEntity.ok(nuevoCliente);
    }

    // Actualizar un cliente existente
    @PutMapping("/{id}")
    public ResponseEntity<ClienteDTO> updateCliente(@PathVariable Long id, @RequestBody ClienteDTO clienteDTO) {
        clienteDTO.setId(id);
        ClienteDTO clienteActualizado = clienteService.save(clienteDTO);
        return ResponseEntity.ok(clienteActualizado);
    }

    // Eliminar un cliente
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCliente(@PathVariable Long id) {
        clienteService.delete(id);
        return ResponseEntity.ok().build();
    }
}

