package com.digitalhouse.demoentrenador.service.impl;

import com.digitalhouse.demoentrenador.model.Entrenador;
import com.digitalhouse.demoentrenador.service.EntrenadorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EntrenadorServiceImplTest {

    EntrenadorService entrenadorService;

    @BeforeEach
    void setUp() {
        entrenadorService = new EntrenadorServiceImpl();
    }

    @Test
    public void cuandoBuscoUnEntrenador_entoncesObtengoRespuestaOk() {
        // GIVEN

        // WHEN
        Entrenador entrenador = entrenadorService.obtenerEntrenador();

        // THEN
        assertNotNull(entrenador);
    }

    @Test
    public void cuandoBuscoUnaListaEntrenador_entoncesObtengoUnaListaLlena() {
        // GIVEN
        List<Entrenador> listaEntrenadores = new ArrayList<>();

        // WHEN
        listaEntrenadores = entrenadorService.listaEntrenador();

        // THEN
        assertEquals(2, listaEntrenadores.size());

    }

    // TODO: se podría seguir haciendo tests unitarios de otros casos
    //  + como verificar listas desiguales o verificar que viene null al obtener un entrenador
    //  + si igualamos a null lo que retorna nuestro servicio, etc, etc...

}