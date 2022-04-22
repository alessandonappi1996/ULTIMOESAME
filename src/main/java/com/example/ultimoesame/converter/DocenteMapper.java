package com.example.ultimoesame.converter;

import com.example.ultimoesame.dto.DocenteDto;
import com.example.ultimoesame.entity.Docente;
import org.modelmapper.ModelMapper;

public class DocenteMapper {
    public DocenteDto toDto(Docente docente) {
        ModelMapper modelDocente = new ModelMapper();
        DocenteDto docenteDto = modelDocente.map(docente, DocenteDto.class);
        return docenteDto;
    }
}
