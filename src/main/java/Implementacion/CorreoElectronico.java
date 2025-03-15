/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementacion;

import Interfaz.IInterfazNotificable;

/**
 *
 * @author Alondra
 */
public class CorreoElectronico implements IInterfazNotificable<String>{

    @Override
    public String enviarNotificacion() {
        return "Recordatorio de reunión mañana.";
    }
    
}
