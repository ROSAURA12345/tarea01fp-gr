 package reforsamiento;

import java.util.Scanner;


/**
  * Ejercicios
  */
 public class Ejercicios {

     public static void mostrarcursoDia() {
         //definir variable
         int diasem;
         String mensaje;
         String primeraParteM="ese dia toca el curso de:";

         //leer datos
         Scanner leerT=new Scanner(System.in);
         System.out.println("ingrese un dia de la semana:\n1=Dom"+"\n2=Lun\n3Mar\n4=Mie\n5=Jue\n6=Vie\n7sab");
         diasem=leerT.nextInt();
         //proceso
         if (diasem==1||diasem==7){
         mensaje="no hay clases";
         }else if (diasem==2){
         mensaje= primeraParteM +"Matematica";
         }else if (diasem==3||diasem==5 ) {
             mensaje=primeraParteM +"Fundamentos de programacion";
         }else if (diasem==4){
            mensaje=primeraParteM +"capacidades comunicativas";
        }else if (diasem==6){
        mensaje=primeraParteM +"introduccion a la ingenierie de sistemas";
        }else {
        mensaje="el dia que no coloco no existe";
        }
        //datos de salida
        System.out.println(mensaje);
            
        }
              
      
 
    public static void main(String[] args) {
        System.out.println("hola mundo");
        mostrarcursoDia();
        
    }
 }