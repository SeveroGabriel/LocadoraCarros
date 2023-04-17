package com.ufape.locadora.collection;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.ufape.locadora.Carro;
import com.ufape.locadora.Cliente;
import com.ufape.locadora.Reserva;
import com.ufape.locadora.DTO.ReservaDTO;

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
	static com.ufape.locadora.controller.ReservaController criarReserva(ReservaDTO reservaDTO) {
		return null;
	}
	static List<ReservaDTO> buscarReservaPorId(Long id) {
		return null;
	}
	static List<Reserva> buscarTodasReservas() {
		return null;
	}
	static List<ReservaDTO> buscarReservasPorCarro(Long idCarro) {
		return null;
	}
	static boolean cancelarReserva(Long id) {
		return false;
	}
}
