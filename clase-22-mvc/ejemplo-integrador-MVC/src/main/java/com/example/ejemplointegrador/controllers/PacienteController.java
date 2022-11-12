package com.example.ejemplointegrador.controllers;

import com.example.ejemplointegrador.models.Paciente;
import com.example.ejemplointegrador.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/paciente")
public class PacienteController {

    // Esta es la otra forma de inyectar un service, por propiedad
    // Pero por constructor es la mejor manera y la recomendada
    @Autowired
    public PacienteService pacienteService;

    @GetMapping("/todos")
    public List<Paciente> getAllHandler(){
        return pacienteService.getAll();
    }

    @GetMapping("/email")
    public String getPacientByEmailHandler(
            // Esta es una anotación que no vimos, pero lo que hace es definir un parámetro para el método handler
            // en este caso, define el email, que si se fijan coincide con el definido en el PacienteService
            @RequestParam(name="name", required=false, defaultValue="esteEsUnEmailDePrueba") String email,
            Model model){

        Paciente paciente= pacienteService.getPacientByEmail(email);

        if(paciente == null) {
            return "no se encontro paciente con ese email";
        }

        /* Cada atributo que agregamos tiene una "clave"
        * (el primer argumento, el nombre que le damos para que el html lo reconozca)
        * y un valor (el segundo argumento, que va a ser el valor dinámico
        * que traemos de lo recuperado por los services)
        */
        model.addAttribute("name", paciente.getNombre());
        model.addAttribute("surname", paciente.getApellido());
        model.addAttribute("matricula", paciente.getOdontologo().getMatricula());

        /* cuando trabajamos con un controller devolviendo un modelo a la vista
        * lo que retornamos es la referencia a la vista, al template
        * solo que sin el .html, ya que por defecto, Spring entiende que es un html
         */
        return "email";
    }
}
