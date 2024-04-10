package com.api.futebol.domain.mapper;

import com.api.futebol.domain.dto.TabelaDTO;
import com.api.futebol.domain.entity.ClassificacaoEntity;
import com.api.futebol.domain.entity.TabelaEntity;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-10T14:23:27-0300",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 20.0.1 (Oracle Corporation)"
)
public class TabelaEntityMapperImpl implements TabelaEntityMapper {

    @Override
    public TabelaEntity convertToEntity(TabelaDTO tableDTO) {
        if ( tableDTO == null ) {
            return null;
        }

        TabelaEntity tabelaEntity = new TabelaEntity();

        tabelaEntity.setClassificacao( tableDTO.classificacao() );

        return tabelaEntity;
    }

    @Override
    public TabelaDTO convertToDto(TabelaEntity tableEntity) {
        if ( tableEntity == null ) {
            return null;
        }

        ClassificacaoEntity classificacao = null;

        classificacao = tableEntity.getClassificacao();

        TabelaDTO tabelaDTO = new TabelaDTO( classificacao );

        return tabelaDTO;
    }
}
