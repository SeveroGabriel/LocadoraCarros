package com.ufape.locadora.collection;

import java.util.List;
import java.util.Optional;

import com.ufape.locadora.Cliente;

public interface ClienteCollection {
    List<Cliente> findAll();
    Optional<Cliente> findById(Long id);
    Cliente save(Cliente cliente);
    void deleteById(Long id);
}
