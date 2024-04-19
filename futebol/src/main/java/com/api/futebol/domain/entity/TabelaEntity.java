package com.api.futebol.domain.entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tabelas")
@NoArgsConstructor
public class TabelaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    private List<ClassificacaoEntity> classificacoes;

    public List<ClassificacaoEntity> getClassificacao() {
        return classificacoes;
    }

    public void setClassificacao(List<ClassificacaoEntity> classificacao) {
        this.classificacoes = classificacao;
    }
}
