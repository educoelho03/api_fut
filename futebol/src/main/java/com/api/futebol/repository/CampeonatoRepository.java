package com.api.futebol.repository;

import com.api.futebol.domain.entity.CampeonatoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampeonatoRepository extends JpaRepository<CampeonatoEntity, Long> {
}
