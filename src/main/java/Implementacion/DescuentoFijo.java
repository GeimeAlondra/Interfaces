/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementacion;

import Interfaz.IInterfazDescontable;

/**
 *
 * @author Alondra
 */
public class DescuentoFijo implements IInterfazDescontable<Double>{

    private double cantidadFija;

    public DescuentoFijo(double cantidadFija) {
        this.cantidadFija = cantidadFija;
    }

    @Override
    public Double calcularDescuento(double precio) {
        double precioFinal = precio - cantidadFija;
        return Math.max(precioFinal, 0);
    }
    
}
