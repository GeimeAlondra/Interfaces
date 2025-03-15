/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementacion;

import Interfaz.IInterfazAlimentacion;

/**
 *
 * @author Alondra
 */
public class Persona implements IInterfazAlimentacion<String>{

    @Override
    public String comer() {
        return "La persona está comiendo con cubiertos.";
    }
    
}
