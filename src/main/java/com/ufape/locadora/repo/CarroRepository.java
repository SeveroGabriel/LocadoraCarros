package com.ufape.locadora.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ufape.locadora.Carro;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {
}
