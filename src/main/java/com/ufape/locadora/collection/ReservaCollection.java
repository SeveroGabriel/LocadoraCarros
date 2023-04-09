package com.ufape.locadora.collection;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;
import com.ufape.locadora.Reserva;
import com.ufape.locadora.repo.ReservaRepository;

@Service
public class ReservaCollection {
    
    @Autowired
    private ReservaRepository reservaRepository;
    
    public Reserva criarReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }
    
    public List<Reserva> listarReservas() {
        return reservaRepository.findAll();
    }
    
    public Reserva buscarReservaPorId(Long id) {
        return reservaRepository.findById(id).orElseThrow(() -> new NotFoundException("Reserva não encontrada"));
    }
    
    public void removerReserva(Long id) {
        reservaRepository.deleteById(id);
    }
    
    public Reserva atualizarReserva(Reserva reservaAtualizada) {
        Reserva reservaExistente = reservaRepository.findById((long) reservaAtualizada.getId())
                .orElseThrow(() -> new NotFoundException("Reserva não encontrada"));

        reservaExistente.setCarro(reservaAtualizada.getCarro());
        reservaExistente.setCliente(reservaAtualizada.getCliente());
        reservaExistente.setDataInicio(reservaAtualizada.getDataInicio());
        reservaExistente.setDataFim(reservaAtualizada.getDataFim());

        return reservaRepository.save(reservaExistente);
    }
}
