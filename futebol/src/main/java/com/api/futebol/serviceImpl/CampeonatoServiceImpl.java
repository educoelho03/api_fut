package com.api.futebol.serviceImpl;

import com.api.futebol.domain.entity.CampeonatoEntity;
import com.api.futebol.repository.CampeonatoRepository;
import com.api.futebol.service.CampeonatoService;
import org.springframework.stereotype.Service;

@Service
public class CampeonatoServiceImpl extends CampeonatoService {

    public CampeonatoServiceImpl(CampeonatoRepository campeonatoRepository) {
        super(campeonatoRepository);
    }

    public CampeonatoEntity addCampeonato(String nome, String temporada, Integer quantidadeClubes){
        return super.adicionaCampeonato(nome, temporada, quantidadeClubes);
    }
}
