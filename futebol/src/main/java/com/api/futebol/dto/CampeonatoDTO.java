package com.api.futebol.dto;

import com.api.futebol.domain.entity.TabelaEntity;

public record CampeonatoDTO(
        TabelaEntity tabela, String nome,
        String temporada,
        Integer quantidadeClubes) {
}
