package com.api.futebol.domain.entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Campeonato")
@NoArgsConstructor
public class CampeonatoEntity {

    // vai ter uma lista de classificações 1 classificacao = 1 linha da tabela
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private ClassificacaoEntity classificacao;

    public Long getId() {
        return id;
    }

    public ClassificacaoEntity getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(ClassificacaoEntity classificacao) {
        this.classificacao = classificacao;
    }
}
