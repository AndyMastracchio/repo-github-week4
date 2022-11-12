package com.demospring.animales.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludo")
public class AnimalController {

    //@RequestMapping(value = "/saludo-animal", method = RequestMethod.GET)
    @GetMapping("/animal")
    public String miPrimerMetodoHandler() {
        return "Este es un saludo, animal!";
    }

    @GetMapping("/cordial")
    public String segundoMetodoHandler() {
        return "Este es un saludo más cordial...";
    }
}
