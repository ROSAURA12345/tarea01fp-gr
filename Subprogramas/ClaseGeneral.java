package Subprogramas;

import java.util.Scanner;

import javax.sql.rowset.spi.SyncProvider;

public class ClaseGeneral {
    static Scanner leerT=new Scanner(System.in);
    static Aritmetica obj=new Aritmetica();
    static Persona objP=new Persona();


    public static void main(String[] args) {
       /* System.out.println("ingrese el primer valor:");
        int aX=leerT.nextInt();
        System.out.println("ingrese el segundo valor");
        int bX=leerT.nextInt();
        int resul=obj.sumar(aX , bX);
        System.out.println("la suma es:"+resul);*/
        System.out.println("ingrese su nombre:");
        objP.nombre=leerT.next();

        System.out.println("ingrese su dni");
         objP.dni =leerT.next();
        System.out.println( "ingrse una comida:");
        objP.comer(leerT.next());



        
    }
    
}
