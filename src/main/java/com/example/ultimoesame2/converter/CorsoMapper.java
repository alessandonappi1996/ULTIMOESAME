package com.example.ultimoesame2.converter;

import com.example.ultimoesame2.dto.CorsoDto;
import com.example.ultimoesame2.entity.Corso;

import java.util.ArrayList;
import java.util.List;

public class CorsoMapper {
    public CorsoDto toDto(Corso corso) {
        CorsoDto dto = new CorsoDto();

        dto.setNome(corso.getNome());
        dto.setData_inizio(corso.getData_inizio());
        dto.setDurata(corso.getDurata());
        return dto;
    }

    public List<CorsoDto> listToDto(List<Corso> lista) {

        List<CorsoDto> listaDto = new ArrayList<>();

        for (int i = 0; i < lista.size(); i++) {
            listaDto.add(toDto(lista.get(i)));
        }

        return listaDto;
    }
}