package com.veterinaria.ejercicio_2.service;

import java.util.List;

import com.veterinaria.ejercicio_2.dto.Duenio_MascotaDTO;
import com.veterinaria.ejercicio_2.model.Mascota;

public interface IMascotaService {
    //CRUD
    public void saveMascota(Mascota mascota);

    public List<Mascota> findAllMascotas();
    public Mascota findMascotaById(Long id);

    public Mascota updateMascota(Mascota mascota);

    public void deleteMascota(Long id);

    public List<Mascota> findPerroCaniche();
    // 4- Lista de DTO
    public List<Duenio_MascotaDTO> findDuenioMascota();
}
