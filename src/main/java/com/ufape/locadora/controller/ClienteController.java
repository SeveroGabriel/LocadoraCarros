package com.ufape.locadora.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ufape.locadora.Cliente;
import com.ufape.locadora.collection.ClienteCollection;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteCollection clienteCollection;

    @PostMapping
    public ResponseEntity<Cliente> criarCliente(@RequestBody ClienteRequest request) {
        Cliente cliente = clienteCollection.criarCliente(request.getNome(), request.getEmail(), request.getTelefone());
        return ResponseEntity.ok(cliente);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarClientePorId(@PathVariable Long id) {
        Cliente cliente = clienteCollection.buscarClientePorId(id);
        return ResponseEntity.ok(cliente);
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> buscarTodosClientes() {
        List<Cliente> clientes = clienteCollection.buscarTodosClientes();
        return ResponseEntity.ok(clientes);
    }
}
