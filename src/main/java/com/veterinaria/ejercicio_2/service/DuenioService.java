package com.veterinaria.ejercicio_2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veterinaria.ejercicio_2.model.Duenio;
import com.veterinaria.repository.IDuenioRepository;

@Service
public class DuenioService implements IDuenioService {
    @Autowired
    private IDuenioRepository repository;

    @Override
    public void deleteDuenio(Long id) {
        repository.deleteById(id);
        
    }

    @Override
    public List<Duenio> findAllDuenios() {
        return (List<Duenio>) repository.findAll();
    }

    @Override
    public Duenio findDuenioById(Long id) {
        return (Duenio) repository.findById(id).orElse(null);
    }

    @Override
    public void saveDuenio(Duenio duenio) {
        repository.save(duenio);
    }

    @Override
    public Duenio updateDuenio(Duenio duenio) {
        repository.save(duenio);
        return (Duenio) repository.findById(duenio.getId()).orElse(null);
    }

    
}
