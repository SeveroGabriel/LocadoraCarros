package com.ufape.locadora.collection;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;
import com.ufape.locadora.repo.FuncionarioRepository;
import com.ufape.locadora.Funcionario;

@Service
public class FuncionarioCollection {

    @Autowired
    private FuncionarioRepository repository;

    public List<Funcionario> listarFuncionarios() {
        return repository.findAll();
    }

    public Funcionario buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new NotFoundException("Funcionário não encontrado"));
    }

    public Funcionario salvarFuncionario(Funcionario funcionario) {
        return repository.save(funcionario);
    }

    public void excluirFuncionario(Long id) {
        repository.deleteById(id);
    }

}
