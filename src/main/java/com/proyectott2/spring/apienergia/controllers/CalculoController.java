package com.proyectott2.spring.apienergia.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.proyectott2.spring.apienergia.model.CalculoModel;
import com.proyectott2.spring.apienergia.service.CalculoService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/calculo")
public class CalculoController {
    @Autowired
    private CalculoService calculoService;

    @GetMapping("/getcalculos")
    public ArrayList<CalculoModel> getCalculo() {
        return this.calculoService.getCalculo();
    }

    @PostMapping("/postcalculos")
    public CalculoModel saveCalculo(@RequestBody CalculoModel calculo){
        return this.calculoService.saveCalculo(calculo);
    }
}
