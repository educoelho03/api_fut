package com.api.futebol.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ClubeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String anoFundacao;
    private String Estadio;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(String anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    public String getEstadio() {
        return Estadio;
    }

    public void setEstadio(String estadio) {
        Estadio = estadio;
    }

}
