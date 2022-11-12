package com.digitalhouse.demoentrenador.service;

import com.digitalhouse.demoentrenador.model.Entrenador;

import java.util.List;

public interface EntrenadorService {
    Entrenador obtenerEntrenador();
    List<Entrenador> listaEntrenador();
}
