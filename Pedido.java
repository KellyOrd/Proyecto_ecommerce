/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica2_penalozaordonezkelly1;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Pedido {
    private List<Producto> productos;
    private Usuario usuario;

    public Pedido(Usuario usuario) {
        this.usuario = usuario;
        this.productos = new ArrayList<>();
    }

    public void addProducto(Producto producto) {
        productos.add(producto);
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Pedido{" + "productos=" + productos + ", usuario=" + usuario + '}';
    }
}