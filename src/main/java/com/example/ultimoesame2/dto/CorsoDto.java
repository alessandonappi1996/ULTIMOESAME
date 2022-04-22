package com.example.ultimoesame2.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CorsoDto {
    private String nome;
    private int durata;
    private LocalDate data_inizio;
}
