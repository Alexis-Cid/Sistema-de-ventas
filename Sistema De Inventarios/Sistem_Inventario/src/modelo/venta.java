
package modelo;

public class venta 
{
    private String IdVenta;
    private String CodigoProducto;
    private String RFC_Cliente;
    private int Fecha_Compra;
    private String Precio_Venta;

    public String getIdVenta() {
        return IdVenta;
    }

    public void setIdVenta(String IdVenta) {
        this.IdVenta = IdVenta;
    }

    public String getCodigoProducto() {
        return CodigoProducto;
    }

    public void setCodigoProducto(String CodigoProducto) {
        this.CodigoProducto = CodigoProducto;
    }

    public String getRFC_Cliente() {
        return RFC_Cliente;
    }

    public void setRFC_Cliente(String RFC_Cliente) {
        this.RFC_Cliente = RFC_Cliente;
    }

    public int getFecha_Compra() {
        return Fecha_Compra;
    }

    public void setFecha_Compra(int Fecha_Compra) {
        this.Fecha_Compra = Fecha_Compra;
    }

    public String getPrecio_Venta() {
        return Precio_Venta;
    }

    public void setPrecio_Venta(String Precio_Venta) {
        this.Precio_Venta = Precio_Venta;
    }
    
    
}
