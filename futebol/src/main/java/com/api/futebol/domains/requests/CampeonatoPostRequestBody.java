package com.api.futebol.domains.requests;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CampeonatoPostRequestBody {

    @NotEmpty(message = "the campeonato name cannot be null")
    private String nome;
    private String temporada;

    @NotEmpty(message = "the quantidade de clubes cannot be null")
    private int quantidadeClubes;
}
