
package paquete1;

//import com.udemy.paquete1.Clase1;


public class ClaseHija extends Clase1 {
    
    public ClaseHija(){
        super();
        this.atributoDefault = "Modificacion atributo default";
        System.out.println("atributoProtegido = " + this.atributoDefault);
        this.metodoDefault();
    } 
    
    
}
