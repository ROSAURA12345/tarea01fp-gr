package TareaN04;

import java.util.Scanner;

/**
 * Ejergryp426
 */
public class Ejergryp426 {

    static Scanner it=new Scanner(System.in);
   public static void MostColumnaselcuadradoelcubo() {
       //definir variables
       System.out.print("Introduzca un número:");
       int numeroIntroducido = Integer.parseInt(System.console().readLine());
   
       System.out.println("   n  |    n²   |    n³");
       System.out.println("introduce el primer numero , por favor: ");
       for (int i = numeroIntroducido; i < numeroIntroducido + 5; i++) {
         System.out.printf("%5d |%8d |%9d\n", i, i * i, i * i * i);
       }
       //datos de salida
       System.out.println("mostrar en 3 columnas , el cuadradoy el cubo de los 5 primeros enteros:");
     }
     
     public static void main(String[] args) {
      MostColumnaselcuadradoelcubo();
         
     }

   }



   
    


