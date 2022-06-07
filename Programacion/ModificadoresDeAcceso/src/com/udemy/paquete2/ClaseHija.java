/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udemy.paquete2;

import com.udemy.paquete1.Clase1;

/**
 *
 * @author user
 */
public class ClaseHija extends Clase1 {
    
    public ClaseHija(){
        super();
        this.atributoProtected = "Modificacion atributo protected";
        System.out.println("atributoProtegido = " + this.atributoProtected);
        this.metodoProtected();
    } 
    
    
}
