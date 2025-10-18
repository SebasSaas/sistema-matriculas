package com.academia.sistema_matriculas.controller;

import com.academia.sistema_matriculas.model.Docente;
import com.academia.sistema_matriculas.service.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/docentes")
public class DocenteController {
    
    @Autowired
    private DocenteService docenteService;
    
    @GetMapping
    public String listarDocentes(Model model) {
        model.addAttribute("docentes", docenteService.listarTodos());
        model.addAttribute("nuevoDocente", new Docente());
        return "docente";
    }
    
    @PostMapping("/crear")
    public String crearDocente(@ModelAttribute Docente docente) {
        docenteService.crearDocente(docente);
        return "redirect:/docentes";
    }
}