package com.ufape.locadora.collection;

import java.util.List;

import com.ufape.locadora.Aluguel;
import com.ufape.locadora.Carro;
import com.ufape.locadora.Cliente;
import com.ufape.locadora.DTO.AluguelDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class AluguelCollectionImpl implements AluguelCollection {

    private final EntityManagerFactory entityManagerFactory;
    private final EntityManager entityManager;
	private Aluguel[] aluguel;

    public AluguelCollectionImpl() {
        entityManagerFactory = Persistence.createEntityManagerFactory("default");
        entityManager = entityManagerFactory.createEntityManager();
    }

    @Override
    public void save(Aluguel aluguel) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(aluguel);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            throw new RuntimeException("erro ao salvar aluguel", e);
        }
    }

    @Override
    public void remove(Aluguel aluguel) {
        try {
            entityManager.getTransaction().begin();
            entityManager.remove(aluguel);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            throw new RuntimeException("Erro ao remover aluguel", e);
        }
    }

    @Override
    public List<Aluguel> getAll() {
        TypedQuery<Aluguel> query = entityManager.createQuery("SELECT a FROM Aluguel a", Aluguel.class);
        return query.getResultList();
    }

    @Override
    public List<Aluguel> getByCliente(Cliente cliente) {
        TypedQuery<Aluguel> query = entityManager.createQuery(
                "SELECT a FROM Aluguel a WHERE a.cliente = :cliente", Aluguel.class);
        query.setParameter("cliente", cliente);
        return query.getResultList();
    }

    @Override
    public List<Aluguel> getByCarro(Carro carro) {
        TypedQuery<Aluguel> query = entityManager.createQuery(
                "SELECT a FROM Aluguel a WHERE a.carro = :carro", Aluguel.class);
        query.setParameter("carro", carro);
        return query.getResultList();
    }


	@Override
	public List<Aluguel> findAll() {
		return null;
	}
	
	@Override
	public AluguelDTO getById(Long id) {
	    for (Aluguel aluguel : aluguel) {
	        if (aluguel.getId().equals(id)) {
	            return aluguel;
	        }
	    }
	    return null;
	}

	@Override
	public boolean existe(Long id) {
		return false;
	}

	@Override
	public void deletarPorId(Long id) {		
	}

	@Override
	public AluguelDTO save(AluguelDTO aluguelDTO) {
		return null;
	}

}
