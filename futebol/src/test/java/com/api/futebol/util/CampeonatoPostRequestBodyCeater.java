package com.api.futebol.util;

import com.api.futebol.domains.requests.CampeonatoPostRequestBody;

public class CampeonatoPostRequestBodyCeater {
    public static CampeonatoPostRequestBody createCampeonatoPostRequestBody(){
        return CampeonatoPostRequestBody.builder()
                .nome(CampeonatoCreator.createCampeonatoToBeSaved().getName())
                .temporada(CampeonatoCreator.createCampeonatoToBeSaved().getTemporada())
                .quantidadeClubes(CampeonatoCreator.createCampeonatoToBeSaved().getQuantidadeClubes())
                .build();
    }
}
