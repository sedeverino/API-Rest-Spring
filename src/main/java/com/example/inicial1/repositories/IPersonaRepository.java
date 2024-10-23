package com.example.inicial1.repositories;

import com.example.inicial1.entities.Persona;
import org.springframework.stereotype.Repository;


@Repository
public interface IPersonaRepository extends IBaseRepository<Persona, Long> {
    // Aquí puedes agregar métodos personalizados si es necesario
}