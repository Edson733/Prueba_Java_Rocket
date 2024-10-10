package com.example.pruebajava.mapper;

import com.example.pruebajava.model.TareaModel;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TareaMapper {
    @Insert("INSERT INTO tareas(nombre, descripcion, fecha_inicio) VALUES(#{nombre}, #{descripcion}, #{fechaInicio})")
    void insertarTarea(TareaModel tarea);

    @Select("SELECT * FROM tareas")
    List<TareaModel> verTareas();
}