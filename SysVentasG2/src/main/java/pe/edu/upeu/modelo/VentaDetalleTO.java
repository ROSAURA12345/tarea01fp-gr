package pe.edu.upeu.modelo;

import lombok.Data;

@Data
public class VentaDetalleTO {    
    public String idVentDet, idVenta, idProducto;
    public double descuento, pu, cantidad, subtotal;
}
