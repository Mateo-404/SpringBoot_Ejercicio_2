package com.veterinaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.veterinaria.ejercicio_2.model.Duenio;
import com.veterinaria.ejercicio_2.service.IDuenioService;

@RestController
public class DuenioController{
    @Autowired
    private IDuenioService service;

    //2- CRUD
    @PostMapping("/crear-duenio")
    public void saveDuenio(@RequestBody Duenio duenio) {
        service.saveDuenio(duenio);
    }
    
    @GetMapping("/listar-duenios")
    public List<Duenio> findAllDuenios() {
        return (List<Duenio>) service.findAllDuenios();
    }
    
    @GetMapping("/buscar-duenio/{id}")
    public Duenio findDuenioById(@PathVariable Long id) {
        return (Duenio) service.findDuenioById(id);
    }
    
    @PutMapping("/actualizar-duenio")
    public Duenio updateDuenio(@RequestBody Duenio duenio) {
        return (Duenio) service.updateDuenio(duenio);
    }
    
    @DeleteMapping("/eliminar-duenio/{id}")
    public void deleteDuenio(@PathVariable Long id) {
        service.deleteDuenio(id);
    }
    
    
}
