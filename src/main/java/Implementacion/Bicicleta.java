/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementacion;

import Interfaz.IInterfazVehiculo;

/**
 *
 * @author Alondra
 */
public class Bicicleta implements IInterfazVehiculo<String>{

    @Override
    public String arrancar() {
        return "La bicicleta comienza a moverse.";
    }

    @Override
    public String detener() {
        return "La bicicleta se ha detenido.";
    }
    
}
