package com.example.ultimoesame2.service;

import com.example.ultimoesame2.entity.Corso;
import com.example.ultimoesame2.repository.CorsoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class CorsoServiceImpl implements CorsoService {

    @Autowired
    CorsoRepository corsoRepository;

    @Override
    public Corso findById(Integer id) {
        Corso corso = corsoRepository.findById(id).get();
        return corso;
    }

    @Override
    public List<Corso> findAll() {
        return corsoRepository.findAll();
    }

    @Override
    public Corso delete(Integer id) {
        Corso corso = corsoRepository.findById(id).get();
        corsoRepository.delete(corso);
        return corso;
    }

    @Override
    public Corso save(Corso corso) {
        return corsoRepository.save(corso);
    }



    @Override
    public Corso findByNome(String nome_corso) {
        Corso corso = corsoRepository.findByNome(nome_corso);
        return corso;
    }
}
