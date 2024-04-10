package com.api.futebol.domain.mapper;

import com.api.futebol.domain.dto.CampeonatoDTO;
import com.api.futebol.domain.entity.CampeonatoEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface CampeonatoEntityMapper {
    CampeonatoEntity convertToEntity(CampeonatoDTO tableDTO);
    CampeonatoDTO convertToDto(CampeonatoEntity tableEntity);
}
