package com.ufape.locadora.repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ufape.locadora.Carro;

public interface CarroRepository extends JpaRepository<Carro, Long> {
    
    List<Carro> findByMarca(String marca);
    
}