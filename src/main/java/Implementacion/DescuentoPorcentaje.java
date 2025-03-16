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
public class DescuentoPorcentaje implements IInterfazDescontable<Double>{

    private double porcentaje;

    // Constructor para establecer el porcentaje de descuento
    public DescuentoPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public Double calcularDescuento(double precio) {
       return precio - (precio * (porcentaje / 100));
    }

    
}
