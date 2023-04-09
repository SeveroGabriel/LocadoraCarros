package com.ufape.locadora.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ufape.locadora.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
