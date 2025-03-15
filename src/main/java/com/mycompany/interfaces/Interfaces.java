/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfaces;

import Interfaz.IInterfazAnimal;
import Implementacion.Gato;
import Implementacion.Perro;

/**
 *
 * @author Alondra
 */
public class Interfaces {

    public static void main(String[] args) {
        
        //Animal
        IInterfazAnimal<String> perro = new Perro();
        IInterfazAnimal<String> gato = new Gato();
        //Perro
        System.out.println("------------------------------------------------------------");
        System.out.println("Comportamiento del perro:");
        System.out.println(perro.hacerSonido());
        System.out.println(perro.mover());       
        //Gato
        System.out.println("\nComportamiento del gato:");
        System.out.println(gato.hacerSonido());
        System.out.println(gato.mover());
        
    }
}
