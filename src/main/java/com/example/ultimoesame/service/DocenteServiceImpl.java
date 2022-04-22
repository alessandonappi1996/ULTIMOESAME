package com.example.ultimoesame.service;


import com.example.ultimoesame.entity.Docente;
import com.example.ultimoesame.repository.DocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocenteServiceImpl implements DocenteService {

    @Autowired
    DocenteRepository docenteRepository;

    @Override
    public Docente findById(Integer id) {
        Docente docente = docenteRepository.findById(id).get();
        return docente;
    }

    @Override
    public List<Docente> findAll() {
        return docenteRepository.findAll();
    }

    @Override
    public Docente delete(Integer id) {
        Docente docente = docenteRepository.findById(id).get();
        docenteRepository.delete(docente);
        return docente;
    }

    @Override
    public Docente save(Docente docente) {
        return docenteRepository.save(docente);
    }


}
