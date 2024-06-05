package com.api.futebol.domains.requests;

import com.api.futebol.domains.domain.Tabela;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CampeonatoPutRequestBody {

    private Long id;
    private Tabela tabela;
    private String nome;
    private String temporada;
    private Integer quantidadeClubes;
}
