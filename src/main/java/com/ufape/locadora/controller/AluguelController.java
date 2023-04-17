package com.ufape.locadora.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ufape.locadora.DTO.AluguelDTO;
import com.ufape.locadora.collection.AluguelCollection;


@RestController
@RequestMapping("/api/alugueis")
public class AluguelController {

    @Autowired
    private AluguelCollection aluguelCollection;

    @GetMapping("/{id}")
    public ResponseEntity<AluguelDTO> buscarAluguel(@PathVariable Long id) {
        AluguelDTO aluguelDTO = aluguelCollection.getById(id);
        if (aluguelDTO != null) {
            return ResponseEntity.ok(aluguelDTO);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<AluguelDTO>> listarAlugueis() {
        List<AluguelDTO> alugueisDTO = aluguelCollection.getAll();
        return ResponseEntity.ok(alugueisDTO);
    }

    @PostMapping
    public AluguelDTO criarAluguel(@RequestBody AluguelDTO aluguelDTO) {
        aluguelDTO = aluguelCollection.save(aluguelDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(aluguelDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AluguelDTO> atualizarAluguel(@PathVariable Long id, @RequestBody AluguelDTO aluguelDTO) {
        if (aluguelCollection.existe(id)) {
            aluguelDTO.setId(id);
            aluguelDTO = aluguelCollection.save(aluguelDTO);
            return ResponseEntity.ok(aluguelDTO);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarAluguel(@PathVariable Long id) {
        if (aluguelCollection.existe(id)) {
            aluguelCollection.deletarPorId(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
