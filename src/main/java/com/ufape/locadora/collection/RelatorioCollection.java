package com.ufape.locadora.collection;

import java.util.List;
import java.util.Optional;

import com.ufape.locadora.Relatorio;

public interface RelatorioCollection {
    List<Relatorio> findAll();
    Optional<Relatorio> findById(Long id);
    Relatorio save(Relatorio relatorio);
    void deleteById(Long id);
}
