package com.api.futebol.domain.mapper;

import com.api.futebol.dto.CampeonatoDTO;
import com.api.futebol.domain.entity.CampeonatoEntity;
import org.mapstruct.Mapper;

@Mapper
public interface CampeonatoEntityMapper {
    CampeonatoEntity convertToEntity(CampeonatoDTO tableDTO);
    CampeonatoDTO convertToDto(CampeonatoEntity tableEntity);
}
