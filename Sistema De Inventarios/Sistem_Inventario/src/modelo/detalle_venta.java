package modelo;

public class detalle_venta {

    private String IdVenta;
    private String cantidad;
    private String PodigoProducto;
    private String PrecioVenta;
    private String MontoTotal;

    public String getIdVenta() {
        return IdVenta;
    }

    public void setIdVenta(String IdVenta) {
        this.IdVenta = IdVenta;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPodigoProducto() {
        return PodigoProducto;
    }

    public void setPodigoProducto(String PodigoProducto) {
        this.PodigoProducto = PodigoProducto;
    }

    public String getPrecioVenta() {
        return PrecioVenta;
    }

    public void setPrecioVenta(String PrecioVenta) {
        this.PrecioVenta = PrecioVenta;
    }

    public String getMontoTotal() {
        return MontoTotal;
    }

    public void setMontoTotal(String MontoTotal) {
        this.MontoTotal = MontoTotal;
    }

}
