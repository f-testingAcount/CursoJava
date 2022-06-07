/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udemy.paquete1;

/**
 *
 * @author user
 */
public class Clase1 { //La clase publica puede ser utilizada desde otras clases del mismo paquete o de otros paquetes. Es aacesible desde cualquier parte del proyecto.
    public String atributoPublico = "Valor atributo publico";
    
    public Clase1(){
        System.out.println("Constructor publico"); //El mismo caso de da para el constructor
    }
    
    public void metodoPublico(){
        System.out.println("Metodo publico");
    }
    
    
}
