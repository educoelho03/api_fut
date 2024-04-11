package com.api.futebol.service;

import com.api.futebol.domain.entity.ClassificacaoEntity;
import com.api.futebol.repository.ClassificacaoRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ClassificacaoService {

    private final ClassificacaoRepository classificacaoRepository;

    public ClassificacaoService(ClassificacaoRepository classificacaoRepository) {
        this.classificacaoRepository = classificacaoRepository;
    }

    public List<ClassificacaoEntity> listarTimes(){
        return classificacaoRepository.findAll();
    }

    public List<ClassificacaoEntity> listarTimesClassificadosSula(){
        return classificacaoRepository.findAll().subList(6, 12);
    }

    public  List<ClassificacaoEntity> listarTimesRebaixados(){
        List<ClassificacaoEntity> lista =  classificacaoRepository.findAll();
        Collections.reverse(lista);
        return lista.subList(0, 3);
    }
}
