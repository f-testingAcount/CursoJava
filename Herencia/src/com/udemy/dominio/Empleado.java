/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udemy.dominio;

/**
 *
 * @author user
 */
public class Empleado extends Persona {
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Empleado(String nombre, double sueldo) {
        super(nombre);
        //this.idEmpleado = idEmpleado;
        this.idEmpleado =  ++Empleado.contadorEmpleado;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado {");
        sb.append("nombre=").append(this.getNombre()); //En este caso el modificador de acceso de la clase padre (Persona) es private por eso solo se puede acceder con en metodo get
        sb.append(", idEmpleado=").append(idEmpleado); //En este caso el modificador de acceso de la clase padre es protected por lo tanto se puede acceder derectamente desde las clases hijas sin invocar el metodo get (que tambien funcionaria en este caso.
        sb.append(", sueldo=").append(sueldo);
        sb.append(", Persona {").append(super.toString());        
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    
    

    
    
    
    
}
