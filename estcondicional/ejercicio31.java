package estcondicional;

import java.util.Scanner;

/**
 * ejercicio31
 */
public class ejercicio31 {
static Scanner lt =new Scanner(System.in);
  public static void main(String[] args) {
      //declarar variables
      int edad;
      String mensaje;
      //datos de entrada
      System.out.println("ingrese la edad:");
edad=lt.nextInt();
//proceso
if (edad>=18) {
    mensaje=" puede votar su edad es "+edad;
} else {
   mensaje ="no puede votar porque su edad es"+edad;
}
//datos de salida 
System.out.println(mensaje);
  }  
}