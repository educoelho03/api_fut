package com.api.futebol.domain.dto;

import org.hibernate.annotations.Formula;

public record ClassificacaoDTO(
        Integer posicao,
        String clube,
        Integer pontos,
        Integer partidasJogadas,
        Integer vitorias,
        Integer empates,
        Integer derrotas,
        Integer golsMarcados,
        Integer golsSofridos,
        @Formula("golsMarcados - gols")
        Integer saldoDeGols
) {

    public ClassificacaoDTO(Integer posicao, String clube, Integer pontos, Integer partidasJogadas, Integer vitorias,
                            Integer empates, Integer derrotas, Integer golsMarcados, Integer golsSofridos, Integer saldoDeGols) {
        this.posicao = posicao;
        this.clube = clube;
        this.pontos = pontos;
        this.partidasJogadas = partidasJogadas;
        this.vitorias = vitorias;
        this.empates = empates;
        this.derrotas = derrotas;
        this.golsMarcados = golsMarcados;
        this.golsSofridos = golsSofridos;
        this.saldoDeGols = saldoDeGols;
    }
}
