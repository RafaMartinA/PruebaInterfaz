/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teide.dam.EjemploInterfaces;

/**
 *
 * @author DAM1
 */
public class Pajaro implements Volador{

    @Override
    public String despegar() {
       return "El pajaro despega todas las mañanas para dar de comer a sus crias";
    }

    @Override
    public String aterrizar(int metros) {
        return " El pajaro aterriza en una rama";
    }
    
}
