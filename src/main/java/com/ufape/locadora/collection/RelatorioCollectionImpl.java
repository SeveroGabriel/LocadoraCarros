package com.ufape.locadora.collection;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ufape.locadora.Relatorio;

import jakarta.persistence.EntityManager;

@Repository
public class RelatorioCollectionImpl implements RelatorioCollection {

    private final EntityManager entityManager;

    @Autowired
    public RelatorioCollectionImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Relatorio> findAll() {
        return entityManager.createQuery("FROM Relatorio", Relatorio.class).getResultList();
    }

    @Override
    public Optional<Relatorio> findById(Long id) {
        return Optional.ofNullable(entityManager.find(Relatorio.class, id));
    }

    @Override
    public Relatorio save(Relatorio relatorio) {
        return entityManager.merge(relatorio);
    }

    @Override
    public void deleteById(Long id) {
        Relatorio relatorio = entityManager.find(Relatorio.class, id);
        entityManager.remove(relatorio);
    }
}
