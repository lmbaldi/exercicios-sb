package com.example.exerciciossb.controllers;

import com.example.exerciciossb.models.Cliente;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    
    @GetMapping("/qualquer")
    public Cliente obterCliente(){
        return new Cliente(19, "Bianca", "012.345.678-90");
    }

    @GetMapping("/{id}")
    public Cliente obterClientePorId1(@PathVariable int id){
        return new Cliente(id, "Caio", "852.369.741-78");
    }

    @GetMapping
    public Cliente obterClientePorId2(@RequestParam(name="id") int id){
        return new Cliente(id, "Bruna", "111.369.555-77");
    }
}
