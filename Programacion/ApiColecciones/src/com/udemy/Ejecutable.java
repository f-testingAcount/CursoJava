/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.udemy;

import java.util.*;


/**
 *
 * @author user
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List miLista = new ArrayList();  //La caracteristica de la lista es que mantiene el orden de lo que se ingresa.
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        
        for (Object elemento : miLista) {
            System.out.println("elemento = " + elemento);
        }
        
        System.out.println("\n");
                
        miLista.forEach(elemento -> { //Funcion Lambda o funcion flecha
            System.out.println("elemento = " + elemento);
        });
        
        
        
    }
    
}
