

import java.math.BigInteger;
import java.util.Scanner;
 /**
  * Ejerciciosvarios
  */
 public class Ejerciciosvarios {

    static Scanner leerT=new Scanner(System.in);

    public static void factorialXnum() {
        int n; 
        long result=1;
        System.out.println("Ingrese un numero:");
        n=leerT.nextInt();
        if(n>1){
        for (int i = 1; i <=n; i++) {
            result=result*i; 
            }
        }
        System.out.println("El factorial de "+n+" es:"+result);
    }

    public static long factorialNum(int n) {        
        long result=1;
        if(n>1){
        for (int i = 1; i <=n; i++) {
            result=result*i; 
            }
        }       
        return result;
    }    

    public static long factorialNumbig(int n) {        
        BigInteger result=new BigInteger("1");
        if(n>1){
        for (int i = 1; i <=n; i++) {
            result=result.multiply(new BigInteger( String.valueof(i)));
            }
        }       
        return result;
    }    



    public static void main(String[] args) {
       /* factorialXnum();
       long resultado=factorialNum(5);
       system.out.println("resultado;"+resultado);*/
       System.out.println("ingrese el numero:");
       int numero=leerT.nextInt();
       for (int i=1;i<=10;i++){
           System.out.println("factorial de"+i+"!="+ factorialNumBig(1));
    }

 
 }
}
