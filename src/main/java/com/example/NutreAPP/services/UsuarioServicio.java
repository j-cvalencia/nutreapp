package com.example.NutreAPP.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.NutreAPP.models.Usuario;
import com.example.NutreAPP.repositories.IUsuarioRepositorio;

@Service
public class UsuarioServicio {
    //Para concinar necesito las recetas
    //Para programar los servicios necesito los repositorios

    //INYECCION DE DEPENDENCIAS
    @Autowired
    private IUsuarioRepositorio repositorio;

    //metodo para guardar un usuario
    public Usuario guardar(Usuario datos){
        return this.repositorio.save(datos);
    };

    //metodo para buscar por id

    //metodo para buscar todos

    //metodo para modificar

    //metodo para eliminar

    //Metodo para buscar por departamento y rol

    //Metodo para buscar por correo

    //Metodo para buscar por rol

    //Metodo para verificar correo
}
