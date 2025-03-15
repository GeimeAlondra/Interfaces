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

import Interfaz.IInterfazPago;
import Implementacion.PagoConEfectivo;
import Implementacion.PagoConTarjeta;

import Interfaz.IInterfazFiguraGeometrica;
import Implementacion.Rectangulo;
import Implementacion.Circulo;

import Interfaz.IInterfazTrabajador;
import Implementacion.Desarrollador;
import Implementacion.Diseñador;

import Interfaz.IInterfazOrdenable;
import Implementacion.ListaNumeros;

import Interfaz.IInterfazAlimentacion;
import Implementacion.Animal;
import Implementacion.Persona;

import Interfaz.IInterfazNotificable;
import Implementacion.CorreoElectronico;
import Implementacion.SMS;

import Interfaz.IInterfazComparableObjeto;
import Implementacion.Producto;

import java.util.Scanner;

/**
 *
 * @author Alondra
 */
public class Interfaces {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Animal
        IInterfazAnimal<String> perro = new Perro();
        IInterfazAnimal<String> gato = new Gato();
        // Perro
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Comportamiento del perro:");
        System.out.println(perro.hacerSonido());
        System.out.println(perro.mover());       
        // Gato
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
        
        // Pago
        IInterfazPago<String> pagoTarjeta = new PagoConTarjeta();
        IInterfazPago<String> pagoEfectivo = new PagoConEfectivo();
        // Pago con tarjeta
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Pago con tarjeta:");
        System.out.println(pagoTarjeta.procesarPago(150.75));
        // Pago con efectivo
        System.out.println("\nPago con efectivo:");
        System.out.println(pagoEfectivo.procesarPago(80.00));
        
        // Figura geometrica
        // Circulo
        System.out.println("------------------------------------------------------------------------");
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();
        IInterfazFiguraGeometrica<Double> circulo = new Circulo(radio);
        System.out.println("\nÁrea: " + circulo.area());
        System.out.println("Perímetro: " + circulo.perimetro());
        // Rectangulo
        System.out.print("\nIngrese la base del rectángulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = scanner.nextDouble();
        IInterfazFiguraGeometrica<Double> rectangulo = new Rectangulo(base, altura);
        System.out.println("\nÁrea: " + rectangulo.area());
        System.out.println("Perímetro: " + rectangulo.perimetro());
        scanner.close();
        
        // Trabajador
        IInterfazTrabajador<String> desarrollador = new Desarrollador();
        IInterfazTrabajador<String> diseñador = new Diseñador();
        // Desarrollador
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Tarea del desarrollador:");
        System.out.println(desarrollador.trabajar());
        // Diseñador
        System.out.println("\nTarea del diseñador:");
        System.out.println(diseñador.trabajar());
        
        // Ordenable
        IInterfazOrdenable<String> listaNumeros = new ListaNumeros();
        // Lista de números
        System.out.println("------------------------------------------------------------------------");
        System.out.println(listaNumeros.mostrarLista());
        System.out.println("\n" + listaNumeros.ordenar());
        
        // Alimentación
        IInterfazAlimentacion<String> persona = new Persona();
        IInterfazAlimentacion<String> animal = new Animal();
        //Persona
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Comportamiento de la persona:");
        System.out.println(persona.comer());   
        // Animal
        System.out.println("\nComportamiento del animal:");
        System.out.println(animal.comer());
        
        // Notificable
        IInterfazNotificable<String> correoElectronico = new CorreoElectronico();
        IInterfazNotificable<String> sms = new SMS();
        // Correo electrónico
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Notificación de correo:");
        System.out.println(correoElectronico.enviarNotificacion());  
        // SMS
        System.out.println("\nNotificación de SMS:");
        System.out.println(sms.enviarNotificacion());  
        
        // ComparableObjeto
        Producto producto1 = new Producto(150.0, "Laptop ASUS");
        Producto producto2 = new Producto(200.0, "Impresora HP");
        // Producto
        System.out.println("------------------------------------------------------------------------");
        System.out.println(producto1);
        System.out.println(producto2); 
        System.out.println("\n" + producto1.comparar(producto2));
    }
    
}
