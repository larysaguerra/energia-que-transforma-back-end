package com.proyectott2.spring.apienergia.model;

import java.sql.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long Id;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false, length = 100)
    private String apellido;

    @Column(unique = true, length = 100, nullable = false)
    private String email;

    @Column(nullable = false, length = 50)
    private String password;

    @Column(nullable = false, length = 100)
    private String ciudad;

    @Column(nullable = false, length = 100)
    private String departamento;

    @Column(nullable = false, length = 100)
    private String pais;

    @Column(nullable = false, length = 20)
    private String codigoPostal;

    @Column(nullable = false, length = 100)
    private String tipoEdificacion;

    @Column(nullable = false)
    private float consumoMensualKwh;

    @Column(nullable = false)
    private float costoPorKwh;

    @Column(nullable = false, length = 100)
    private String fuenteEnergiaActual;

    @Column(nullable = false)
    @CreationTimestamp
    private Date fechaCreacion;

    @Column(nullable = false)
    @UpdateTimestamp
    private Date fechaActualizacion;

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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getTipoEdificacion() {
        return tipoEdificacion;
    }

    public void setTipoEdificacion(String tipoEdificacion) {
        this.tipoEdificacion = tipoEdificacion;
    }

    public float getConsumoMensualKwh() {
        return consumoMensualKwh;
    }

    public void setConsumoMensualKwh(float consumoMensualKwh) {
        this.consumoMensualKwh = consumoMensualKwh;
    }

    public float getCostoPorKwh() {
        return costoPorKwh;
    }

    public void setCostoPorKwh(float costoPorKwh) {
        this.costoPorKwh = costoPorKwh;
    }

    public String getFuenteEnergiaActual() {
        return fuenteEnergiaActual;
    }

    public void setFuenteEnergiaActual(String fuenteEnergiaActual) {
        this.fuenteEnergiaActual = fuenteEnergiaActual;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }
}
