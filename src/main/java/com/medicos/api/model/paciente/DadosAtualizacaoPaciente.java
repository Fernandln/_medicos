package com.medicos.api.model.paciente;

import com.medicos.api.model.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(String nome, String email, DadosEndereco endereco, String telefone, Integer id ) {
    
}
