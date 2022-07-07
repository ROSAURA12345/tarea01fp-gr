package pe.edu.upeu.dao;

import pe.edu.upeu.crud.AppCrud;
import pe.edu.upeu.modelo.ProductoTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

public class ProductoDao extends AppCrud{
    LeerTeclado leerT=new LeerTeclado();
    LeerArchivo leerA;
    UtilsX util=new UtilsX();
    ProductoTO pTo;
    final static String TABLA_PRODUCTO="Producto.txt";
    final static String TABLA_MARCA="Marca.txt";
    final static String TABLA_CATEGORIA="Categoria.txt";

    public void crearProducto() {
        util.clearConsole();
        System.out.println("***************Crear Nuevo Producto*****************");
        pTo=new ProductoTO();
        leerA=new LeerArchivo(TABLA_PRODUCTO);
        String idPro=generarId(leerA, 0, "P", 1);
        pTo.setIdProducto(idPro);
        pTo.setNombre(leerT.leer("", "Nombre producto"));
        mostrarCategoria();
        pTo.setIdCate(leerT.leer("", "Seleccione ID Categoria"));
        mostrarMarca();
        pTo.setIdMarca(leerT.leer("", "Seleccione Id Marca"));
        pTo.setPu(leerT.leer(0.0, "Ingrese Precio Unitario"));
        pTo.setUtilidad(leerT.leer(0.0, "Ingrese la Utilidad"));
        pTo.setStock(leerT.leer(0, "Ingrese Cantidad"));        
        leerA=new LeerArchivo(TABLA_PRODUCTO);
        agregarContenido(leerA, pTo);
    }
    public void mostrarMarca() {
        System.out.println("******Lista Marcas*******");
        leerA=new LeerArchivo(TABLA_MARCA);
        Object[][] dataM=listarContenido(leerA);
        for (int i = 0; i < dataM.length; i++) {
            System.out.print(dataM[i][0]+"="+dataM[i][1]+", ");
        }
        System.out.println("");
    }
    public void mostrarCategoria() {
        System.out.println("******Lista Categorias*******");
        leerA=new LeerArchivo(TABLA_CATEGORIA);
        Object[][] dataM=listarContenido(leerA);
        for (int i = 0; i < dataM.length; i++) {
            System.out.print(dataM[i][0]+"="+dataM[i][1]+", ");
        }
        System.out.println("");        
    }

    public void reportarProductos() {
        leerA=new LeerArchivo(TABLA_PRODUCTO); 
        Object[][] data=listarContenido(leerA);
        System.out.printf("%20s %10s %10s %5s %n","Nombre","Categoria",
         "Marca", "Precio");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%20s %10s %10s %.2f %n", data[i][1], data[i][2], 
            data[i][3], Double.parseDouble(String.valueOf(data[i][4]))+
            Double.parseDouble(String.valueOf(data[i][5])));
        }

    }
}
