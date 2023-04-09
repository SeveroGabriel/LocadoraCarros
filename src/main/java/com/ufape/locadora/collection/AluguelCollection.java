package com.ufape.locadora.collection;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ufape.locadora.Aluguel;
import com.ufape.locadora.repo.AluguelRepository;

@Service
public class AluguelCollection {

    @Autowired
    private AluguelRepository aluguelRepository;

    public List<Aluguel> buscarTodos() {
        return aluguelRepository.findAll();
    }

    public Aluguel buscarPorId(Long id) {
        return aluguelRepository.findById(id).orElseThrow(() -> new NotFoundException("Aluguel não encontrado"));
    }

    public Aluguel salvar(Aluguel aluguel) {
        return aluguelRepository.save(aluguel);
    }

    public void deletar(Long id) {
        Aluguel aluguel = buscarPorId(id);
        aluguelRepository.delete(aluguel);
    }
}
