package com.api.futebol.dto;

import com.api.futebol.domain.entity.ClubeEntity;
import org.hibernate.annotations.Formula;

public record ClassificacaoDTO(
        Integer posicao,
        ClubeEntity clube,
        Integer pontos,
        Integer partidasJogadas,
        Integer vitorias,
        Integer empates,
        Integer derrotas,
        Integer golsMarcados,
        Integer golsSofridos
) {

    public ClassificacaoDTO(Integer posicao, ClubeEntity clube, Integer pontos, Integer partidasJogadas, Integer vitorias,
                            Integer empates, Integer derrotas, Integer golsMarcados, Integer golsSofridos) {
        this.posicao = posicao;
        this.clube = clube;
        this.pontos = pontos;
        this.partidasJogadas = partidasJogadas;
        this.vitorias = vitorias;
        this.empates = empates;
        this.derrotas = derrotas;
        this.golsMarcados = golsMarcados;
        this.golsSofridos = golsSofridos;
    }
}
