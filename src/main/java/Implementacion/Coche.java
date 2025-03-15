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
public class Coche implements IInterfazVehiculo<String>{

    @Override
    public String arrancar() {
        return "El coche está arrancando.";
    }

    @Override
    public String detener() {
        return "El coche se ha detenido.";
    }
    
}
