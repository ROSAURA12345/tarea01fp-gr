package Recursividad;

import java.util.Scanner;

/**
 * EjemplosRecursividad
 */
public class EjemplosRecursividad {

    public static int factorial(int n) {
        if(n>1){
            return factorial(n-1)*n;
            
    }
    return 1;
        
    }


    public static int fibonacciR(int n) {
        if (n>1){
         return fibonacciR(n-1)+fibonacciR(n-2);
        }
        return n;
        
    }
  
    public static int suma(int n) {
        if (n>1){
         return suma(n-1)+n;
        }
        return n;
        
    }

    public static int potencia(int n) {
        if (n>2){
         return potencia(n*2)*n;
        }
        return n;
        
    }
  


    public static void main(String[] args) {
        System.out.println(factorial( 5));
        System.out.println("fibonacci:");
        System.out.println(fibonacciR( 6));
        System.out.println(suma(100));
        System.out.println(potencia(16));

        
    }

    
}