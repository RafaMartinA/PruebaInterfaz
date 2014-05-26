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
    String aterrizar(int numero, int metros){
       return listado.get(numero).aterrizar(metros);
    }     
    public void añadir (Volador v) {
        listado.add(v);
    }    
    public boolean eliminar (int eliminacion) {
        listado.remove(eliminacion);
        return true;               
    }
    public String despegar (int numero){
            if(numero<listado.size()) return listado.get(numero).despegar();
            else return "No existe ese volador";
        }
}
     

