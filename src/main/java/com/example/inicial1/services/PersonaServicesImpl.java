package com.example.inicial1.services;

import com.example.inicial1.entities.Persona;
import com.example.inicial1.repositories.IBaseRepository;
import com.example.inicial1.repositories.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServicesImpl extends BaseServicesImpl<Persona, Long> implements IPersonaServices {
    @Autowired
    private IPersonaRepository personaRepository;

    public PersonaServicesImpl(IBaseRepository<Persona, Long> baseRepository) {
        super(baseRepository);
    }
}
