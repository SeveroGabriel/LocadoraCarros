package com.ufape.locadora.collection;

import java.util.List;

import com.ufape.locadora.Aluguel;
import com.ufape.locadora.Carro;
import com.ufape.locadora.Cliente;
import com.ufape.locadora.DTO.AluguelDTO;

public interface AluguelCollection {
    void save(Aluguel aluguel);
    void remove(Aluguel aluguel);
    List<AluguelDTO> getAll();
    List<Aluguel> getByCliente(Cliente cliente);
    List<Aluguel> getByCarro(Carro carro);
    AluguelDTO getById(Long id);
	List<Aluguel> findAll();
	boolean existe(Long id);
	void deletarPorId(Long id);
	AluguelDTO save(AluguelDTO aluguelDTO);
}
