package com.api.futebol.repository;

import com.api.futebol.domains.domain.Campeonato;
import com.api.futebol.util.CampeonatoCreator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;
import java.util.Optional;

@DataJpaTest
@DisplayName("Tests for Campeonato repository")
public class CampeonatoRepositoryTest {

    @Autowired
    private CampeonatoRepository campeonatoRepository;

    @Test
    @DisplayName("Save persists campeonato when Successuful")
    void save_PersistCampeonato_WhenSuccessful(){
        Campeonato campeonatoToBeSaved = CampeonatoCreator.createCampeonatoToBeSaved();
        Campeonato campeonatoSaved = this.campeonatoRepository.save(campeonatoToBeSaved);

        Assertions.assertThat(campeonatoSaved).isNotNull();
        Assertions.assertThat(campeonatoSaved.getId()).isNotNull();
        Assertions.assertThat(campeonatoSaved.getName()).isEqualTo(campeonatoToBeSaved.getName());
        Assertions.assertThat(campeonatoSaved.getQuantidadeClubes()).isEqualTo(campeonatoToBeSaved.getQuantidadeClubes());
        Assertions.assertThat(campeonatoSaved.getTemporada()).isNotNull();

    }

    @Test
    @DisplayName("Delete campeonato when successful")
    void delete_RemoveCampeonato_WhenSuccessful(){
        Campeonato campeonatoToBeSaved = CampeonatoCreator.createCampeonatoToBeSaved();
        Campeonato campeonatoSaved = this.campeonatoRepository.save(campeonatoToBeSaved);

        this.campeonatoRepository.delete(campeonatoSaved);

        Optional<Campeonato> campeonatoOptional = this.campeonatoRepository.findById(campeonatoSaved.getId());
        Assertions.assertThat(campeonatoOptional).isEmpty();
    }

    @Test
    @DisplayName("Find by name return list of campeonato when successful")
    void findByName_ReturnListCampeonato_WhenSuccessful(){
        Campeonato campeonatoToBeSaved = CampeonatoCreator.createCampeonatoToBeSaved();
        Campeonato campeonatoSaved = this.campeonatoRepository.save(campeonatoToBeSaved);

        String name = campeonatoSaved.getName();

        List<Campeonato> listCampeonato = this.campeonatoRepository.findByName(name);

        Assertions.assertThat(listCampeonato)
                .isNotEmpty()
                .contains(campeonatoSaved);
    }

    @Test
    @DisplayName("Find by name return empty list when campeonato is empty")
    void findByName_ReturnsEmptyList_WhenCampeonatoNotFound(){
        List<Campeonato> campeonatos = this.campeonatoRepository.findByName("wasd");

        Assertions.assertThat(campeonatos).isEmpty();
    }
}
