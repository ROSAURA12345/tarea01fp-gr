package estcondicional;

import java.util.Scanner;


/**
 * EjercicioCondMult
 */
public class EjercicioCondMult {
    public static void profesor() {
        System.out.println("lafuncion del docente es enseñar");
        
    }
    public void estudiante() {
        System.out.println("la funcion del estudiante es aprender");
        
    }

      public void maquinapc() {
        System.out.println("la funcion de la pc esprocesar informacion");
        
          
      }
      public void proyector() {
          System.out.println("proyectar una imagen,informacion");

           
              }
    public static void main(String[] args) {
        Scanner lt=new Scanner(System.in);
        System.out.println("ingrese el algoritmo que desea probar/nl=profesor"+"/n2=estudiante/n3=maquina/n4=proyector");
        EjercicioCondMult objx=new EjercicioCondMult();
        int opcMet=lt.nextInt();
        switch (opcMet) {
            case 1:profesor(); break;
             case 2: objx.estudiante(); break; 
             case 3: objx.maquinapc(); break;  
             case 4: objx.proyector(); break;
            default: System.err.println("opcion no exite"); break;
        }
                
    }

}