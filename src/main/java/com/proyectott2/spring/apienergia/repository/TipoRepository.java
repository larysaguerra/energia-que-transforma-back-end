package com.proyectott2.spring.apienergia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyectott2.spring.apienergia.model.TipoModel;

@Repository
public interface TipoRepository extends JpaRepository<TipoModel, Long> {
    boolean existsById(Long id);
}
