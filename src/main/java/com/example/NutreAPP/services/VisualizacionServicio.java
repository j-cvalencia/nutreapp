package com.example.NutreAPP.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import com.example.NutreAPP.models.Usuario;
import com.example.NutreAPP.models.Video;
import com.example.NutreAPP.models.Visualizacion;
import com.example.NutreAPP.repositories.IVisualizacionRepositorio;

public class VisualizacionServicio {
    @Autowired
    private IVisualizacionRepositorio repositorio;

    // metodo para guardar
    public Visualizacion guardar(Visualizacion datos) {
        return this.repositorio.save(datos);
    };

    // metodo para buscar por id
    public Visualizacion buscarPorId(UUID id) {
        Optional<Visualizacion> visualizacionBuscado = this.repositorio.findById(id);
        if (!visualizacionBuscado.isPresent()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "id no encontrado");
        } else {
            return visualizacionBuscado.get();
        }
    }

    // metodo para buscar todos
    public List<Visualizacion> buscarTodos() {
        return this.repositorio.findAll();
    }

    // metodo para eliminar
    public boolean eliminar(UUID id) {
        Optional<Visualizacion> visualizacionBuscado = this.repositorio.findById(id);
        if (!visualizacionBuscado.isPresent()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "id no encontrado");
        } else {
            this.repositorio.deleteById(id);
            return true;
        }
    }

    // metodo para buscar por fecha de visualizacion

    // metodo para buscar por visualizaciones sin completar

    // metodo para buscar por visualizaciones completadas
}
