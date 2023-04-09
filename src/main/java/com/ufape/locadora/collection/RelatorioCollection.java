package com.ufape.locadora.collection;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;
import com.ufape.locadora.Relatorio;
import com.ufape.locadora.repo.RelatorioRepository;

@Service
public class RelatorioCollection {

    @Autowired
    private RelatorioRepository repository;

    public List<Relatorio> listarRelatorios() {
        return repository.findAll();
    }

    public Relatorio buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new NotFoundException("Relatório não encontrado"));
    }

    public Relatorio salvarRelatorio(Relatorio relatorio) {
        return repository.save(relatorio);
    }

    public void excluirRelatorio(Long id) {
        repository.deleteById(id);
    }

}
