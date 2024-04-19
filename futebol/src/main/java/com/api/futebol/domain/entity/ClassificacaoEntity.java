package com.api.futebol.domain.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Formula;

@Entity
@Table(name = "classificacoes")
@NoArgsConstructor
public class ClassificacaoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer posicao;

    @ManyToOne
    private ClubeEntity clube;
    private Integer pontos;
    private Integer partidasJogadas;
    private Integer vitorias;
    private Integer empates;
    private Integer derrotas;
    private Integer golsMarcados;
    private Integer golsSofridos;

    @Formula("golsMarcados - golsSofridos")
    private Integer saldoDeGol;

    public Long getId() {
        return id;
    }

    public Integer getPosicao() {
        return posicao;
    }

    public void setPosicao(Integer posicao) {
        this.posicao = posicao;
    }

    public ClubeEntity getClubeEntity() {
        return clube;
    }

    public void setClubeEntity(ClubeEntity clubeEntity) {
        this.clube = clubeEntity;
    }

    public Integer getPontos() {
        return pontos;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }

    public Integer getPartidasJogadas() {
        return partidasJogadas;
    }

    public void setPartidasJogadas(Integer partidasJogadas) {
        this.partidasJogadas = partidasJogadas;
    }

    public Integer getVitorias() {
        return vitorias;
    }

    public void setVitorias(Integer vitorias) {
        this.vitorias = vitorias;
    }

    public Integer getEmpates() {
        return empates;
    }

    public void setEmpates(Integer empates) {
        this.empates = empates;
    }

    public Integer getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(Integer derrotas) {
        this.derrotas = derrotas;
    }

    public Integer getGolsMarcados() {
        return golsMarcados;
    }

    public void setGolsMarcados(Integer golsMarcados) {
        this.golsMarcados = golsMarcados;
    }

    public Integer getGolsSofridos() {
        return golsSofridos;
    }

    public void setGolsSofridos(Integer golsSofridos) {
        this.golsSofridos = golsSofridos;
    }
}
