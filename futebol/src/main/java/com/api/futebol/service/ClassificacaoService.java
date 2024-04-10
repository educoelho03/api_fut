package com.api.futebol.service;

import com.api.futebol.domain.entity.ClassificacaoEntity;
import com.api.futebol.repository.ClassificacaoRepository;
import org.springframework.stereotype.Service;

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
}
