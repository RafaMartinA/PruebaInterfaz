/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teide.dam.EjemploInterfaces;

/**
 *
 * @author DAM1
 */
public class Helicoptero implements Volador{

    @Override
    public String despegar() {
        return "El helicoptero ha despegado";
    }

    @Override
    public String aterrizar(int metros) {
        return "El Helicoptero ha aterrizado con un coste de "+(0.10*metros)+" €";
    }
    
}
