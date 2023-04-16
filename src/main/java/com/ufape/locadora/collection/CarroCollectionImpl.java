package com.ufape.locadora.collection;

import java.util.List;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

import com.ufape.locadora.Carro;

@Repository
public abstract class CarroCollectionImpl implements CarroCollection {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Carro> listarTodos() {
        TypedQuery<Carro> query = entityManager.createQuery("SELECT c FROM Carro c", Carro.class);
        return query.getResultList();
    }

    @Override
    public Carro buscarPorId(Long id) {
        return entityManager.find(Carro.class, id);
    }

    @Override
    public Carro salvar(Carro carro) {
        return entityManager.merge(carro);
    }

    @Override
    public void deletar(Long id) {
        Carro carro = buscarPorId(id);
        if (carro != null) {
            entityManager.remove(carro);
        }
    }
}
