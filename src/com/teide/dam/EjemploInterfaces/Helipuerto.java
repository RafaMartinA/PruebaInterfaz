/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teide.dam.EjemploInterfaces;

import java.util.ArrayList;

/**
 *
 * @author DAM1
 */
public class Helipuerto {
    
    ArrayList<Volador>listado = new ArrayList<>();
    
    public void añadir (Volador v) {
        listado.add(v);
    }
    
    public boolean eliminar (int eliminacion) {
        listado.remove(eliminacion);
        return true;
    }
    
    String aterrizar(int numero, int metros){
       return listado.get(numero).aterrizar(metros);
    }
    String despegar(int numero){
       return listado.get(numero).despegar();
    }
    //que pasa
     
}
