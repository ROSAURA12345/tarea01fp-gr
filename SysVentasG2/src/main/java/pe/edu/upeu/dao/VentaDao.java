package pe.edu.upeu.dao;

import pe.edu.upeu.crud.AppCrud;
import pe.edu.upeu.modelo.VentaDetalleTO;
import pe.edu.upeu.modelo.VentaTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

public class VentaDao  extends AppCrud{
    LeerTeclado leerT=new LeerTeclado();
    UtilsX util=new UtilsX();
    LeerArchivo leerA;

    VentaTO vTo;
    VentaDetalleTO vdto;
    final static String TABLA_CLIENTE="cliente txt";
    final static String TABLA_PRODUCTO="producto txt";
    final static String TABLA_VENTA="venta txt";
    final static String TABLA_VENTADEDETALLE="VentaDeDetalle,txt";


    public void registrodeventaGeneral() {
        
    }
    public void CarritoVentas (VentaTO to) {
        
    }

    public String ValidarCliente(String dniruc) {
        leerA=new LeerArchivo(TABLA_CLIENTE);
        Object[][] dataC=buscarContenido(leerA, 0, dniruc);
        if (dataC ==null ||dataC.length==0) {
            new ClienteDao().crearCliente();

        }
        return dniruc;
        
    }
    public void mostrarProductos() {
        leerA=new LeerArchivo(TABLA_PRODUCTO);
        Object [][] dataP=listarContenido(leerA);
        for(int i=0; i< dataP.length; i++ ){
            System.out.print(dataP[i][0]+"="+dataP[i][1]+", ");
        
        }

    
    System.out.println("");
    }
     

    
}
