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
    private String nome;
    private String temporada;
    private Integer quantidadeClubes;

    public Long getId() {
        return id;
    }

    public TabelaEntity getTabela() {
        return tabela;
    }

    public void setTabela(TabelaEntity tabela) {
        this.tabela = tabela;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public int getQuantidadeClubes() {
        return quantidadeClubes;
    }

    public void setQuantidadeClubes(int quantidadeClubes) {
        this.quantidadeClubes = quantidadeClubes;
    }
}
