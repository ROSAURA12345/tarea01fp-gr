package pe.edu.upeu.modelo;

import lombok.Data;

@Data
public class VentaTO {
    //IdVenta	dniruc	preciobase	igv	precioTotal
    public String idVenta,dniruc, fecha;
    public double preciobase,igv,precioTotal;

}
