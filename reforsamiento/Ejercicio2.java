package reforsamiento;

import java.util.Scanner;

public class Ejercicio2 {

    Scanner leerT=new Scanner(System.in);
    
    public static void saludosSegunHora() {
        //variables
        int hora;
        String saludo;
        //datos de entrada
        System.out.println("ingrese la hora:");
        hora=leerT.nextInt();
        //proceso
        if (hora>=6 && hora<=12) {
            saludo="buenos dias";
        }else if (hora>=13 && hora<=20) {
            saludo="buenas tardes";
        }else if (hora<=21 && hora<=23)||(hora>=0 && hora<=5) {
            saludo="buenas noches";
        }else{
            saludo="esa hora no existe";
            }
            //datos de salida
            System.out.println(saludo);
            //mostrarcursoDia();
            saludosSegunHora();






        
    }

public static void main(String[] args) {
    
}

    
}
