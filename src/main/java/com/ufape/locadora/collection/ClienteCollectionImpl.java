package com.ufape.locadora.collection;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ufape.locadora.Cliente;

import jakarta.persistence.EntityManager;

@Repository
public class ClienteCollectionImpl implements ClienteCollection {

    private final EntityManager entityManager;

    @Autowired
    public ClienteCollectionImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Cliente> findAll() {
        return entityManager.createQuery("FROM Cliente", Cliente.class).getResultList();
    }

    @Override
    public Optional<Cliente> findById(Long id) {
        return Optional.ofNullable(entityManager.find(Cliente.class, id));
    }

    @Override
    public Cliente save(Cliente cliente) {
        return entityManager.merge(cliente);
    }

    @Override
    public void deleteById(Long id) {
        Cliente cliente = entityManager.find(Cliente.class, id);
        entityManager.remove(cliente);
    }
}
