package com.ufape.locadora.collection;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;

import com.ufape.locadora.Funcionario;

@Repository
public class FuncionarioCollectionImpl implements FuncionarioCollection {

    private final EntityManager entityManager;

    @Autowired
    public FuncionarioCollectionImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Funcionario> findAll() {
        return entityManager.createQuery("FROM Funcionario", Funcionario.class).getResultList();
    }

    @Override
    public Optional<Funcionario> findById(Long id) {
        return Optional.ofNullable(entityManager.find(Funcionario.class, id));
    }

    @Override
    public Funcionario save(Funcionario funcionario) {
        return entityManager.merge(funcionario);
    }

    @Override
    public void deleteById(Long id) {
        Funcionario funcionario = entityManager.find(Funcionario.class, id);
        entityManager.remove(funcionario);
    }
}
