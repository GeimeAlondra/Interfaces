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
public class Gato implements IInterfazAnimal<String>{

     @Override
    public String hacerSonido() {
        return "El gato maulla muy suave.";
    }

    @Override
    public String mover() {
        return "El gato salta agilmente.";
    }
    
}
