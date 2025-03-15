/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementacion;

import Interfaz.IInterfazTrabajador;

/**
 *
 * @author Alondra
 */
public class Diseñador implements IInterfazTrabajador<String>{

    @Override
    public String trabajar() {
        return "El diseñador está creando una interfaz gráfica.";
    }
    
}
