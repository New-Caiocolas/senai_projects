package com.example.aula.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @GetMapping("/")
    public String mensagem() {
            return "Bem-vindo!";
    }

    @GetMapping("/dev")
    public String dev(){
        return "caio";
    }

    @GetMapping("/dev/curso")
    public String curso(){
        return "curso:caio";
    }

    @GetMapping("/dev/contato")
    public String contato(){
        return "caiocoals2304@gmail.com";
    }

}
