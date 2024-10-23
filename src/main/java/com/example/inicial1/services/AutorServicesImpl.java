package com.example.inicial1.services;

import com.example.inicial1.entities.Autor;
import com.example.inicial1.repositories.IAutorRepository;
import com.example.inicial1.repositories.IBaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServicesImpl extends BaseServicesImpl<Autor,Long> implements IAutorServices {
    @Autowired
    private IAutorRepository autorRepository;

    public AutorServicesImpl(IBaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }
}
