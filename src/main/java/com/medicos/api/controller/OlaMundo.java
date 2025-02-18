package com.medicos.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/olamundo") // informa qual sera o endpoint acessado que vai chamar a classe olaMundo
@RestController  // informa ao spring boot que a classe ola mundo é uma classe do tipo controladora.
public class OlaMundo {
    
    @GetMapping // informa que o metodo sera invocado quando o get acontecer.
    public String olaMundo(){
        return "Olá Mundo";
    }
    
}


