/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.udemy;

/**
 *
 * @author user
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resultado = 0;
        try {
            resultado = 10 / 0;
        } catch (Exception e) {
            System.out.println("Detalle del error: ");
            e.printStackTrace(System.out);
        }
        System.out.println("resultado = " + resultado);
    }

}
