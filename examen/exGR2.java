package examen;
import java.util.Scanner;
public class exGR2 {
    static Scanner it=new Scanner(System.in);
    public static void main(String[] args) {
        //datos de entrada
        //calcualr el IGV, 
        //el descuento 
        //y caunto debe pagar
    double a; 
    int IGV;
    int elpago;
    String mensaje;
    System.out.println("ingrese el monto para saber cuanto debe pagar ");
    elpago=it.nextInt();
    System.out.println("ingrese el IGV");
    IGV=it.nextInt();
    //desarrollo
    if (elpago>2000) {
    a=(elpago)-(elpago*0.1)+(elpago*IGV);
    mensaje="usted supero el monto de 2000 recibio un descuento de 10% y pagara "+a;
    }else if (elpago>1000) {
    a=(elpago)-(elpago*0.05)+(elpago*IGV);
    mensaje="usted supero el monto de 1000$, por lo tando recibira el descuento de 5% y pagara " +a;
    }else{
    a=(elpago)-(elpago*0.02)+(elpago*IGV);
    mensaje="usted supero el monto de 500$ y recibira un descuento de 2% y pagara "+a;
    }
    //datos de salida
    System.out.println(mensaje);
    }
}
