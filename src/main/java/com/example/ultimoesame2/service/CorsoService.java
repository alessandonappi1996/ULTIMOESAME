package com.example.ultimoesame2.service;

import com.example.ultimoesame2.entity.Corso;

import java.util.List;

public interface CorsoService {
    Corso findById(Integer id);

    List<Corso> findAll();

    Corso delete(Integer id);

    Corso save(Corso corso);
}