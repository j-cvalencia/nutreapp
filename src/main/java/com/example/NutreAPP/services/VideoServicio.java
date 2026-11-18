package com.example.NutreAPP.services;

import org.springframework.beans.factory.annotation.Autowired;

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

    // metodo para buscar todos

    // metodo para modificar

    // metodo para eliminar

    // metodo para buscar por categoria

    // metodo para buscar por titulo

    // metodo para buscar por descripcion

    // Metodo para buscar por URL

    // Metodo para buscar por titulo y categoria
}
