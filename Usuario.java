/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica2_penalozaordonezkelly1;

/**
 *
 * @author user
 */
public class Usuario {
    private int id;
    private String nombre;
    private String correoElectronico;
    private Carrito carrito;

    public Usuario(int id, String nombre, String correoElectronico) {
        this.id = id;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.carrito = new Carrito("Carrito de " + nombre);
    }

    // Getters y setters para los atributos

    public void agregarProductoAlCarrito(Producto producto) {
        carrito.agregarProducto(producto);
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", correoElectronico=" + correoElectronico + ", carrito=" + carrito + '}';
    }
}