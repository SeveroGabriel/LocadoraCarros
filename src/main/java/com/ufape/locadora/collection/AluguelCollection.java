package com.ufape.locadora.collection;

import java.util.List;

import com.ufape.locadora.Aluguel;
import com.ufape.locadora.Carro;
import com.ufape.locadora.Cliente;

public interface AluguelCollection {
    void save(Aluguel aluguel);
    void remove(Aluguel aluguel);
    List<Aluguel> getAll();
    List<Aluguel> getByCliente(Cliente cliente);
    List<Aluguel> getByCarro(Carro carro);
    Aluguel getById(Long id);
	List<Aluguel> findAll();
	boolean existe(Long id);
}
