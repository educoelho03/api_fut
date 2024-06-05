package com.api.futebol.domains.domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.Builder;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Campeonato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Tabela tabela;
    private String name;
    private String temporada;
    private Integer quantidadeClubes;

    public Long getId() {
        return id;
    }

    public Tabela getTabela() {
        return tabela;
    }

    public void setTabela(Tabela tabela) {
        this.tabela = tabela;
    }

    public String getName() {
        return name;
    }

    public void setName(String nome) {
        this.name = nome;
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
