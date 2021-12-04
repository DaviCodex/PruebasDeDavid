package com.recuperacion.UniDeportes.Modelo;

import org.springframework.data.annotation.Id;

public class ProductoModelo {
    @Id
    private Long referencia;
    private String categoria;
    private String nombre;
    private String descripcion;
    private Long precio;
    private Boolean disponibilidad;
    private int cantidad;

    
    public Long getReferencia() {
        return referencia;
    }
    public void setReferencia(Long referencia) {
        this.referencia = referencia;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Long getPrecio() {
        return precio;
    }
    public void setPrecio(Long precio) {
        this.precio = precio;
    }
    public Boolean getDisponibilidad() {
        return disponibilidad;
    }
    public void setDisponibilidad(Boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
}
