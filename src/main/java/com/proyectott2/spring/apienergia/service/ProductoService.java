package com.proyectott2.spring.apienergia.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectott2.spring.apienergia.model.ProductoModel;
import com.proyectott2.spring.apienergia.repository.ProductoRepository;

@Service
public class ProductoService {
    @Autowired
    ProductoRepository productoRepository;

    public ArrayList<ProductoModel> getProducto(){
        return (ArrayList<ProductoModel>) productoRepository.findAll();
    }

    public ProductoModel saveProducto(ProductoModel producto){
        return productoRepository.save(producto);
    }
}
