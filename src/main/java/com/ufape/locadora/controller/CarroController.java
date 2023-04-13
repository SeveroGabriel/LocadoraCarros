package com.ufape.locadora.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ufape.locadora.Carro;
import com.ufape.locadora.collection.CarroCollection;

@RestController
@RequestMapping("/carros")
public class CarroController {

    private final CarroCollection carroCollection;

    public CarroController(CarroCollection carroCollection) {
        this.carroCollection = carroCollection;
    }

    @PostMapping
    public Carro create(@RequestBody Carro carro) {
        return carroCollection.criar(carro);
    }

    @GetMapping("/{id}")
    public Carro findById(@PathVariable Long id) {
        return carroCollection.buscarPorId(id);
    }

    @GetMapping
    public List<Carro> findAll() {
        return carroCollection.listarTodos();
    }

    @PutMapping("/{id}")
    public Carro update(@PathVariable Long id, @RequestBody Carro carro) {
        return carroCollection.atualizar(id, carro);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        carroCollection.deletar(id);
    }
}
