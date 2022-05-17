package examen;

import java.util.Scanner;
public class exGR3 {
    static Scanner it=new Scanner(System.in);
    public static void main(String[] args) {
       //ejercicio numero 3
        //calculadora
        //datos de salida
        double a, b,c;
        int v1,v2;
        System.out.println("ingrese el primer valor");
        v1=it.nextInt();
        System.out.println("ingrese el segundo valor");
        v2=it.nextInt();
        //desarrollo
        //potencia
        a=Math.pow(v1, v2);
        //porcentaje
        b=v1%2+(v2*0);
        //raiz
        c=Math.sqrt(v1)+(v2*0);
        char operador=it.next().charAt(0);
        switch (operador) {
            //datos de salida
            case '+': System.out.println(v1+v2); break;
            case '-': System.out.println(v1-v2); break;
            case '/': System.out.println(v1/v2); break;
            case '*': System.out.println(v1*v2); break;
            case '^': System.out.println(a); break;
            case 'R': System.out.println(c); break;
            case '%': System.out.println(b); break;
             default: break;  }
            } 
}
