package com.example.NutreAPP.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import com.example.NutreAPP.models.Usuario;
import com.example.NutreAPP.models.Video;
import com.example.NutreAPP.repositories.IVideoRepositorio;

public class VideoServicio {
    @Autowired
    private IVideoRepositorio repositorio;

    // metodo para guardar
    public Video guardar(Video datos) {
        return this.repositorio.save(datos);
    };

    // metodo para buscar por id
    public Video buscarPorId(UUID id) {
        Optional<Video> videoBuscado = this.repositorio.findById(id);
        if (!videoBuscado.isPresent()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "id no encontrado");
        } else {
            return videoBuscado.get();
        }
    }

    // metodo para buscar todos
    public List<Video> buscarTodos() {
        return this.repositorio.findAll();
    }

    // metodo para modificar
    public Video modificar(UUID id, Video datos) {
        Optional<Video> videoBuscado = this.repositorio.findById(id);
        if (!videoBuscado.isPresent()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "id no encontrado");
        } else {
            // 1. Precargar la info que existe actualmente en la bd
            Video videoEncontrado = videoBuscado.get();

            // 2. Estapacio para modificar solo las propiedades permitidas
            videoEncontrado.setTitulo(datos.getTitulo());
            videoEncontrado.setDescripcion(datos.getDescripcion());

            // 3. Espacio para volver a guardar el usuario que se acaba de modificar
            return this.repositorio.save(videoEncontrado);
        }
    }

    // metodo para eliminar
    public boolean eliminar(UUID id) {
        Optional<Video> videoBuscado = this.repositorio.findById(id);
        if (!videoBuscado.isPresent()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "id no encontrado");
        } else {
            this.repositorio.deleteById(id);
            return true;
        }
    }

    // metodo para buscar por categoria

    // metodo para buscar por titulo

    // metodo para buscar por descripcion

    // Metodo para buscar por URL

    // Metodo para buscar por titulo y categoria
}
