package com.veterinaria.ejercicio_2.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Duenio_MascotaDTO {
    private String nombre_mascota;
    private String especie;
    private String raza;
    private String nombre_duenio;
    private String apellido_duenio;
    
    public Duenio_MascotaDTO() {
    }

    public Duenio_MascotaDTO(String nombre_mascota, String especie, String raza, String nombre_duenio,
            String apellido_duenio) {
        this.nombre_mascota = nombre_mascota;
        this.especie = especie;
        this.raza = raza;
        this.nombre_duenio = nombre_duenio;
        this.apellido_duenio = apellido_duenio;
    }
    
    
}
