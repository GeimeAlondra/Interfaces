/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementacion;

import Interfaz.IInterfazComparableObjeto;

/**
 *
 * @author Alondra
 */
public class Producto implements IInterfazComparableObjeto<String>{
    
    private final double precio;
    private final String nombre;

    public Producto(double precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }
    
    @Override
    public String comparar(Producto o) {
       if (this.precio > o.precio) {
            return this.nombre + " tiene un precio mayor a " + o.nombre;
        } else if (this.precio < o.precio) {
            return o.nombre + " tiene un precio mayor a " + this.nombre;
        } else {
            return "Ambos productos tienen el mismo precio.";
        }
    }
    
    @Override
    public String toString() {
        return "Producto: " + nombre + ", Precio: " + precio;
    }
    
}
