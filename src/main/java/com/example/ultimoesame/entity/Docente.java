package com.example.ultimoesame.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "TAB_DOCENTE")

public class Docente {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "cognome")
    private String cognome;

    @Column(name = "nome")
    private String nome;

}
