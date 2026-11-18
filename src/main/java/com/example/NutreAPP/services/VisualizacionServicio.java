package com.example.NutreAPP.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.NutreAPP.models.Usuario;
import com.example.NutreAPP.models.Visualizacion;
import com.example.NutreAPP.repositories.IVisualizacionRepositorio;

public class VisualizacionServicio {
    @Autowired
    private IVisualizacionRepositorio repositorio;

    //metodo para guardar
    public Visualizacion guardar(Visualizacion datos){
        return this.repositorio.save(datos);
    };
    //metodo para buscar por id

    //metodo para buscar todos

    //metodo para modificar

    //metodo para eliminar

    //metodo para buscar por fecha de visualizacion

    //metodo para buscar por visualizaciones sin completar

    //metodo para buscar por visualizaciones completadas
}
