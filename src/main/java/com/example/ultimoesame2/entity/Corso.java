package com.example.ultimoesame2.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "TAB_CORSO")
public class Corso {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String nome;

    @Column(name = "data_inizio")
    private LocalDate data_inizio;

    @Column(name = "durata")
    private int durata;
}
