package com.example.ExamenFinalJuanMatute.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "cliente")
public class Cliente {

    @Id
    private String id;
    private int dni;

    private Long nProyecto;
    private  String nombre;
    private String apellido;
    private int telefono;

    private List<String> producto;
    private List<String> factura;

    public Cliente() {
    }

    public Cliente(String id, int dni, Long nProyecto, String nombre, String apellido, int telefono, List<String> producto, List<String> factura) {
        this.id = id;
        this.dni = dni;
        this.nProyecto = nProyecto;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.producto = producto;
        this.factura = factura;
    }

    public List<String> getProducto() {
        return producto;
    }

    public void setProducto(List<String> producto) {
        this.producto = producto;
    }

    public Long getnProyecto() {
        return nProyecto;
    }

    public void setnProyecto(Long nProyecto) {
        this.nProyecto = nProyecto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public List<String> getFactura() {
        return factura;
    }

    public void setFactura(List<String> factura) {
        this.factura = factura;
    }
}
