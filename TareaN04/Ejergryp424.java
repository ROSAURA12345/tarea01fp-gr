package TareaN04;

import java.util.Scanner;


    /**
     * InnerEjergryp424
     */
    public class Ejergryp424 {
        
        

        static Scanner it=new Scanner(System.in);
        private static Void UnaConbinacionParaAbrirelPrograma() {

            //definir variables

            int intentos = 4;
            int numeroIntroducido;
            boolean acertado = false;
            
            do {
              System.out.print("Introduzca la clave de la caja fuerte: ");
              numeroIntroducido = Integer.parseInt(System.console().readLine());
              
              if (numeroIntroducido == 8888) {
                acertado = true;
              } else {
                System.out.println("Clave incorrecta");
              }
              //datos de salia
              
              intentos--;
          
            } while((intentos > 0) && (!acertado));
            
            if (acertado) {
              System.out.println("Ha abierto la caja fuerte.");
            } else {
              System.out.println("Lo siento, ha agotado las 4 oportunidades.");
            }


    public static void main(String[] args) {
        UnaConbinacionParaAbrirelPrograma();
        
          }

        }


    
        
    
    

