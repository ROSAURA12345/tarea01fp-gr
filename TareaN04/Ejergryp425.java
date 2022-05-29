package TareaN04;

import java.util.Scanner;

public class Ejergryp425 {
    
    static Scanner it=new Scanner(System.in);
    public static void calMedidaConjuntodeNumerosPositivos () {
        //definir variables
        double numeros = 0;
        double numeroIntroducido = 0;
        double suma = 0;
    
        System.out.println("Este programa calcula la media de los números positivos introducidos.");
        System.out.println("Para parar, introduzca un número negativo.");
        System.out.println("Vaya introduciendo números:");
    
        while (numeroIntroducido >= 0) {
          numeroIntroducido = Double.parseDouble(System.console().readLine());
          numeros++;
          suma += numeroIntroducido;
        }
        //datos de salida
        
        System.out.print("La media de los números positivos introducidos es ");
        System.out.println((suma - numeroIntroducido) / (numeros - 1));
      }
    

    public static void main(String[] args) {
        calMedidaConjuntodeNumerosPositivos();
        
    }
    
}
