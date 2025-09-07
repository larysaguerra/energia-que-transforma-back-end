package com.proyectott2.spring.apienergia.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectott2.spring.apienergia.model.CalculoModel;
import com.proyectott2.spring.apienergia.repository.CalculoRepository;

@Service
public class CalculoService {
    @Autowired
    CalculoRepository calculoRepository;

    public ArrayList<CalculoModel> getCalculo() {
        return (ArrayList<CalculoModel>) calculoRepository.findAll();
    }

    public CalculoModel saveCalculo (CalculoModel calculo) {
        return calculoRepository.save(calculo);
    }
}
