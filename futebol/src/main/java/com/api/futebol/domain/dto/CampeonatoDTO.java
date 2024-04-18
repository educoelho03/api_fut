package com.api.futebol.domain.dto;

import com.api.futebol.domain.entity.ClassificacaoEntity;
import com.api.futebol.domain.entity.TabelaEntity;

public record CampeonatoDTO(
        TabelaEntity tabela) {
}
