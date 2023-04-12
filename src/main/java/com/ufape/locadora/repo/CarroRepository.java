package com.ufape.locadora.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ufape.locadora.Carro;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {

	List<Carro> listarTodos();

	Carro buscarPorId(Long id);

	void salvar(Carro carro);

	void atualizar(Carro carro);

	void remover(Carro carro);
}
