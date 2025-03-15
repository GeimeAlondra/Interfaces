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
public class Animal implements IInterfazAlimentacion<String>{

    @Override
    public String comer() {
        return "El animal está comiendo directamente del suelo.";
    }
    
}
