package com.ufape.locadora.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ufape.locadora.Reserva;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Long> {
    
}
