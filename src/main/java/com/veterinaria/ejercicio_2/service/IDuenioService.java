package com.veterinaria.ejercicio_2.service;

import java.util.List;

import com.veterinaria.ejercicio_2.model.Duenio;

public interface IDuenioService {
    //CRUD
    public void saveDuenio(Duenio duenio);

    public List<Duenio> findAllDuenios();

    public Duenio findDuenioById(Long id);

    public Duenio updateDuenio(Duenio duenio);

    public void deleteDuenio(Long id);
}
