 package ref3g;

 import java.util.Scanner;

public class RefRepetitivas {


    static Scanner leerT=new Scanner(System.in);
    //Pregunta 01 Reforzamiento
 
    public static void siNumeroPrimo() {
        System.out.println("Ingrese un numero:");
        int num=leerT.nextInt();
        int cont=1;
        int cantDiv=0;
        while (cont<=num) {
            if (num%cont==0) {
                cantDiv++;
            }
            cont++; 
        }        
        if (cantDiv==2) {
            System.out.println("El numero "+num+" es primo");
        } else {
            System.out.println("El numero "+num+" no es primo");
        }
    }

    public static void main(String[] args) {
        //serieFibonaci();
        //fibonaciN();
        siNumeroPrimo();
    }    
}