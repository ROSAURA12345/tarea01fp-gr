package upeu;

import javafx.scene.chart.Chart;

/**
 * Persona
 */
public class Persona {
    String nombre;
    char genero;
    String ocupacion;

    Persona(){
    }

    Persona(String nombre){
        this.nombre=nombre;
    }
    Persona(String nombre,char genero,String ocupacion){
        this.nombre=nombre;
        this.genero=genero;
        this.ocupacion=ocupacion;
    }



    

    public String obtenerNombre() {
        return nombre;   
    }
    public char obtenerGenero() {
        return genero;   
    }
    public String obtenerOcupacion() {
        return ocupacion;      
    }
    public void modificarNombre(String nombre) {
        this.nombre=nombre;
    }
    public void modificarGenero(Char genero) {
        this.genero=genero;  
    }
    public void modificarOcupacion(String ocupacion) {
        this.ocupacion=ocupacion;       
    }

    
}

class principal{

    public static void main(String[] args) {
        Persona myobj=new Persona("Dario", 'M',"ing.Civi");
        System.out.println(myobj.obtenerNombre());
        System.out.println(myobj.obtenerGenero());
        System.out.println(myobj.obtenerOcupacion());
       /*  System.out.println(myobj.nombre);
        myobj.modificarNombre("Raul");
        System.out.println(myobj.nombre);
        System.out.println(myobj.obtenerNombre());*/
    }
}
