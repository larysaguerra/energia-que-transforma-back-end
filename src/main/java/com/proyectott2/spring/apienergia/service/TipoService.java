package com.proyectott2.spring.apienergia.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectott2.spring.apienergia.model.TipoModel;
import com.proyectott2.spring.apienergia.repository.TipoRepository;

@Service
public class TipoService {
    @Autowired
    TipoRepository tipoRepository;

    public ArrayList<TipoModel> getTipo(){
        return (ArrayList<TipoModel>) tipoRepository.findAll();
    }

    public TipoModel saveTipo(TipoModel tipo){
        return tipoRepository.save(tipo);
    }

}
