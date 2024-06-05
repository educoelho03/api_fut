package com.api.futebol.service;

import com.api.futebol.domains.domain.Campeonato;
import com.api.futebol.repository.CampeonatoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CampeonatoService {

    private CampeonatoRepository campeonatoRepository;

    public List<Campeonato> findByName(String name){
        return campeonatoRepository.findByName(name);
    }
}
