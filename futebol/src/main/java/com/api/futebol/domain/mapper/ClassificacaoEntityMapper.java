package com.api.futebol.domain.mapper;

import com.api.futebol.dto.ClassificacaoDTO;
import com.api.futebol.domain.entity.ClassificacaoEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ClassificacaoEntityMapper {
    ClassificacaoEntity convertToEntity(ClassificacaoDTO clubeDTO);
    ClassificacaoDTO convertToDto(ClassificacaoEntity clubeEntity);

    List<ClassificacaoDTO> convertToDtoList(List<ClassificacaoEntity> classificacaoEntityList);

}
