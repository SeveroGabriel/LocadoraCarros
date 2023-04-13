package com.ufape.locadora.collection;

import java.util.List;

import com.ufape.locadora.Carro;

public interface CarroCollection {
    List<Carro> listarTodos();
    Carro buscarPorId(Long id);
    Carro salvar(Carro carro);
    void deletar(Long id);
	Carro criar(Carro carro);
	Carro atualizar(Long id, Carro carro);
}
