package com.proyectott2.spring.apienergia.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.proyectott2.spring.apienergia.model.TipoModel;
import com.proyectott2.spring.apienergia.service.TipoService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/tipo")
public class TipoController {
    @Autowired
    private TipoService tipoService;

    @GetMapping("/gettipos")
    public ArrayList<TipoModel> getTipo(){
        return this.tipoService.getTipo();
    }

    @PostMapping("/posttipos")
    public TipoModel saveTipo(@RequestBody TipoModel tipo){
        return this.tipoService.saveTipo(tipo);
    }
}
