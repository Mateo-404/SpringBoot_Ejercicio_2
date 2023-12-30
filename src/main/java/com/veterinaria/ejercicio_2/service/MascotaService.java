package com.veterinaria.ejercicio_2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.veterinaria.ejercicio_2.dto.Duenio_MascotaDTO;
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

    @Override
    public List<Mascota> findPerroCaniche() {
        List<Mascota> busqueda = new ArrayList<>();
        for (Mascota mascota : this.findAllMascotas()) {
            if (mascota.getNombre().equalsIgnoreCase("perro") && mascota.getEspecie().equalsIgnoreCase("caniche")) {
                busqueda.add(mascota);
            }
        }
        return busqueda;
    }


    //4- Lista de DTO
    @Override
    public List<Duenio_MascotaDTO> findDuenioMascota() {
        List<Duenio_MascotaDTO> busqueda = new ArrayList<>();

        for (Mascota mascota : this.findAllMascotas()) {
            if (mascota.getDuenio() != null) {
                //Si encuentra una Mascota con dueño asociado la agrega a la lista de DTO
                busqueda.add(new Duenio_MascotaDTO(mascota.getNombre(), mascota.getEspecie(), mascota.getRaza(), mascota.getDuenio().getNombre(), mascota.getDuenio().getApellido()));
            }
        }
        
        return busqueda;
    }

    
    
}
