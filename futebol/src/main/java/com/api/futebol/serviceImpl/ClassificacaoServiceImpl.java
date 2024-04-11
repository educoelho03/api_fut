package com.api.futebol.serviceImpl;

import com.api.futebol.domain.entity.ClassificacaoEntity;
import com.api.futebol.repository.ClassificacaoRepository;
import com.api.futebol.service.ClassificacaoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassificacaoServiceImpl extends ClassificacaoService {

    public ClassificacaoServiceImpl(ClassificacaoRepository classificacaoRepository) {
        super(classificacaoRepository);
    }

    public List<ClassificacaoEntity> exibirClassificacao() {
        return super.listarTimes();
    }

    public List<ClassificacaoEntity> exibirTimesClassificadosSula() {
        return super.listarTimesClassificadosSula();
    }

    public List<ClassificacaoEntity> exibirTimesRebaixados() {
        return super.listarTimesRebaixados();
    }
}
