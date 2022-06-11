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
        imprimir(miLista);
        
//        for (Object elemento : miLista) {
//            System.out.println("elemento = " + elemento);
//        }
//        
//        System.out.println("\n");
//                
//        miLista.forEach(elemento -> { //Funcion Lambda o funcion flecha
//            System.out.println("elemento = " + elemento);
//        });

        System.out.println("\n");
        
        Set miSet = new HashSet();
        miSet.add("Lunes"); //El metodo set esta definido en la Interface Collections y las interfaces hijas lo heredan
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        imprimir(miSet);
        
        
    }
    
    public static void imprimir(Collection coleccion){
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });       
    }
    
}
