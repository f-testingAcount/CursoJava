/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udemy.aritmentica;

import com.udemy.excepciones.OperacionExcepcion;

/**
 *
 * @author user
 */
public class Aritmetica {
    public static int division(int numerador, int denominador) { //En el caso del RuntimeException no es necesario agregar la excepcion en la firma del metodo
        if (denominador == 0) {
            throw new OperacionExcepcion("Division por cero");
        }
        return numerador / denominador;
    }
    
}
