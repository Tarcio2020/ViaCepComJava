package com.github.Tarcio2020.viaCep.ConsumindoApiViaCep.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.Tarcio2020.viaCep.ConsumindoApiViaCep.model.Endereco;
import com.github.Tarcio2020.viaCep.ConsumindoApiViaCep.service.ViaCepService;

@RestController
@RequestMapping("/end")
public class EnderecoController {
    public static void main(String[] args) {

        ViaCepService viaCepService = new ViaCepService();

        try {
            Endereco endereco = viaCepService.getEndereco("01001000");
            
            System.out.println(endereco);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
