/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementacion;

import Interfaz.IInterfazAnimal;

/**
 *
 * @author Alondra
 */
public class Perro implements IInterfazAnimal<String>{

    @Override
    public String hacerSonido() {
        return "El perro ladra fuerte.";
    }

    @Override
    public String mover() {
        return "El perro corre una larga distancia.";
    }
    
}
