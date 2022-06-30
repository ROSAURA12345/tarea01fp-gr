package pe.edu.upeu.modelo;

public class Persona {
    public String codigo;
    public String nombres;
    public boolean asistencia;   
    
    public Persona(String codigo, 
        String nombres, boolean asistencia){
        this.codigo=codigo;
        this.nombres=nombres;
        this.asistencia=asistencia;
    }
}
