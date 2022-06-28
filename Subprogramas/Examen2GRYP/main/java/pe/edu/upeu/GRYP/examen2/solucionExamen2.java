package pe.edu.upeu.GRYP.examen2;

import java.util.Scanner;


public class solucionExamen2 {

    static Scanner lt=new Scanner(System.in);
    public static void impuestocarros() {
        //Declarar variables
        String clavedecategoría, hayMas="S";
        int cantcategoría1=0, cantcategoría2=0, cantcategoría3=0;
        double preciocategoría1=0, preciocategoría2=0, preciocategoría3=0, impcategoría1=0, impcategoría2=0, impcategoría3=0, totalimpcategoríastotales=0, totalapagarportodo;
        while (hayMas.equals("S")) {
            System.out.println("Ingrese la categoría del producto(1,2,3):");
            clavedecategoría=lt.next().toUpperCase();
            if (clavedecategoría.equals("1")) {
                System.out.println("Ingrese la cantidad de de Vehículos de categoría "+clavedecategoría+":");
                cantcategoría1=cantcategoría1+lt.nextInt();
                if (preciocategoría1==0){
                System.out.println("Ingrese el precio del Vehículo de categoría "+clavedecategoría+":");
                preciocategoría1=lt.nextDouble();
                }
                impcategoría1=preciocategoría1*0.12;
            }else if (clavedecategoría.equals("2")){
                System.out.println("Ingrese la cantidad de de Vehículos de categoría "+clavedecategoría+":");
                cantcategoría2= cantcategoría2+lt.nextInt();
                if (preciocategoría2==0){
                System.out.println("Ingrese el precio del Vehículo de categoría "+clavedecategoría+":");
                preciocategoría2=lt.nextDouble();
                }
                impcategoría2=preciocategoría2*0.08;
            }else if (clavedecategoría.equals("3")){
                System.out.println("Ingrese la cantidad de de Vehículos de categoría "+clavedecategoría+":");
                cantcategoría3=cantcategoría3+lt.nextInt();
                if (preciocategoría3==0){
                System.out.println("Ingrese el precio del Vehículo de categoría "+clavedecategoría+":");
                preciocategoría3=lt.nextDouble();
                }
                impcategoría3=preciocategoría3*0.05;
            } else{ System.out.println("La categoría de vehículo es incorrecta, eliga una clave de categoría correcta porfavor");}
            System.out.println("Hay más vehículos?: S=Si, N=NO");
            hayMas= String.valueOf(lt.next().toUpperCase().charAt(0));    
        }
        System.out.println("Impuesto de Vehículo de categoría 1 es :"+impcategoría1);
        System.out.println("Impuesto de Vehículo de categoría 2 es :"+impcategoría2);
        System.out.println("Impuesto de Vehículo de categoría 3 es :"+impcategoría3);

        System.out.println("Impuesto Total de Vehículo de categoría 1 es :"+(impcategoría1*cantcategoría1));
        System.out.println("Impuesto Total de Vehículo de categoría 2 es:"+(impcategoría2*cantcategoría2));
        System.out.println("Impuesto Total de Vehículo de categoría 3 es:"+(impcategoría3*cantcategoría3));

        totalimpcategoríastotales=(impcategoría1*cantcategoría1)+(impcategoría2*cantcategoría2)+(impcategoría3*cantcategoría3);
        System.out.println("Total impuesto a pagar de "+cantcategoría1+" autos categoría 1, "+cantcategoría2+" autos categoría 2 y "+cantcategoría3+" autos categoría 3 es de:"+totalimpcategoríastotales);
        totalapagarportodo= (preciocategoría1*cantcategoría1)+(preciocategoría2*cantcategoría2)+(preciocategoría3*cantcategoría3)+totalimpcategoríastotales;
        System.out.println("Total a pagar de "+cantcategoría1+" autos categoría 1, "+cantcategoría2+" autos categoría 2 y "+cantcategoría3+" autos categoría 3, con el impuesto total; es de "+totalapagarportodo);

    }
    public static void pintadodeX() {
      int alturadeX=0;
      do {
        System.out.println("Ingrese la altura de la X, recuerde que esta debe ser mayor a 3, y debe ser impar: ");
        alturadeX= lt.nextInt();
        if (alturadeX< 3 || alturadeX%2==0) {
          System.out.println("Error, recuerde las indicaciones que te dejamos arriba");
          alturadeX=lt.nextInt();
      } 
    }
      while (alturadeX<3 && alturadeX%2==0);
  for (int fil = 1; fil <= alturadeX; fil++){
    for (int col = 1; col <= alturadeX; col++){
      if ((fil == col) || (col == (alturadeX-fil)+1)){
        System.out.print("*");
      } else {
        System.out.print(" ");
      }
    }
    System.out.println();
  }
  }
   public static void númerosperfectos() {        
    int numero;
    int resultado;
    int suma=0;
    System.out.println("Introduzca el número a consultar, el siguiente algoritmo le indicará si este es o no un número perfecto");
    numero=lt.nextInt();
    for (int i=1;i<numero;i++){
        resultado =numero%i;
        if (resultado==0){
            suma=suma+i;
        }
    }
    if(suma==numero){
        ;
        System.out.println("El número "+numero+"  es perfecto");
    }else{
        System.out.println("El número "+numero+" no es perfecto");
    }
    }
    public static void númerosperfectossegundométodo() {
      int i, j, suma;
      System.out.println("Números perfectos entre 1 y 2000000000: ");
      for(i=1;i <= 2000000000;i++){      
          suma = 0;
          for(j = 1;j < i;j++){                             
               if(i % j==0){
                  suma = suma + j; 
               }
          }
        if(i == suma){                         
           System.out.println(i);
        }
      }
    }
    public static void DecimalaBinario() {
      Scanner t= new Scanner(System.in);
      int n;
      do {
          System.out.println("Ingresa un número positivo en base decimal que quiera convertir a binario: ");
          n=t.nextInt();

      } while (n<0);

      DecimalaBinario(n);
      System.out.println("");

  }

  public static void DecimalaBinario(int decimal){
      if (decimal<2) {
          System.out.print(decimal);
      }else{
          DecimalaBinario(decimal/2);
          System.out.print(decimal % 2);
      }
  }
static Scanner st=new Scanner(System.in);
public static void main(String[] args) {
  System.out.println("Coloque la pregunta que desee");
  int pregunta = st.nextInt();
  switch (pregunta) {
    case 1:
      impuestocarros(); break;
    case 2:
      pintadodeX(); break;
    case 3:
      númerosperfectos(); break;
    case 4:
     númerosperfectossegundométodo(); break;
     case 5:
     DecimalaBinario();
      default: break;
  }
}
}