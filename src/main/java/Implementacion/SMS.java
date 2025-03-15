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
public class SMS implements IInterfazNotificable<String>{

    @Override
    public String enviarNotificacion() {
        return "Su pedido ha sido enviado.";
    }
    
}
