package com.example.exerciciossb.controllers;

import com.example.exerciciossb.models.Cliente;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    
    @GetMapping("/qualquer")
    public Cliente obterCliente(){
        return new Cliente(19, "Bianca", "012.345.678-90");
    }
}
