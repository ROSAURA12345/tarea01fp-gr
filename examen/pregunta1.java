package examen;

import java.util.Scanner;

class pregunta1{
    static Scanner st=new Scanner(System.in);

    public static void pregunta1() {
        String Nl;
    double Nec, NE, Ntp; 
    System.out.println("Ingrese las notas: ");
    System.out.println("Ingrese la nota del Examen de Conocimiento");
    Nec=st.nextDouble();
    System.out.println("Ingrese la nota de la Entrevista Personal");
    NE=st.nextDouble();
    System.out.println("Ingrese la nota del Test Psicologico");
    Ntp=st.nextDouble();

    //Proceso

    double PEC = (Nec * 0.40);
    double PEP = (NE * 0.35);
    double PTP = (Ntp * 0.25);
    double promedio = (PEC + PEP + PTP);

    if (promedio>=17 && promedio<=20) {
        Nl="Su nivel es 4";
    } else if(promedio<17 && promedio>=14){
        Nl="Su nivel es 3";
    } else if(promedio<14 && promedio>=11){
        Nl="Su nivel es 2";
    } else if(promedio<11){
        Nl="usted No puede obtener vacante";
    } else {
        Nl="Notas no validas ";
    }
    // Datos de Sal
    System.out.println(Nl);
    }
}