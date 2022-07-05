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


    public void registroVentaGeneral() {
        util.clearConsole();
        System.out.println("*****************Registro de Ventas***************");
        vTo=new VentaTO();
        leerA=new LeerArchivo(TABLA_VENTA);
        String idVX=generarId(leerA, 0, "V", 1);
        vTo.setIdVenta(idVX);
        vTo.setDniruc(validarCliente(leerT.leer("", "Ingrese DNI/RUC cliente")));
        if (crearVenta(vTo)!=null) {
            System.out.println("Agregar Productos a carrito de venta");
            char continuar='N';
            do {
                System.out.println("--------------Agregar Productos-----------");                    
                    carritoVentas(vTo);
                continuar= leerT.leer("", "Desea Agregar mas Productos?S/N")
                                .toUpperCase()
                                .charAt(0);
            } while (continuar=='S');
        }
    }


    public VentaTO crearVenta(VentaTO to) {
        leerA=new LeerArchivo(TABLA_VENTA);
        agregarContenido(leerA, to);
        leerA=new LeerArchivo(TABLA_VENTA);
        Object[][] data=buscarContenido(leerA, 0, to.getIdVenta());
        if (data.length==1) {
            return to;
        }
        return null;
    }

    public VentaDetalleTO CarritoVentas (VentaTO to) {
        System.out.println();
        leerA=new LeerArchivo(TABLA_VENTADETALLE);
        vdTo=new VentaDetalleTO();
        String idDV=generarId(leerA, 0, "DV", 2);
        vdTo.setIdVentDet(idDV);
        vdTo.setIdVenta(to.getIdVenta());
        mostrarProductos();
        vdTo.setIdProducto(leerT.leer("", "Ingrese Id Producto"));
        vdTo.setCantidad(leerT.leer(0, "Ingrese Cantidad"));
        vdTo.setDescuento(0);
        leerA=new LeerArchivo(TABLA_PRODUCTO);
        Object[][] dataP=buscarContenido(leerA, 0, vdTo.getIdProducto());
        double pux=Double.parseDouble(String.valueOf(dataP[0][4]));
        vdTo.setPu(pux);
        vdTo.setSubtotal(vdTo.getCantidad()*vdTo.getPu());
        leerA=new LeerArchivo(TABLA_VENTADETALLE);
        agregarContenido(leerA, vdTo);
        leerA=new LeerArchivo(TABLA_VENTADETALLE);
        Object[][] dataX=buscarContenido(leerA, 0, idDV);
        if (dataX.length==1) {
            return vdTo;
        }
        return null;
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
