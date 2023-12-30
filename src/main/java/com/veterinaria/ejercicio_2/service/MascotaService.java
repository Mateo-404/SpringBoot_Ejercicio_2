package com.veterinaria.ejercicio_2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.veterinaria.ejercicio_2.model.Mascota;
import com.veterinaria.ejercicio_2.repository.IMascotaRepository;

public class MascotaService implements IMascotaService{
    @Autowired
    private IMascotaRepository repository;

    @Override
    public void deleteMascota(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Mascota> findAllMascotas() {
        return (List<Mascota>) repository.findAll();
    }

    @Override
    public Mascota findMascotaById(Long id) {        
        return (Mascota) repository.findById(id).orElse(null);
    }

    @Override
    public void saveMascota(Mascota mascota) {
        repository.save(mascota);
    }

    @Override
    public Mascota updateMascota(Mascota mascota) {
        repository.save(mascota);
        return (Mascota) repository.findById(mascota.getId()).orElse(null);
    }

    
}
