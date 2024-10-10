package com.example.pruebajava.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class TareaModel {
    private int id;
    private String nombre;
    private String descripcion;
    private LocalDate fechaInicio;

    public TareaModel() {
    }

    public TareaModel(int id, String nombre, String descripcion, LocalDate fechaInicio) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
    }
}