/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udemy.paquete1;

/**
 *
 * @author user
 */
public class Clase1 { //Las clases no admiten el modificador protected.
    protected String atributoProtected = "Valor atributo protected";
    
    protected Clase1(){ //Los constructores no se heredan. El constructor protected solo puede accederse desde clases hijas invocando el metodo super().
        System.out.println("Constructor protected"); //Los protected se limitan al ambito del paquete que habitan
    }
    
    public Clase1(String arg){ //Agregamos este metodo publico para poder instanciar la clase en el main
        System.out.println("Constructor publico");
    }
    
    protected void metodoProtected(){ // Idem
        System.out.println("Metodo protected");
    }
    //TODOS LOS ATRIBUTOS, CONSTRUCTORES Y METODOS PROTECTED SOLO PUEDEN ACCEDERSE DESDE CLASES HIJAS.
    
    
    
}
