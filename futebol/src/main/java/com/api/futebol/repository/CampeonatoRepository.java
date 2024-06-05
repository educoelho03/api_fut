package com.api.futebol.repository;

import com.api.futebol.domains.domain.Campeonato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CampeonatoRepository extends JpaRepository<Campeonato, Long> {
    List<Campeonato> findByName(String name);
}
