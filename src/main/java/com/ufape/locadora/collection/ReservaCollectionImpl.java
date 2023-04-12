package com.ufape.locadora.collection;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.ufape.locadora.Carro;
import com.ufape.locadora.Cliente;
import com.ufape.locadora.Reserva;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ReservaCollectionImpl implements ReservaCollection {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(Reserva reserva) {
        em.persist(reserva);
    }

    @Override
    public void update(Reserva reserva) {
        em.merge(reserva);
    }

    @Override
    public void delete(Long id) {
        Reserva reserva = em.find(Reserva.class, id);
        if (reserva != null) {
            em.remove(reserva);
        }
    }

    @Override
    public Optional<Reserva> findById(Long id) {
        return Optional.ofNullable(em.find(Reserva.class, id));
    }

    @Override
    public List<Reserva> findAll() {
        return em.createQuery("SELECT r FROM Reserva r", Reserva.class)
                .getResultList();
    }

    @Override
    public List<Reserva> findByDataRetiradaBetween(LocalDate start, LocalDate end) {
        return em.createQuery("SELECT r FROM Reserva r WHERE r.dataRetirada BETWEEN :start AND :end", Reserva.class)
                .setParameter("start", start)
                .setParameter("end", end)
                .getResultList();
    }

    @Override
    public List<Reserva> findByDataDevolucaoBetween(LocalDate start, LocalDate end) {
        return em.createQuery("SELECT r FROM Reserva r WHERE r.dataDevolucao BETWEEN :start AND :end", Reserva.class)
                .setParameter("start", start)
                .setParameter("end", end)
                .getResultList();
    }

    @Override
    public List<Reserva> findByCarro(Carro carro) {
        return em.createQuery("SELECT r FROM Reserva r WHERE r.carro = :carro", Reserva.class)
                .setParameter("carro", carro)
                .getResultList();
    }

    @Override
    public List<Reserva> findByCliente(Cliente cliente) {
        return em.createQuery("SELECT r FROM Reserva r WHERE r.cliente = :cliente", Reserva.class)
                .setParameter("cliente", cliente)
                .getResultList();
    }

}
