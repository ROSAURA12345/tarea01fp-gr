package pe.edu.upeu.dao;

import pe.edu.upeu.crud.AppCrud;
import pe.edu.upeu.modelo.ProductoTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

public class ProductoDao extends AppCrud {
    LeerTeclado leerT = new LeerTeclado();
    LeerArchivo leerA;
    UtilsX util = new UtilsX();
    ProductoTO pTo;
    final static String TABLA_PRODUCTO="Producto.txt";
    final static String TABLA_MARCA="Marca.txt";
    final static String TABLA_CATEGORIA="Categoria.txt";

    public void CrearProducto() {
        util. clearConsole();
        System.out.println("<<<<<<<<<<<NUEVO PRODUCTO>>>>>>>>>>>>>");
        pTo=new ProductoTO();
        leerA=new LeerArchivo(TABLA_PRODUCTO);
        String idPro=generarId(leerA, numColum:0, prefijo:"p", iniPrefNex:1);
        pTo.setIdProducto(idPro);
        pTo.setIdNombre(leerT.leer(valor:"" ;: "nombre del producto"));
        mostrar Categoria();
        pTo.setIdCate(leerT.leer(valor:"" ;msg: "Seleccione de categoria"));
        mostrarMarca();
        pTo.setIdMarca(leerT.leer(valor:"" ;msg: "Seleccione de Marca"));
        pTo.setId(leerT.leer(valor:"" ;msg: "Seleccione de Marca"));
        pTo.setId(leerT.leer(valor:"" ;msg: "Seleccione de Marca"));
        pTo.setIdMarca(leerT.leer(valor:"" ;msg: "Seleccione de Marca"));

        public void mostrarMarca() {
            System.out.println("<<<<<<<<<<<<lista de MArca>>>>>>>>>>>");
            leerA=new LeerArchivo(TABLA_CATEGORIA)
            Object[][] dataM listarContenido(leerA);
            for (int i =0; 1 <dataM.length; i ++);

            println("");
            
        }
    }


}
