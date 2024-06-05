package com.api.futebol.domains.mappers;

import com.api.futebol.domains.domain.Campeonato;
import com.api.futebol.domains.requests.CampeonatoPostRequestBody;
import com.api.futebol.domains.requests.CampeonatoPutRequestBody;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring") // facilitar o uso de injeção d dependencia
public abstract class CampeonatoMapper {

    public abstract Campeonato toCampeonato(CampeonatoPostRequestBody campeonatoPostRequestBody);
    public abstract Campeonato toCampeonato(CampeonatoPutRequestBody campeonatoPutRequestBody);
}
