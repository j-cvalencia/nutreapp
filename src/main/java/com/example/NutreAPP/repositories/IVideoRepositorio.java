package com.example.NutreAPP.repositories;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.NutreAPP.models.Usuario;
import com.example.NutreAPP.models.Video;

@Repository 
public interface IVideoRepositorio extends JpaRepository<Video, UUID>{

    List<Video> findByCategoria(String categoria);

    List<Video> findByTituloIgnoreCase(String titulo);

    Optional<Video> findByDescripcion(String descripcion);

    Optional<Video> findByUrl(String url);

    List<Video> findByTituloAndCategoria(String titulo, String categoria);
}