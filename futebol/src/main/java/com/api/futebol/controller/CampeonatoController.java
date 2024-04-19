package com.api.futebol.controller;

import com.api.futebol.domain.entity.CampeonatoEntity;
import com.api.futebol.domain.mapperImpl.CampeonatoEntityMapperImpl;
import com.api.futebol.dto.CampeonatoDTO;
import com.api.futebol.serviceImpl.CampeonatoServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/campeonato")
public class CampeonatoController {

    private final CampeonatoServiceImpl campeonatoService;
    private CampeonatoEntityMapperImpl campeonatoEntityMapper;

    public CampeonatoController(CampeonatoServiceImpl campeonatoService) {
        this.campeonatoService = campeonatoService;
    }

    // ESTOU MAPENADO UM ACTION(ADD) CORRIGIR ISSO
    @PostMapping("/add")
    public ResponseEntity<CampeonatoDTO> adicionarCampeonato(@RequestParam CampeonatoEntity campeonato){
        CampeonatoEntity campeonatoSalvo = campeonatoService.addCampeonato(campeonato.getNome(), campeonato.getTemporada(), campeonato.getQuantidadeClubes());
        CampeonatoDTO campeonatoDTO = campeonatoEntityMapper.convertToDto(campeonatoSalvo);

        return new ResponseEntity<>(campeonatoDTO, HttpStatus.CREATED);
    }

}
