package com.proyectott2.spring.apienergia.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectott2.spring.apienergia.model.ProductoModel;
import com.proyectott2.spring.apienergia.model.TipoModel;
import com.proyectott2.spring.apienergia.repository.ProductoRepository;
import com.proyectott2.spring.apienergia.repository.TipoRepository;

@Service
public class ProductoService {
    @Autowired
    ProductoRepository productoRepository;

    @Autowired
    TipoRepository tipoRepository;

    public ArrayList<ProductoModel> getProducto(){
        return (ArrayList<ProductoModel>) productoRepository.findAll();
    }

    public ProductoModel saveProducto(ProductoModel producto){
        if (producto.getTipo() != null && producto.getTipo().getId() > 0) {
            Optional<TipoModel> tipoOpt = tipoRepository.findById(producto.getTipo().getId());
            if (tipoOpt.isPresent()) {
                producto.setTipo(tipoOpt.get());
                return productoRepository.save(producto);
            } else {
                throw new RuntimeException("Tipo no encontrado con ID: " + producto.getTipo().getId());
            }
        }
        throw new RuntimeException("Se requiere un tipo válido para el producto");
    }
}
