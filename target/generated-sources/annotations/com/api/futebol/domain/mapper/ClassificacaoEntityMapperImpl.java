package com.api.futebol.domain.mapper;

import com.api.futebol.domain.dto.ClassificacaoDTO;
import com.api.futebol.domain.entity.ClassificacaoEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-10T15:08:36-0300",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 20.0.1 (Oracle Corporation)"
)
public class ClassificacaoEntityMapperImpl implements ClassificacaoEntityMapper {

    @Override
    public ClassificacaoEntity convertToEntity(ClassificacaoDTO clubeDTO) {
        if ( clubeDTO == null ) {
            return null;
        }

        ClassificacaoEntity classificacaoEntity = new ClassificacaoEntity();

        classificacaoEntity.setPosicao( clubeDTO.posicao() );
        classificacaoEntity.setClube( clubeDTO.clube() );
        classificacaoEntity.setPontos( clubeDTO.pontos() );
        classificacaoEntity.setPartidasJogadas( clubeDTO.partidasJogadas() );
        classificacaoEntity.setVitorias( clubeDTO.vitorias() );
        classificacaoEntity.setEmpates( clubeDTO.empates() );
        classificacaoEntity.setDerrotas( clubeDTO.derrotas() );
        classificacaoEntity.setGolsMarcados( clubeDTO.golsMarcados() );
        classificacaoEntity.setGolsSofridos( clubeDTO.golsSofridos() );
        classificacaoEntity.setSaldoDeGols( clubeDTO.saldoDeGols() );

        return classificacaoEntity;
    }

    @Override
    public ClassificacaoDTO convertToDto(ClassificacaoEntity clubeEntity) {
        if ( clubeEntity == null ) {
            return null;
        }

        Integer posicao = null;
        String clube = null;
        Integer pontos = null;
        Integer partidasJogadas = null;
        Integer vitorias = null;
        Integer empates = null;
        Integer derrotas = null;
        Integer golsMarcados = null;
        Integer golsSofridos = null;
        Integer saldoDeGols = null;

        posicao = clubeEntity.getPosicao();
        clube = clubeEntity.getClube();
        pontos = clubeEntity.getPontos();
        partidasJogadas = clubeEntity.getPartidasJogadas();
        vitorias = clubeEntity.getVitorias();
        empates = clubeEntity.getEmpates();
        derrotas = clubeEntity.getDerrotas();
        golsMarcados = clubeEntity.getGolsMarcados();
        golsSofridos = clubeEntity.getGolsSofridos();
        saldoDeGols = clubeEntity.getSaldoDeGols();

        ClassificacaoDTO classificacaoDTO = new ClassificacaoDTO( posicao, clube, pontos, partidasJogadas, vitorias, empates, derrotas, golsMarcados, golsSofridos, saldoDeGols );

        return classificacaoDTO;
    }

    @Override
    public List<ClassificacaoDTO> convertToDtoList(List<ClassificacaoEntity> classificacaoEntityList) {
        if ( classificacaoEntityList == null ) {
            return null;
        }

        List<ClassificacaoDTO> list = new ArrayList<ClassificacaoDTO>( classificacaoEntityList.size() );
        for ( ClassificacaoEntity classificacaoEntity : classificacaoEntityList ) {
            list.add( convertToDto( classificacaoEntity ) );
        }

        return list;
    }
}
