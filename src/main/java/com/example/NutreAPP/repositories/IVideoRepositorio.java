package com.example.NutreAPP.repositories;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.NutreAPP.models.Usuario;

@Repository 
public interface IVideoRepositorio extends JpaRepository<Usuario, UUID>{

    List<Usuario> findByCategoria(String categoria);

    List<Usuario> findByTitulo(String titulo);

    Optional<Usuario> findByDescripcion(String descripcion);

    Optional<Usuario> findByUrl(String url);

    List<Usuario> findByTituloAndCategoria(String titulo, String categoria);

    Boolean existsByCorreo(String correo);
}