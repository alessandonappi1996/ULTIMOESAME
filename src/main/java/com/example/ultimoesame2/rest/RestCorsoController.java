package com.example.ultimoesame2.rest;

import com.example.ultimoesame2.converter.CorsoMapper;
import com.example.ultimoesame2.dto.CorsoDto;
import com.example.ultimoesame2.entity.Corso;
import com.example.ultimoesame2.service.CorsoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/corso")
public class RestCorsoController {

    @Autowired
    CorsoService corsoService;

    @GetMapping(value = "/ricerca/id/{id}")
    public CorsoDto getById(@PathVariable("id") Integer id) {
        Corso corso = corsoService.findById(id);
        CorsoMapper map = new CorsoMapper();
        return map.toDto(corso);
    }

    @GetMapping(value = "/lista")
    public List<Corso> getAll() {
        return corsoService.findAll();
    }

    @PostMapping(value = "/newCorso")
    public void newCorso(@RequestBody Corso corso) {
        corsoService.save(corso);
    }

    @DeleteMapping(value = "/deleteCorso/{id}")
    public void deleteCorsoPerId(@PathVariable("id") Integer id) {
        corsoService.delete(id);
    }

}
