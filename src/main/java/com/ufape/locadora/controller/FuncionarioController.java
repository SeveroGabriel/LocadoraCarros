package com.ufape.locadora.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.ufape.locadora.DTO.FuncionarioDTO;
import com.ufape.locadora.collection.FuncionarioCollection;

@RestController
@RequestMapping("/api/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioCollection funcionarioCollection;

    @GetMapping
    public ResponseEntity<List<FuncionarioDTO>> listar() {
        List<FuncionarioDTO> funcionarios = FuncionarioCollection.listar();
        return ResponseEntity.ok(funcionarios);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FuncionarioDTO> buscarPorId(@PathVariable Long id) {
        FuncionarioDTO funcionario = FuncionarioCollection.buscarPorId(id);
        return ResponseEntity.ok(funcionario);
    }

    @PostMapping
    public ResponseEntity<FuncionarioDTO> cadastrar(@Validated @RequestBody FuncionarioDTO funcionarioDTO) {
        FuncionarioDTO funcionarioCadastrado = FuncionarioCollection.cadastrar(funcionarioDTO);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(funcionarioCadastrado.getId()).toUri();
        return ResponseEntity.created(uri).body(funcionarioCadastrado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<FuncionarioDTO> atualizar(@PathVariable Long id, @Validated @RequestBody FuncionarioDTO funcionarioDTO) {
        FuncionarioDTO funcionarioAtualizado = FuncionarioCollection.atualizar(id, funcionarioDTO);
        return ResponseEntity.ok(funcionarioAtualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        FuncionarioCollection.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
