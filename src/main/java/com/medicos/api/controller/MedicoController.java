package com.medicos.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.medicos.api.model.medico.MedicoRepository;
import com.medicos.api.model.medico.DadosAtualizacaoMedico;
import com.medicos.api.model.medico.DadosCadastroMedico;
import com.medicos.api.model.medico.Medico;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/medicos")
public class MedicoController {
    
    @Autowired // Sobreescrevendo algo, é um padrao utilizado na injeção de dependencias
    private MedicoRepository repository;


    // CREATE
    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroMedico dados){
        repository.save(new Medico(dados));

    }
    // UPDATE
    @PutMapping
    @Transactional
    public void atualizar(@RequestBody DadosAtualizacaoMedico dados) {
        var medico = repository.getReferenceById(dados.id());
        medico.atualizarInformacoes(dados);
    }
    //DELETE
    // @DeleteMapping("/{id}")
    // @Transactional
    // public void excluir(@PathVariable Integer id){
    //     repository.deleteById(id);

    // }
    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Integer id){
        var medico = repository.getReferenceById(id);
        medico.deletar();
    }
    // READ
    // @GetMapping
    // public String exibir() {
    //     return ;
    // }
    
    
}
