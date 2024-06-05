package com.api.futebol.util;

import com.api.futebol.domains.requests.CampeonatoPutRequestBody;

public class CampeonatoPutRequestBodyCeater {
    public static CampeonatoPutRequestBody createCampeonatoPutRequestBody(){
        return CampeonatoPutRequestBody.builder()
                .id(CampeonatoCreator.createCampeonatoToBeSaved().getId())
                .tabela(CampeonatoCreator.createCampeonatoToBeSaved().getTabela())
                .nome(CampeonatoCreator.createCampeonatoToBeSaved().getName())
                .temporada(CampeonatoCreator.createCampeonatoToBeSaved().getTemporada())
                .quantidadeClubes(CampeonatoCreator.createCampeonatoToBeSaved().getQuantidadeClubes())
                .build();
    }
}
