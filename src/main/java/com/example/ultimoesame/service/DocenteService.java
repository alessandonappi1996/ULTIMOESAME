package com.example.ultimoesame.service;

import com.example.ultimoesame.entity.Docente;

import java.util.List;

public interface DocenteService {
    Docente findById(Integer id);

    List<Docente> findAll();

    Docente delete(Integer id);

    Docente save(Docente docente);
}
