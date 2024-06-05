package com.api.futebol.domains.domain;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tabelas")
@NoArgsConstructor
public class Tabela {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    private List<Classificacao> classificacoes;

    public List<Classificacao> getClassificacao() {
        return classificacoes;
    }

    public void setClassificacao(List<Classificacao> classificacao) {
        this.classificacoes = classificacao;
    }
}
