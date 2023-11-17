/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica2_penalozaordonezkelly1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */

public class Principal {
    public static void main(String[] args) {
        List<Producto> listaProductos = crearListaProductos();
        List<Usuario> listaUsuarios = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido a la tienda! Regístrese para comenzar.");

        // Registro de usuarios y selección de productos
        Usuario nuevoUsuario = registrarUsuario(scanner, listaUsuarios);
        seleccionarProductos(scanner, nuevoUsuario, listaProductos);

        // Mostrar información del usuario y su carrito
        System.out.println("\n¡Registro completado!");
        System.out.println("Detalles del usuario: " + nuevoUsuario.toString());
        System.out.println("Productos en el carrito: " + nuevoUsuario.getCarrito().toString());

        // Menú de opciones
        mostrarMenu(scanner, listaUsuarios, listaProductos);
    }

    private static void mostrarMenu(Scanner scanner, List<Usuario> listaUsuarios, List<Producto> listaProductos) {
        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Mostrar carritos existentes y buscar por número");
            System.out.println("2. Crear otro carrito");
            System.out.println("3. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    mostrarCarritos(listaUsuarios);
                    break;
                case 2:
                    Usuario nuevoUsuario = registrarUsuario(scanner, listaUsuarios);
                    seleccionarProductos(scanner, nuevoUsuario, listaProductos);
                    System.out.println("\n¡Registro completado!");
                    System.out.println("Detalles del usuario: " + nuevoUsuario.toString());
                    System.out.println("Productos en el carrito: " + nuevoUsuario.getCarrito().toString());
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }

        // Selección de productos y agregación al carrito
        System.out.println("\nSeleccione los productos por su número para agregarlos a su carrito (separados por comas):");
        String seleccion = scanner.nextLine();
        String[] numerosProductos = seleccion.split(",");

        for (String num : numerosProductos) {
            int index = Integer.parseInt(num.trim());
            if (index > 0 && index <= listaProductos.size()) {
                Producto productoSeleccionado = listaProductos.get(index - 1);
                nuevoUsuario.agregarProductoAlCarrito(productoSeleccionado);
            }
        }

        // Mostrar información del usuario y su carrito
        System.out.println("\n¡Registro completado!");
        System.out.println("Detalles del usuario: " + nuevoUsuario.toString());
        System.out.println("Productos en el carrito: " + nuevoUsuario.getCarrito().toString());
    }

    // Método para crear la lista de productos
    private static List<Producto> crearListaProductos() {
        List<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(new Producto("Relojes inteligentes", 150.00));
        listaProductos.add(new Producto("Mascarillas", 5.50));
        listaProductos.add(new Producto("Auriculares inalámbricos", 80.00));
        listaProductos.add(new Producto("Humidificador", 45.00));
        listaProductos.add(new Producto("Mochilas y bolsos", 30.00));
        listaProductos.add(new Producto("Freidoras de aire", 90.00));
        listaProductos.add(new Producto("Artículos para videojuegos", 20.00));
        listaProductos.add(new Producto("Tablets", 200.00));
        listaProductos.add(new Producto("Joyas", 75.00));
        listaProductos.add(new Producto("Ropa deportiva", 40.00));
        listaProductos.add(new Producto("Botellas de agua", 10.00));
        listaProductos.add(new Producto("Esterillas de yoga", 20.00));
        listaProductos.add(new Producto("Juegos de mesa", 50.00));
        listaProductos.add(new Producto("Aceites esenciales", 15.00));
        listaProductos.add(new Producto("Sillas de escritorio", 200.00));
        listaProductos.add(new Producto("Aspiradoras", 50.00));
        listaProductos.add(new Producto("Té matcha", 10.00));
        listaProductos.add(new Producto("Laptop Dell", 1500.00));
        
        return listaProductos;
    }

    // Método para mostrar la lista de productos
    private static void mostrarProductos(List<Producto> listaProductos) {
    for (int i = 0; i < listaProductos.size(); i++) {
        System.out.println((i + 1) + ". " + listaProductos.get(i).getNombre());
    }
    }
}
