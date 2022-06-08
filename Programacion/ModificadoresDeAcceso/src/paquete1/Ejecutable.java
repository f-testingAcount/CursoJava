/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

/**
 *
 * @author user
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Clase1 clase1 = new Clase1();
        clase1.atributoDefault = "Cambio desde la prueba";
        System.out.println("clase1 atributo default= " + clase1.atributoDefault);
        //System.out.println("clase1 = " + clase1.atributoPublico); //El atributo no puede accederse si esta marcado como protected en la clase origen. Solamente pueden accederse desde clases hijas de la originaria.
        //clase1.metodoPublico(); //este metodo no puede ser accedido porque esta marcado como protected en la Clase origen idem anterior 
        
        //ClaseHija claseHija = new ClaseHija();
        //System.out.println("claseHija = " + claseHija);
        
        
        
    }
    
}
