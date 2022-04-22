package com.example.ultimoesame2.repository;

import com.example.ultimoesame2.entity.Corso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CorsoRepository extends JpaRepository<Corso, Integer> {
    Corso findByNome(String nome_corso);
}
