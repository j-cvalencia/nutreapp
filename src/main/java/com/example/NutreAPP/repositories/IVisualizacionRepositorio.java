package com.example.NutreAPP.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.NutreAPP.models.Usuario;

@Repository
public interface IVisualizacionRepositorio extends JpaRepository<Usuario, UUID>{

    List<Usuario> findByFechaDeVisualizacion(String fecha);

    Boolean findByVisualizacionesSinCompletar(String visualizaciones);

    Boolean findByVisualizacionesCompletadas(String visualizaciones);
}
