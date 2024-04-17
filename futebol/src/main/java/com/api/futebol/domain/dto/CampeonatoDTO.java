package com.api.futebol.domain.dto;

import com.api.futebol.domain.entity.ClassificacaoEntity;

public record CampeonatoDTO(
        ClassificacaoEntity classificacao,
        Integer temporada
) {
}
