package com.proyectott2.spring.apienergia.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Productos")
public class ProductoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long Id;

    @ManyToOne
    @JoinColumn(name = "tipoEnergiaId", nullable = false)
    private TipoModel tipoModel;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String fabricante;

    @Column(nullable = false)
    private float capacidadKw;

    @Column(nullable = false)
    private float costoUnitario;

    @Column(nullable = false)
    private float eficiencia;

    @Column(nullable = false)
    private float reduccionCo2PorKwh;

    @Column(nullable = false)
    private int vidaUtilAnhos;

    @Column(nullable = false)
    private String complejidadInstalacion;

    @Column(nullable = false)
    private String nivelMantenimiento;

    @Column(nullable = false)
    private float costoMantenimientoAnual;

    @Column(nullable = false)
    private String especificaciones;

    @Column(nullable = false)
    private String tiposEdificacionRecomendados;

    @Column(nullable = false)
    private String viabilidadRegional;

    @Column(nullable = false)
    private boolean incentivosDisponibles;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public float getCapacidadKw() {
        return capacidadKw;
    }

    public void setCapacidadKw(float capacidadKw) {
        this.capacidadKw = capacidadKw;
    }

    public float getCostoUnitario() {
        return costoUnitario;
    }

    public void setCostoUnitario(float costoUnitario) {
        this.costoUnitario = costoUnitario;
    }

    public float getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(float eficiencia) {
        this.eficiencia = eficiencia;
    }

    public float getReduccionCo2PorKwh() {
        return reduccionCo2PorKwh;
    }

    public void setReduccionCo2PorKwh(float reduccionCo2PorKwh) {
        this.reduccionCo2PorKwh = reduccionCo2PorKwh;
    }

    public int getVidaUtilAnhos() {
        return vidaUtilAnhos;
    }

    public void setVidaUtilAnhos(int vidaUtilAnhos) {
        this.vidaUtilAnhos = vidaUtilAnhos;
    }

    public String getComplejidadInstalacion() {
        return complejidadInstalacion;
    }

    public void setComplejidadInstalacion(String complejidadInstalacion) {
        this.complejidadInstalacion = complejidadInstalacion;
    }

    public String getNivelMantenimiento() {
        return nivelMantenimiento;
    }

    public void setNivelMantenimiento(String nivelMantenimiento) {
        this.nivelMantenimiento = nivelMantenimiento;
    }

    public float getCostoMantenimientoAnual() {
        return costoMantenimientoAnual;
    }

    public void setCostoMantenimientoAnual(float costoMantenimientoAnual) {
        this.costoMantenimientoAnual = costoMantenimientoAnual;
    }

    public String getEspecificaciones() {
        return especificaciones;
    }

    public void setEspecificaciones(String especificaciones) {
        this.especificaciones = especificaciones;
    }

    public String getTiposEdificacionRecomendados() {
        return tiposEdificacionRecomendados;
    }

    public void setTiposEdificacionRecomendados(String tiposEdificacionRecomendados) {
        this.tiposEdificacionRecomendados = tiposEdificacionRecomendados;
    }

    public String getViabilidadRegional() {
        return viabilidadRegional;
    }

    public void setViabilidadRegional(String viabilidadRegional) {
        this.viabilidadRegional = viabilidadRegional;
    }

    public boolean isIncentivosDisponibles() {
        return incentivosDisponibles;
    }

    public void setIncentivosDisponibles(boolean incentivosDisponibles) {
        this.incentivosDisponibles = incentivosDisponibles;
    }

    
}
