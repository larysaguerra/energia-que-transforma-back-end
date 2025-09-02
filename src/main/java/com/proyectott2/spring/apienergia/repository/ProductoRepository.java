package com.proyectott2.spring.apienergia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyectott2.spring.apienergia.model.ProductoModel;

@Repository
public interface ProductoRepository extends JpaRepository<ProductoModel, Long>{

}
