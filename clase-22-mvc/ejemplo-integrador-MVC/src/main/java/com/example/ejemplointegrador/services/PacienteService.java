package com.example.ejemplointegrador.services;

import com.example.ejemplointegrador.models.Domicilio;
import com.example.ejemplointegrador.models.Odontologo;
import com.example.ejemplointegrador.models.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class PacienteService {

    private OdontologoService odontologoService = new OdontologoService();

    private List<Paciente> pacientes = new ArrayList<>();

    public PacienteService(){
        Domicilio domicilio = new Domicilio(101, "Callecita", 326,
                "De Tierra", "Tucson City");

        Paciente paciente = new Paciente(1L, "Rodriguez","Mariano",
                "esteEsUnEmailDePrueba", "38545656", LocalDate.of(2021,8,20),
                domicilio, odontologoService.getOdontologoById(1L));

        pacientes.add(paciente);
    }

    public List<Paciente> getAll(){
        return pacientes;
    }

    public Paciente getPacientByEmail(String email){
        for (Paciente paciente : pacientes) {
            if (paciente.getEmail().equals(email)) {
                return paciente;
            }
        }
        return null;
    }

    public void savePaciente(Paciente paciente){
        pacientes.add(paciente);
    }
}
