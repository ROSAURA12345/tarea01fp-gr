package pe.edu.upeu.arrays;

import java.util.Scanner;

public class transformadasMatriz {
    Scanner cs=new Scanner(System.in);

    public void transformada01() {
        System.out.println("ingrese dimension Matriz:")
         int dimensiones=cs.nextInt();
         System.out.println("ingrese el valor de inicio:");
         int valorlint=cs.nextInt();
         String[][] matriz=new String[dimension][dimension];
         for ( int f = 0; f < Matriz.length; f++) {
             for (int c = 0; c < Matriz[0].length c++) {
                 if (c< dimension-f) {
                     matriz[f][c]=String.valueOf(valorlint+(f+c)(f+c+1)/2+f);
                  } else (matriz[f][c]="";}
                     
                 }
                 imprimirMatricez(matriz);
                 
             }

             public void transformada12() {
                System.out.println("ingrese dimension Matriz:");
                 int dimensiones=cs.nextInt();
                 System.out.println("ingrese el valor de inicio:");
                 int valorlint=cs.nextInt();
                 String[][] matriz=new String[dimension][dimension];
                for ( int f = 0; f < Matriz.length; f++) {
                    for (int c = 0; c < Matriz[0].length-1; c>= ; c--) {
                        matriz[f][c]=String.valueOf(valorlint);
                        valorlint++;//1
             }
                }
                imprimirMatricez(matriz);
            }
            
            
    
    public static void imprimirMatricez(String[][]m) {
        for(int f =0; f < m. length; f++){
            for (int c = 0; c < m[0].length; c++){
                if (m[f][c]==null) {
                    System.out.println("");
                    
                }
                System.out.println(m[f][c]+"/t");       
            }
            System.out.println("");
        }
    }


    public static void main(String[] args) {
        //new transformadasMatriciz().transformada01();
        
    }
    
}
