package pe.edu.upeu.dao;

import pe.edu.upeu.crud.AppCrud;
import pe.edu.upeu.modelo.MarcaTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

public class MarcaDao extends AppCrud{
    LeerArchivo leerA;
    LeerTeclado leerT=new LeerTeclado();
    UtilsX util=new UtilsX();
    MarcaTO mTo;
    final static String TABLA_MARCA="Marca.txt";

    public void crearMarca() {
      mTo=new MarcaTO();
      leerA=new LeerArchivo(TABLA_MARCA);
      String idM=generarId(leerA, 0, "C", 1);
      mTo.setIdMarca(idM);
      mTo.setNombre(leerT.leer("", "Ingrese nombre Marca"));
      leerA=new LeerArchivo(TABLA_MARCA);
      agregarContenido(leerA, mTo);
    }    
}
