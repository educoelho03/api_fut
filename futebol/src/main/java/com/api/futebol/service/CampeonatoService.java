package com.api.futebol.service;

import com.api.futebol.domain.entity.CampeonatoEntity;
import com.api.futebol.repository.CampeonatoRepository;
import org.springframework.stereotype.Service;

@Service
public class CampeonatoService {

    private final CampeonatoRepository campeonatoRepository;

    public CampeonatoService(CampeonatoRepository campeonatoRepository) {
        this.campeonatoRepository = campeonatoRepository;
    }

    public CampeonatoEntity adicionaCampeonato(String nome, String temporada, Integer quantidadeClubes){
        CampeonatoEntity campeonato = new CampeonatoEntity();
        campeonato.setNome(nome);
        campeonato.setTemporada(temporada);
        campeonato.setQuantidadeClubes(quantidadeClubes);
        return campeonatoRepository.save(campeonato);
    }


}
