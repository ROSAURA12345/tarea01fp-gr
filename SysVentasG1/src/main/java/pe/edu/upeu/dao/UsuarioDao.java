package pe.edu.upeu.dao;

import pe.edu.upeu.crud.AppCrud;
import pe.edu.upeu.modelo.UsuarioTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

public class UsuarioDao extends AppCrud {
    LeerArchivo leerA;
    LeerTeclado leerT=new LeerTeclado();
    UtilsX util =new UtilsX();
    UsuarioTO uto;
    final static String TABLA_USUARIO="Usuario.txt";

    public void crearUsuarios() {
        uto=new UsuarioTO();     
        uto.setUsuario(leerT.leer("", "Ingrese un Usuario"));   
        console cons=System.console();
        System.out.println("Ingrese su calve:");
        char[] clavex=cons.readPassword();
        uto.setClave(String.valueOf(clavex));
        leerA=new LeerArchivo(TABLA_USUARIO);
        agregarContenido(leerA, uto);
    }
    
    public void listarUsuarios() {
        leerA=new LeerArchivo(TABLA_USUARIO);
       Object[][] data=listarContenido(leerA);
       imprimirLista(data); 
    }



    
}
