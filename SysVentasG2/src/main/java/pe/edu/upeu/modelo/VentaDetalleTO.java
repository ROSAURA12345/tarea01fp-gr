package pe.edu.upeu.modelo;

import lombok.Data;

@Data

public class VentaDetalleTO {
    public String idVentaDat,idVenta,idProducto;
    public double descuento,pu,cantidad,subtotal;
    
}
