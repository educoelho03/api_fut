package com.api.futebol.domain.entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Campeonatos")
@NoArgsConstructor
public class CampeonatoEntity {

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
