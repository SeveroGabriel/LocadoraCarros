package com.ufape.locadora.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ufape.locadora.Aluguel;

@Repository
public interface AluguelRepository extends JpaRepository<Aluguel, Long> {

}
