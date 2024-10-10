package com.example.pruebajava.controller;

import com.example.pruebajava.model.TareaModel;
import com.example.pruebajava.service.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class TareaController {
    @Autowired
    private TareaService service;

    @GetMapping("/")
    public String inicio() {
        return "inicio";
    }

    @GetMapping("/tarea-nueva")
    public String tareaNueva(Model model) {
        model.addAttribute("tarea", new TareaModel());
        return "tarea-nueva";
    }

    @PostMapping("/guardar-tarea")
    public String guardarTarea(@ModelAttribute TareaModel tarea) {
        service.agregarTarea(tarea);
        return "redirect:/mostrar-tareas";
    }

    @GetMapping("/mostrar-tareas")
    public String listarTareas(Model model) {
        List<TareaModel> tareas = service.mostrarTareas();
        model.addAttribute("tareas", tareas);
        return "mostrar-tareas";
    }
}
