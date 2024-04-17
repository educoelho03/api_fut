package com.api.futebol.domain.mapperImpl;

import com.api.futebol.domain.dto.ClassificacaoDTO;
import com.api.futebol.domain.entity.ClassificacaoEntity;
import com.api.futebol.domain.mapper.ClassificacaoEntityMapper;

import java.util.ArrayList;
import java.util.List;

public class ClassificacaoEntityMapperImpl implements ClassificacaoEntityMapper {
    @Override
    public ClassificacaoEntity convertToEntity(ClassificacaoDTO classificacaoDTO) {
        if(classificacaoDTO == null){
            return null;
        }

        ClassificacaoEntity classificacaoEntity = new ClassificacaoEntity();

        classificacaoEntity.setPosicao(classificacaoDTO.posicao());
        classificacaoEntity.setClubeEntity(classificacaoDTO.clubeEntity());
        classificacaoEntity.setPontos(classificacaoDTO.pontos());
        classificacaoEntity.setPartidasJogadas(classificacaoDTO.partidasJogadas());
        classificacaoEntity.setVitorias(classificacaoDTO.vitorias());
        classificacaoEntity.setEmpates(classificacaoDTO.empates());
        classificacaoEntity.setDerrotas(classificacaoDTO.derrotas());
        classificacaoEntity.setGolsMarcados(classificacaoDTO.golsMarcados());
        classificacaoEntity.setGolsSofridos(classificacaoDTO.golsSofridos());
        classificacaoEntity.setTemporada(classificacaoDTO.temporada());
        classificacaoEntity.setSaldoDeGols(classificacaoDTO.saldoDeGols());

        return classificacaoEntity;
    }

    @Override
    public ClassificacaoDTO convertToDto(ClassificacaoEntity classificacaoEntity) {
        if(classificacaoEntity == null){
            return null;
        }

        return new ClassificacaoDTO(
                classificacaoEntity.getPosicao(),
                classificacaoEntity.getClubeEntity(),
                classificacaoEntity.getPontos(),
                classificacaoEntity.getPartidasJogadas(),
                classificacaoEntity.getVitorias(),
                classificacaoEntity.getEmpates(),
                classificacaoEntity.getDerrotas(),
                classificacaoEntity.getGolsMarcados(),
                classificacaoEntity.getGolsSofridos(),
                classificacaoEntity.getTemporada(),
                classificacaoEntity.getSaldoDeGols()
        );
    }

    @Override
    public List<ClassificacaoDTO> convertToDtoList(List<ClassificacaoEntity> classificacaoEntityList) {
        List<ClassificacaoDTO> classificacaoDTOList = new ArrayList<>();
        for (ClassificacaoEntity classificacaoEntity : classificacaoEntityList) {
            classificacaoDTOList.add(convertToDto(classificacaoEntity));
        }
        return classificacaoDTOList;
    }
}
