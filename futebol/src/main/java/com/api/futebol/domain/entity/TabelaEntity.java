package com.api.futebol.domain.entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tabela")
@NoArgsConstructor
public class TabelaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    private List<ClassificacaoEntity> classificacao;

    public List<ClassificacaoEntity> getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(List<ClassificacaoEntity> classificacao) {
        this.classificacao = classificacao;
    }
}
