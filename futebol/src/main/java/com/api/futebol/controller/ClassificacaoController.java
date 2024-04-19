package com.api.futebol.controller;

import com.api.futebol.dto.ClassificacaoDTO;
import com.api.futebol.domain.entity.ClassificacaoEntity;
import com.api.futebol.domain.mapper.ClassificacaoEntityMapper;
import com.api.futebol.serviceImpl.ClassificacaoServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class ClassificacaoController {

    private final ClassificacaoServiceImpl classificacaoServiceImpl;
    private ClassificacaoEntityMapper classificacaoEntityMapper;

    public ClassificacaoController(ClassificacaoServiceImpl classificacaoServiceImpl) {
        this.classificacaoServiceImpl = classificacaoServiceImpl;
    }

    //APLICAR BOAS PRATICAS REST (MAPPER e ACTION)

    @GetMapping("/classificacao/brasileirao")
    public ResponseEntity<List<ClassificacaoDTO>> buscarClassificacao() {
        List<ClassificacaoEntity> classificacaoEntity = classificacaoServiceImpl.exibirClassificacao();
        List<ClassificacaoDTO> classificacaoDTO = classificacaoEntityMapper.convertToDtoList(classificacaoEntity);
        return new ResponseEntity<>(classificacaoDTO, HttpStatus.OK);
    }

    @GetMapping("/classificados/sul-americana")
    public ResponseEntity<List<ClassificacaoDTO>> classificadosSula(){
        List<ClassificacaoEntity> classificacaoEntity = classificacaoServiceImpl.listarTimesClassificadosSula();
        List<ClassificacaoDTO> classificacaoDTO = classificacaoEntityMapper.convertToDtoList(classificacaoEntity);
        return new ResponseEntity<>(classificacaoDTO, HttpStatus.OK);
    }

    @GetMapping("/rebaixados")
    public ResponseEntity<List<ClassificacaoDTO>> clubesRebaixados(){
        List<ClassificacaoEntity> classificacaoEntity = classificacaoServiceImpl.exibirTimesRebaixados();
        List<ClassificacaoDTO> classificacaoDTO = classificacaoEntityMapper.convertToDtoList(classificacaoEntity);
        return new ResponseEntity<>(classificacaoDTO, HttpStatus.OK);
    }
}
