package com.api.futebol.domain.mapperImpl;

import com.api.futebol.dto.CampeonatoDTO;
import com.api.futebol.domain.entity.CampeonatoEntity;
import com.api.futebol.domain.mapper.CampeonatoEntityMapper;

public class CampeonatoEntityMapperImpl implements CampeonatoEntityMapper {
    @Override
    public CampeonatoEntity convertToEntity(CampeonatoDTO campeonatoDTO) {
        if(campeonatoDTO == null){
            return null;
        }

        CampeonatoEntity campeonatoEntity = new CampeonatoEntity();

        campeonatoEntity.setTabela(campeonatoDTO.tabela());
        campeonatoEntity.setNome(campeonatoDTO.nome());
        campeonatoEntity.setTemporada(campeonatoDTO.temporada());
        campeonatoEntity.setQuantidadeClubes(campeonatoDTO.quantidadeClubes());

        return campeonatoEntity;
    }

    @Override
    public CampeonatoDTO convertToDto(CampeonatoEntity campeonatoEntity) {
        if(campeonatoEntity == null){
            return null;
        }

        return new CampeonatoDTO(
                campeonatoEntity.getTabela(),
                campeonatoEntity.getNome(),
                campeonatoEntity.getTemporada(),
                campeonatoEntity.getQuantidadeClubes());
    }
}
