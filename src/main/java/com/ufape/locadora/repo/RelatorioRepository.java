package com.ufape.locadora.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ufape.locadora.Relatorio;


@Repository
public interface RelatorioRepository extends JpaRepository<Relatorio, Long> {
}
