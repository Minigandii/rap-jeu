package com.example.rapjeuback.controllers;


import com.example.rapjeuback.models.Rapper;
import com.example.rapjeuback.services.RapperServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RequestMapping("rappers")
@RestController
public class RapperController {
    private final RapperServiceImpl rapperService;

    public RapperController(RapperServiceImpl rapperService) {
        this.rapperService = rapperService;
    }

    @GetMapping("")
    public List<Rapper> listRappers() {
        return rapperService.getAllRappers();
    }

    @GetMapping("/{id}")
    public Optional<Rapper> getRapperById(@PathVariable Long id) {
        return Optional.ofNullable(rapperService.getById(id));
    }

    @DeleteMapping("/{id}")
    public void deleteRapper(@PathVariable Long id) {
        rapperService.delete(id);
    }
    /*
    @PostMapping("")
    public void addRapper(@RequestBody RapperDto rapperDto) {
        rapperService.addRapper(rapperDto);
    }

    @PostMapping("/{id}")
    public void updateRapper(@RequestBody RapperDto rapperDto, @PathVariable Long id) {
        rapperService.updateRapper(rapperDto, id);
    }*/
}