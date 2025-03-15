/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementacion;

import Interfaz.IInterfazPago;

/**
 *
 * @author Alondra
 */
public class PagoConTarjeta implements IInterfazPago<String>{

    @Override
    public String procesarPago(double cantidad) {
        return "Pago de $" + cantidad + " procesado con tarjeta.";
    }
    
}
