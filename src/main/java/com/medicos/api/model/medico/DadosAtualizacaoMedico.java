package com.medicos.api.model.medico;

import com.medicos.api.model.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(String nome, DadosEndereco endereco, String email, Integer id ) {
    
}
