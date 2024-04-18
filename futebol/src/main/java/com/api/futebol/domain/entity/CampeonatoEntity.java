package com.api.futebol.domain.entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "campeonatos")
@NoArgsConstructor
public class CampeonatoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private TabelaEntity tabela;

    public Long getId() {
        return id;
    }

    public TabelaEntity getTabela() {
        return tabela;
    }

    public void setTabela(TabelaEntity tabela) {
        this.tabela = tabela;
    }
}
