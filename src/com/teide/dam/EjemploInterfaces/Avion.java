/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teide.dam.EjemploInterfaces;

/**
 *
 * @author DAM1
 */
public class Avion implements Volador{

    @Override
    public String despegar() {
        return "El avion ha despegado";
    }

    @Override
    public String aterrizar(int metros) {
        return "El avion "+(0.05*metros)+" ";
    }

    
    
}
