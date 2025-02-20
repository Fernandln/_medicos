package com.medicos.api.model.medico;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;// abrevia e utiliza todas as anotations sinalizadas abaixo

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor // o grupo de anotations precisa estar diretamente acima da classe
@Entity
@Table(name = "medicos")
public class Medico {
    private String nome;
    private String email;
    private String crm;
    private Especialidade especialidade;
    private String endereco;

    
}
