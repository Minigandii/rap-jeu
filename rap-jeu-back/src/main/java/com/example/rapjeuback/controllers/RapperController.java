package com.example.rapjeuback.controllers;


import com.example.rapjeuback.models.Rapper;
import com.example.rapjeuback.services.RapperService;
import com.example.rapjeuback.services.RapperServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RequestMapping("rappers")
@RestController
public class RapperController {
    private final RapperService rapperService;

    public RapperController(RapperService rapperService) {
        this.rapperService = rapperService;
    }

    @GetMapping("")
    public List<Rapper> listRappers() {
        return rapperService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Rapper> getRapperById(@PathVariable Long id) {
        return rapperService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteRapper(@PathVariable Long id) {
        rapperService.delete(id);
    }
}