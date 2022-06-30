package pe.edu.upeu.dao;

import pe.edu.upeu.crud.AppCrud;
import pe.edu.upeu.modelo.ClienteTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

public class ClienteDao extends AppCrud{
    LeerArchivo leerA;
    LeerTeclado leerT=new LeerTeclado();
    UtilsX util=new UtilsX();
    ClienteTO cTo;
    final static String TABLA_CLIENTE="Cliente.txt";

    public void crearCliente() {
      cTo=new ClienteTO();
      leerA=new LeerArchivo(TABLA_CLIENTE); 
      String dniX=leerT.leer("", "Ingrese DNI/Ruc");
      if (!validarNoexisteId(dniX)) {
        cTo.setDniruc(dniX);
        cTo.setNombreRS(leerT.leer("", "Ingrese nombre cliente"));
        cTo.setTipo(leerT.leer("", "Ingrese Tipo Cliente"));
        leerA=new LeerArchivo(TABLA_CLIENTE);
        agregarContenido(leerA, cTo);        
      }else{
        System.out.println("El DNI/RUC ya existe! intente Otra vez.");
        crearCliente();
      }
    }
    public boolean validarNoexisteId(String dniRuc) {
        leerA=new LeerArchivo(TABLA_CLIENTE);        
        Object[][] datC=buscarContenido(leerA, 0, dniRuc);
        if (datC==null || datC.length==0) {
            return false;         
        }
        return true;
    }
}
