/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfaces;

import Interfaz.IInterfazAnimal;
import Implementacion.Gato;
import Implementacion.Perro;
import Interfaz.IInterfazVehiculo;
import Implementacion.Coche;
import Implementacion.Bicicleta;

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
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Comportamiento del perro:");
        System.out.println(perro.hacerSonido());
        System.out.println(perro.mover());       
        //Gato
        System.out.println("\nComportamiento del gato:");
        System.out.println(gato.hacerSonido());
        System.out.println(gato.mover());
        
        // Vehiculo
        IInterfazVehiculo<String> coche = new Coche();
        IInterfazVehiculo<String> bicicleta = new Bicicleta();
        // Coche
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Movimiento del coche:");
        System.out.println(coche.arrancar());
        System.out.println(coche.detener()); 
        // Bicicleta
        System.out.println("\nMovimiento de la bicicleta:");
        System.out.println(bicicleta.arrancar());
        System.out.println(bicicleta.detener()); 
    }
}
