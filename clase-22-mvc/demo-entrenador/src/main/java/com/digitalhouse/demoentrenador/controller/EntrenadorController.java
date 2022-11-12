package com.digitalhouse.demoentrenador.controller;

import com.digitalhouse.demoentrenador.model.Entrenador;
import com.digitalhouse.demoentrenador.service.EntrenadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class EntrenadorController {

    private final EntrenadorService entrenadorService;

    @Autowired
    public EntrenadorController(EntrenadorService entrenadorService) {
        this.entrenadorService = entrenadorService;
    }

    @GetMapping("/entrenador")
    public String getEntrenador(Model model) {
        Entrenador entrenador = entrenadorService.obtenerEntrenador();
        model.addAttribute("entrenador", entrenador);
        return "entrenador-view";
    }

    @GetMapping("/entrenadores")
    public String getEntrenadores(Model model) {
        List<Entrenador> listaEntrenador = entrenadorService.listaEntrenador();
        model.addAttribute("listaEntrenadores", listaEntrenador);
        return "entrenadores-view";
    }

}
