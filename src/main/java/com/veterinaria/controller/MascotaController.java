package com.veterinaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.veterinaria.ejercicio_2.dto.Duenio_MascotaDTO;
import com.veterinaria.ejercicio_2.model.Mascota;
import com.veterinaria.ejercicio_2.service.IMascotaService;

@RestController
public class MascotaController{

    @Autowired
    private IMascotaService service;


    //1- CRUD
    @PostMapping("/crear-mascota")
    public void saveMascota(@RequestBody Mascota mascota) {
        service.saveMascota(mascota);
    }

    @GetMapping("/listar-mascotas")
    public List<Mascota> findAllMascotas() {
        return (List<Mascota>) service.findAllMascotas();
    }
    
    @GetMapping("/ver-mascota/{id}")
    public Mascota findMascotaById(@RequestParam Long id) {
        return (Mascota) service.findMascotaById(id);
    }
    @PutMapping("/actualizar-mascota")
    public Mascota updateMascota(@RequestBody Mascota mascota) {
        return (Mascota) service.updateMascota(mascota);
    }
    
    
    @DeleteMapping("/eliminar-mascota/{id}")
    public void deleteMascota(@RequestParam Long id) {
        service.deleteMascota(id);
    }
    
    //3- Lista con especie "perro" y raza "caniche"
    @GetMapping("/listar-perro-caniche")
    public List<Mascota> findPerroCaniche() {
        return service.findPerroCaniche();
    }

    //4- Lista de DTO
    @GetMapping("/listar-duenio-mascota")
    public List<Duenio_MascotaDTO> findDuenioMascota() {
        return service.findDuenioMascota();
    }
}
