package com.ufape.locadora.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ufape.locadora.Aluguel;
import com.ufape.locadora.Carro;
import com.ufape.locadora.Cliente;

@Repository
public interface AluguelRepository extends JpaRepository<Aluguel, Long> {

	List<Aluguel> findByCliente(Cliente cliente);

	List<Aluguel> findByCarro(Carro carro);

	List<Aluguel> findByDataInicioBetween(LocalDate dataInicio, LocalDate dataFim);





}
