package com.ufape.locadora.collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufape.locadora.Carro;
import com.ufape.locadora.repo.CarroRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CarroCollection {

    @Autowired
    private CarroRepository carroRepository;

    public List<Carro> listar() {
        return carroRepository.findAll();
    }

    public Optional<Carro> buscar(Long id) {
        return carroRepository.findById(id);
    }

    public Carro criar(Carro carro) {
        return carroRepository.save(carro);
    }

    public Optional<Carro> atualizar(Long id, Carro carro) {
        Optional<Carro> carroOptional = carroRepository.findById(id);
        if (carroOptional.isPresent()) {
            Carro carroBanco = carroOptional.get();
            carroBanco.setMarca(carro.getMarca());
            carroBanco.setModelo(carro.getModelo());
            carroBanco.setAno(carro.getAno());
            carroRepository.save(carroBanco);
        }
        return carroOptional;
    }

    public void deletar(Long id) {
        carroRepository.deleteById(id);
    }
}
