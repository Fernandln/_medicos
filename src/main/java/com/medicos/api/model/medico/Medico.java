package com.medicos.api.model.medico;

import com.medicos.api.model.endereco.Endereco;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;// abrevia e utiliza todas as anotations sinalizadas abaixo

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor // o grupo de anotations precisa estar diretamente acima da classe
@Entity
@Table(name = "medicos")

public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; // vai ser uma primary key 🤓☝
    private String nome;
    private String email;
    private String crm;
    private Boolean visivel = true;
    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;


    @Embedded
    private Endereco endereco;


    

    public Medico(DadosCadastroMedico dados){
        this.nome = dados.nome();
        this.email = dados.email();
        this.crm = dados.crm();
        this.especialidade = dados.especialidade();
        this.endereco = new Endereco(dados.endereco());
    }

    // Metodo responsavel por realizar a verificaração de qual campo esta sendo atualizado

    public void atualizarInformacoes(DadosAtualizacaoMedico dados){
        if (dados.nome() != null) {
            this.nome = dados.nome();
        }
        if (dados.email() != null) {
            this.email = dados.email();
        }
        if (dados.endereco() != null) {
            this.endereco.atualizarInformacoes(dados.endereco());
        }
        
    }

    public void deletar(){
        this.visivel = false;
    }

}