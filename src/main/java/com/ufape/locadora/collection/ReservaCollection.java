package com.ufape.locadora.collection;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.ufape.locadora.Carro;
import com.ufape.locadora.Cliente;
import com.ufape.locadora.Reserva;

public interface ReservaCollection {
    void save(Reserva reserva);
    void update(Reserva reserva);
    void delete(Long id);
    Optional<Reserva> findById(Long id);
    List<Reserva> findAll();
    List<Reserva> findByDataRetiradaBetween(LocalDate start, LocalDate end);
    List<Reserva> findByDataDevolucaoBetween(LocalDate start, LocalDate end);
    List<Reserva> findByCarro(Carro carro);
    List<Reserva> findByCliente(Cliente cliente);
}
