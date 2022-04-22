package com.example.ultimoesame.rest;


import com.example.ultimoesame.converter.DocenteMapper;
import com.example.ultimoesame.dto.DocenteDto;
import com.example.ultimoesame.entity.Docente;
import com.example.ultimoesame.service.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/docente")
public class RestDocenteController {

    @Autowired
    DocenteService docenteService;

    @GetMapping(value = "/{id}")
    public DocenteDto getById(@PathVariable("id") Integer id) {
        Docente docente = docenteService.findById(id);
        DocenteMapper docenteMapper = new DocenteMapper();
        return docenteMapper.toDto(docente);
    }

    @GetMapping(value = "/lista")
    public List<Docente> getAll() {
        return docenteService.findAll();
    }

    @PostMapping(value = "/newDocente")
    public void newDocente(@RequestBody Docente docente) {
        docenteService.save(docente);
    }

    @DeleteMapping(value = "/deleteDocente/{id}")
    public void deleteDocentePerId(@PathVariable("id") Integer id) {
        docenteService.delete(id);
    }

}

