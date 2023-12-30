# Ejercicio N° 2 — Clínica Veterinaria

Este proyecto consiste en un sistema para una clínica veterinaria que maneja dos clases principales: Mascota y Dueño. Cada mascota puede tener asociado un solo dueño como responsable.

## Estructura de las Clases

### Mascota
La clase Mascota tiene los siguientes atributos:
- id
- nombre
- especie
- raza
- color

### Dueño
La clase Dueño tiene los siguientes atributos:
- id
- dni
- nombre
- apellido
- celular

## API
Se ha desarrollado una API para permitir la interacción con el sistema a través de aplicaciones web y móviles. La API tiene las siguientes capacidades:

1. Realizar operaciones CRUD/ABML de mascotas.
2. Realizar operaciones CRUD/ABML de dueños.
3. Obtener el listado de todas las mascotas de especie "perro" y raza "caniche".
4. Obtener un listado de los siguientes datos combinados de una mascota y su dueño:
   - nombre_mascota
   - especie
   - raza
   - nombre_duenio
   - apellido_duenio

Para el último requerimiento, se ha utilizado el patrón DTO para armar la correspondiente respuesta.
