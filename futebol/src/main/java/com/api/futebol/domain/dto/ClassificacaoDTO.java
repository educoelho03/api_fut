package com.api.futebol.domain.dto;

import com.api.futebol.domain.entity.ClubeEntity;
import org.hibernate.annotations.Formula;

public record ClassificacaoDTO(
        Integer posicao,
        ClubeEntity clubeEntity,
        Integer pontos,
        Integer partidasJogadas,
        Integer vitorias,
        Integer empates,
        Integer derrotas,
        Integer golsMarcados,
        Integer golsSofridos,
        Integer temporada,

        @Formula("golsMarcados - gols")
        Integer saldoDeGols
) {

    public ClassificacaoDTO(Integer posicao, ClubeEntity clubeEntity, Integer pontos, Integer partidasJogadas, Integer vitorias,
                            Integer empates, Integer derrotas, Integer golsMarcados, Integer golsSofridos, Integer temporada, Integer saldoDeGols) {
        this.posicao = posicao;
        this.clubeEntity = clubeEntity;
        this.pontos = pontos;
        this.partidasJogadas = partidasJogadas;
        this.vitorias = vitorias;
        this.empates = empates;
        this.derrotas = derrotas;
        this.golsMarcados = golsMarcados;
        this.golsSofridos = golsSofridos;
        this.temporada = temporada;
        this.saldoDeGols = saldoDeGols;
    }
}
