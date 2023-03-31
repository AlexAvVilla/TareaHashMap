/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.util.HashMap;

/**
 *
 * @author umg
 */
public class MapModelo {
    HashMap Paises = new HashMap();
    
    public void IngresarMap(int cod, String nom){
        Paises.put(cod, nom);
        System.out.println(Paises);
    }
}
