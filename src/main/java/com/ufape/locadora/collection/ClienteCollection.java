package com.ufape.locadora.collection;

import java.util.List;
import java.util.Optional;

import com.ufape.locadora.Cliente;
import com.ufape.locadora.DTO.ClienteDTO;

public interface ClienteCollection {
    List<Cliente> findAll();
    Optional<Cliente> findById(Long id);
    Cliente save(Cliente cliente);
    void deleteById(Long id);
	static List<ClienteDTO> getClientes() {
		return null;
	}
	ClienteDTO getClienteById(Long id);
	ClienteDTO createCliente(ClienteDTO clienteDTO);
	ClienteDTO updateCliente(Long id, ClienteDTO clienteDTO);
}
