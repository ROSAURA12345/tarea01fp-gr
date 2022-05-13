
public static void pregunta4() {
 int edad;
 String sexo;
 String vacuna; 
 //Datos de Entrada
 Scanner lt=new Scanner(System.in);
 System.out.print("Ingrese la edad del paciente:");
 edad=lt.nextInt();

 //Proceso

 if (edad>69) {
     vacuna="La vacuna que le corresponde es C";
 }else if(edad>16){
     System.out.println("Ingrese el sexo (F=femenino y M=masculino)");
     sexo=lt.next();
     vacuna="La vacuna que le corresponde es B"; 
 } else if(edad<16){
     vacuna="La vacuna que le corresponde es A";
 } else {
     vacuna="La vacuna que le corresponde es  A";
 }    

 System.out.println(vacuna);
}
