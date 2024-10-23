package com.example.inicial1.services;

import com.example.inicial1.entities.Base;

import java.io.Serializable;
import java.util.List;

public interface IBaseServices<E extends Base, ID extends Serializable> {

    List<E> findAll() throws Exception;
    E findByID(ID id) throws Exception;
    E save(E entity) throws Exception;
    E update(ID id, E entity) throws Exception;

}
