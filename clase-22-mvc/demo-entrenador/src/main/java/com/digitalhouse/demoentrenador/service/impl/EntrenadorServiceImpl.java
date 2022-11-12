package com.digitalhouse.demoentrenador.service.impl;

import com.digitalhouse.demoentrenador.model.Entrenador;
import com.digitalhouse.demoentrenador.service.EntrenadorService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class EntrenadorServiceImpl implements EntrenadorService {

    @Override
    public Entrenador obtenerEntrenador() {
        return new Entrenador("Pepito");
    }


    @Override
    public List<Entrenador> listaEntrenador() {
        return Arrays.asList(new Entrenador("Entrenador 1"),
                new Entrenador("Entrenador 2"));
    }
}
