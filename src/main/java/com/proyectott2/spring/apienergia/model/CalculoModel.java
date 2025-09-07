package com.proyectott2.spring.apienergia.model;

import java.sql.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "calculos")
public class CalculoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long Id;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private UserModel usuario;

    @OneToOne
    @JoinColumn(name = "tipo_id", nullable = false)
    private TipoModel tipo;

    @ManyToOne
    @JoinColumn(name = "producto_id", nullable = false)
    private ProductoModel producto;

    @Column(nullable = false)
    private float costoInstalacion;

    @Column(nullable = false)
    private float ahorroAnualEstimado;

    @Column(nullable = false)
    private float periodoRetornoInversion;

    @Column(nullable = false)
    private float reduccionCo2Anual;

    @Column(nullable = false)
    private float beneficionTributarios;

    @Column(nullable = false)
    private float incentivosGubernamentales;

    @Column(nullable = false)
    private float tamanhoSistemaRequerido;

    @Column(nullable = false)
    private float produccionEnergiaEstimada;

    @Column(nullable = false)
    @CreationTimestamp
    private Date fechaCalculo;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public UserModel getUsuario() {
        return usuario;
    }

    public void setUsuario(UserModel usuario) {
        this.usuario = usuario;
    }

    public TipoModel getTipo() {
        return tipo;
    }

    public void setTipo(TipoModel tipo) {
        this.tipo = tipo;
    }

    public ProductoModel getProducto() {
        return producto;
    }

    public void setProducto(ProductoModel producto) {
        this.producto = producto;
    }

    public float getCostoInstalacion() {
        return costoInstalacion;
    }

    public void setCostoInstalacion(float costoInstalacion) {
        this.costoInstalacion = costoInstalacion;
    }

    public float getAhorroAnualEstimado() {
        return ahorroAnualEstimado;
    }

    public void setAhorroAnualEstimado(float ahorroAnualEstimado) {
        this.ahorroAnualEstimado = ahorroAnualEstimado;
    }

    public float getPeriodoRetornoInversion() {
        return periodoRetornoInversion;
    }

    public void setPeriodoRetornoInversion(float periodoRetornoInversion) {
        this.periodoRetornoInversion = periodoRetornoInversion;
    }

    public float getReduccionCo2Anual() {
        return reduccionCo2Anual;
    }

    public void setReduccionCo2Anual(float reduccionCo2Anual) {
        this.reduccionCo2Anual = reduccionCo2Anual;
    }

    public float getBeneficionTributarios() {
        return beneficionTributarios;
    }

    public void setBeneficionTributarios(float beneficionTributarios) {
        this.beneficionTributarios = beneficionTributarios;
    }

    public float getIncentivosGubernamentales() {
        return incentivosGubernamentales;
    }

    public void setIncentivosGubernamentales(float incentivosGubernamentales) {
        this.incentivosGubernamentales = incentivosGubernamentales;
    }

    public float getTamanhoSistemaRequerido() {
        return tamanhoSistemaRequerido;
    }

    public void setTamanhoSistemaRequerido(float tamanhoSistemaRequerido) {
        this.tamanhoSistemaRequerido = tamanhoSistemaRequerido;
    }

    public float getProduccionEnergiaEstimada() {
        return produccionEnergiaEstimada;
    }

    public void setProduccionEnergiaEstimada(float produccionEnergiaEstimada) {
        this.produccionEnergiaEstimada = produccionEnergiaEstimada;
    }

    public Date getFechaCalculo() {
        return fechaCalculo;
    }

    public void setFechaCalculo(Date fechaCalculo) {
        this.fechaCalculo = fechaCalculo;
    }
}
