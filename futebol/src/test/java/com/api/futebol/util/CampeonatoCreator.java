package com.api.futebol.util;

import com.api.futebol.domains.domain.Campeonato;

public class CampeonatoCreator {

    public static Campeonato createCampeonatoToBeSaved(){
        return Campeonato.builder()
                .name("Brasileirão")
                .temporada("2024")
                .quantidadeClubes(20)
                .build();
    }

    public static Campeonato createValidCampeonato(){
        return Campeonato.builder()
                .id(1L)
                .name("Premier League")
                .temporada("2024")
                .quantidadeClubes(18)
                .build();
    }

}
