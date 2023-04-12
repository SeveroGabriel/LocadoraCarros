package com.ufape.locadora.collection;

import java.util.List;
import java.util.Optional;

import com.ufape.locadora.Funcionario;

public interface FuncionarioCollection {
    List<Funcionario> findAll();
    Optional<Funcionario> findById(Long id);
    Funcionario save(Funcionario funcionario);
    void deleteById(Long id);
}
