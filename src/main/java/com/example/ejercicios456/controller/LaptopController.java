package com.example.ejercicios456.controller;

import com.example.ejercicios456.entities.Laptop;
import com.example.ejercicios456.repository.LaptopRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LaptopController {

    private LaptopRepository laptopRepository;

    public LaptopController(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    @GetMapping("/app")
    public String Saludo (){
        return "Hola";
    }

    @GetMapping("/all")
    public List<Laptop> findAll(){
        return laptopRepository.findAll();
    }

    @PostMapping("/save")
    public Laptop create(@RequestBody Laptop laptop){
        return laptopRepository.save(laptop);
    }


}
