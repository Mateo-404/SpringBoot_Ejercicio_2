package com.veterinaria.ejercicio_2.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Basic
    private String nombre;
    private String especie;
    private String raza;
    private String color;

    @OneToOne
    @JoinColumn(name = "duenio_id", referencedColumnName = "id")
    private Duenio duenio;

    public Mascota() {
    }

    public Mascota(Long id, String nombre, String especie, String raza, String color, Duenio duenio) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
        this.duenio = duenio;
    }

    
    
    
}
