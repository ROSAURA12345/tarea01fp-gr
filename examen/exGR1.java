package examen;
import java.util.Scanner;
public class exGR1 {
    static Scanner it=new Scanner(System.in);
    public static void main(String[] args) {
        //datos de entrada
        //nivel de del perfil del estudiante
        //4 niveles
        //40%, 35%, 25%
        double a, b,c,d;
        
        String mensaje;
        System.out.println("ingrese la nota del examen de conocimiento");
        a=it.nextInt();
        System.out.println("ingrese la entrevista pesonal");
        b=it.nextInt();
        System.out.println("ingrese la nota de test psicologico");
        c=it.nextInt();
        //proceso
        d=(a*0.4)+(b*0.35)+(c*0.25);
        if (d>=17) {
            mensaje="usted obtuvo un vacante, su nivel es 4";
        } else if (d>=14) {
            mensaje="usted obtuvo un vacante, su nivel es 3 ";
        } else if (d>=11) {
            mensaje="usted obtuvo un vacante, su nivel es 2";
        }else {
            mensaje="usted no puede obtener el vacante, su nivel es 1";
        }
        System.out.println(mensaje);
    }
}
