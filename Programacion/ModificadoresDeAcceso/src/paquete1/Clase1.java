/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author user
 */
class Clase1 { //Las clases no admiten el modificador protected.
    String atributoDefault = "Valor atributo default";
    
    Clase1(){ //Los constructores no se heredan. El constructor protected solo puede accederse desde clases hijas invocando el metodo super().
        System.out.println("Constructor default"); //Los protected se limitan al ambito del paquete que habitan
    }
    
//    public Clase1(String arg){ //Agregamos este metodo publico para poder instanciar la clase en el main
//        System.out.println("Constructor publico");
//    }
    
    void metodoDefault(){ // Idem
        System.out.println("Metodo default");
    }
    //TODOS LOS ATRIBUTOS, CONSTRUCTORES Y METODOS PROTECTED SOLO PUEDEN ACCEDERSE DESDE CLASES HIJAS.
    
    
    
}
