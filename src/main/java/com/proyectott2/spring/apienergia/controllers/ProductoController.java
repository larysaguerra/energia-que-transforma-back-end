package com.proyectott2.spring.apienergia.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.proyectott2.spring.apienergia.model.ProductoModel;

import com.proyectott2.spring.apienergia.service.ProductoService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @GetMapping("/getproductos")
    public ArrayList<ProductoModel> getProducto(){
        return this.productoService.getProducto();
    }

    @PostMapping(value = "/postproducto", consumes = "application/json", produces = "application/json")
    public ProductoModel saveProducto(@RequestBody ProductoModel producto){
        return this.productoService.saveProducto(producto);
    }
}
