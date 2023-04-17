package com.ufape.locadora.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ufape.locadora.DTO.ReservaDTO;
import com.ufape.locadora.collection.ReservaCollection;

@RestController
@RequestMapping("/api/reservas")
public class ReservaController {

    @GetMapping("/{id}")
    public ResponseEntity<List<ReservaDTO>> buscarReservaPorId(@PathVariable Long id) {
        List<ReservaDTO> reserva = ReservaCollection.buscarReservaPorId(id);
        if (reserva != null) {
            return ResponseEntity.ok(reserva);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/cliente/{idCliente}")
    public ResponseEntity<List<ReservaDTO>> buscarReservasPorCliente(@PathVariable Long idCliente) {
        List<ReservaDTO> reserva = ReservaCollection.buscarReservaPorId(idCliente);
        if (!reserva.isEmpty()) {
            return ResponseEntity.ok(reserva);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/carro/{idCarro}")
    public ResponseEntity<List<ReservaDTO>> buscarReservasPorCarro(@PathVariable Long idCarro) {
        List<ReservaDTO> reservas = ReservaCollection.buscarReservasPorCarro(idCarro);
        if (!reservas.isEmpty()) {
            return ResponseEntity.ok(reservas);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<ReservaController> criarReserva(@RequestBody ReservaDTO reserva) {
        ReservaController novaReserva = ReservaCollection.criarReserva(reserva);
        if (novaReserva != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body(novaReserva);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> cancelarReserva(@PathVariable Long id) {
        boolean resultado = ReservaCollection.cancelarReserva(id);
        if (resultado) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
