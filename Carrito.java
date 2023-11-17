/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica2_penalozaordonezkelly1;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Carrito {
    private String nombre;
    private List<Producto> productos;

    public Carrito(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }
    
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void vaciarCarrito() {
        productos.clear();
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Carrito{" + "nombre=" + nombre + ", cantidadProductos=" + productos.size() + '}';
    }
}