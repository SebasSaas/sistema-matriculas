package com.academia.sistema_matriculas.service;

import com.academia.sistema_matriculas.model.Docente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DocenteService {
    
    private final List<Docente> docentes = new ArrayList<>();
    private Long contadorId = 1L;
    
    public List<Docente> listarTodos() {
        return docentes;
    }
    
    public void crearDocente(Docente docente) {
        docente.setId(contadorId++);
        docentes.add(docente);
    }
}