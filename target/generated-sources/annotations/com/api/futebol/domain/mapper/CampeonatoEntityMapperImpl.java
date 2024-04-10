package com.api.futebol.domain.mapper;

import com.api.futebol.domain.dto.CampeonatoDTO;
import com.api.futebol.domain.entity.CampeonatoEntity;
import com.api.futebol.domain.entity.ClassificacaoEntity;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-10T15:08:35-0300",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 20.0.1 (Oracle Corporation)"
)
public class CampeonatoEntityMapperImpl implements CampeonatoEntityMapper {

    @Override
    public CampeonatoEntity convertToEntity(CampeonatoDTO tableDTO) {
        if ( tableDTO == null ) {
            return null;
        }

        CampeonatoEntity campeonatoEntity = new CampeonatoEntity();

        campeonatoEntity.setClassificacao( tableDTO.classificacao() );

        return campeonatoEntity;
    }

    @Override
    public CampeonatoDTO convertToDto(CampeonatoEntity tableEntity) {
        if ( tableEntity == null ) {
            return null;
        }

        ClassificacaoEntity classificacao = null;

        classificacao = tableEntity.getClassificacao();

        CampeonatoDTO campeonatoDTO = new CampeonatoDTO( classificacao );

        return campeonatoDTO;
    }
}
