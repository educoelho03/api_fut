package com.api.futebol.repository;

import com.api.futebol.domain.entity.ClassificacaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassificacaoRepository extends JpaRepository<ClassificacaoEntity, Long> {
}
