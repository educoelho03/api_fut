package com.api.futebol.domain.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Formula;

@Entity
@Table(name = "classificacao")
@NoArgsConstructor
public class ClassificacaoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Max(20)
    @Min(1)
    private Long id;
    private Integer posicao;

    @ManyToOne
    private ClubeEntity clube;
    private Integer ponto;
    private Integer partidaJogada;
    private Integer vitoria;
    private Integer empate;
    private Integer derrota;
    private Integer golMarcado;
    private Integer golSofrido;
    private Integer temporada;

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
        return ponto;
    }

    public void setPontos(Integer pontos) {
        this.ponto = pontos;
    }

    public Integer getPartidasJogadas() {
        return partidaJogada;
    }

    public void setPartidasJogadas(Integer partidasJogadas) {
        this.partidaJogada = partidasJogadas;
    }

    public Integer getVitorias() {
        return vitoria;
    }

    public void setVitorias(Integer vitorias) {
        this.vitoria = vitorias;
    }

    public Integer getEmpates() {
        return empate;
    }

    public void setEmpates(Integer empates) {
        this.empate = empates;
    }

    public Integer getDerrotas() {
        return derrota;
    }

    public void setDerrotas(Integer derrotas) {
        this.derrota = derrotas;
    }

    public Integer getGolsMarcados() {
        return golMarcado;
    }

    public void setGolsMarcados(Integer golsMarcados) {
        this.golMarcado = golsMarcados;
    }

    public Integer getGolsSofridos() {
        return golSofrido;
    }

    public void setGolsSofridos(Integer golsSofridos) {
        this.golSofrido = golsSofridos;
    }

    public Integer getSaldoDeGols() {
        return saldoDeGol;
    }

    public void setSaldoDeGols(Integer saldoDeGols) {
        this.saldoDeGol = saldoDeGols;
    }

    public Integer getTemporada() {
        return temporada;
    }

    public void setTemporada(Integer temporada) {
        this.temporada = temporada;
    }
}
