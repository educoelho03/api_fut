package com.api.futebol.domain.mapper;

import com.api.futebol.domain.entity.CampeonatoEntity;
import com.api.futebol.domain.entity.TabelaEntity;
import com.api.futebol.dto.CampeonatoDTO;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-19T10:26:50-0300",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 20.0.1 (Oracle Corporation)"
)
public class CampeonatoEntityMapperImpl implements CampeonatoEntityMapper {

    @Override
    public CampeonatoEntity convertToEntity(CampeonatoDTO tableDTO) {
        if ( tableDTO == null ) {
            return null;
        }

        CampeonatoEntity campeonatoEntity = new CampeonatoEntity();

        campeonatoEntity.setTabela( tableDTO.tabela() );
        campeonatoEntity.setNome( tableDTO.nome() );
        campeonatoEntity.setTemporada( tableDTO.temporada() );
        if ( tableDTO.quantidadeClubes() != null ) {
            campeonatoEntity.setQuantidadeClubes( tableDTO.quantidadeClubes() );
        }

        return campeonatoEntity;
    }

    @Override
    public CampeonatoDTO convertToDto(CampeonatoEntity tableEntity) {
        if ( tableEntity == null ) {
            return null;
        }

        TabelaEntity tabela = null;
        String nome = null;
        String temporada = null;
        Integer quantidadeClubes = null;

        tabela = tableEntity.getTabela();
        nome = tableEntity.getNome();
        temporada = tableEntity.getTemporada();
        quantidadeClubes = tableEntity.getQuantidadeClubes();

        CampeonatoDTO campeonatoDTO = new CampeonatoDTO( tabela, nome, temporada, quantidadeClubes );

        return campeonatoDTO;
    }
}
