package com.example.pruebajava.service;

import com.example.pruebajava.mapper.TareaMapper;
import com.example.pruebajava.model.TareaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareaService {
    @Autowired
    private TareaMapper tareaMapper;

    public void agregarTarea(TareaModel tarea) {
        tareaMapper.insertarTarea(tarea);
    }

    public List<TareaModel> mostrarTareas() {
        return tareaMapper.verTareas();
    }
}
