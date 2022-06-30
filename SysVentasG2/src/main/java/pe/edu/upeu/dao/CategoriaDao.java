package pe.edu.upeu.dao;

import pe.edu.upeu.crud.AppCrud;
import pe.edu.upeu.modelo.CategoriaTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

public class CategoriaDao extends AppCrud {
    LeerArchivo leerA;
    LeerTeclado leerT=new LeerTeclado();
    UtilsX util=new UtilsX();
    CategoriaTO cTo;
    final static String TABLA_CATEGORIA="Categoria.txt";

    public void crearCategoria() {
      cTo=new CategoriaTO();
      leerA=new LeerArchivo(TABLA_CATEGORIA);
      String idC=generarId(leerA, 0, "C", 1);
      cTo.setIdCate(idC);
      cTo.setNombre(leerT.leer("", "Ingrese nombre categoria"));
      leerA=new LeerArchivo(TABLA_CATEGORIA);
      agregarContenido(leerA, cTo);
    }
}
