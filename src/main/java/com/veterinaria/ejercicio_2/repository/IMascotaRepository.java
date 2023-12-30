package com.veterinaria.ejercicio_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.veterinaria.ejercicio_2.model.Mascota;

@Repository
public interface IMascotaRepository extends JpaRepository<Mascota, Long> {
}
