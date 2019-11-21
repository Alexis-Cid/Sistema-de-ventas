
package modelo;

public class distribuye 
{
    private String Codigo;
    private String CodigoProducto;
    private String CodigoProveedor;
    private double precio_compra;
    private int cantidad_comprada;

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getCodigoProducto() {
        return CodigoProducto;
    }

    public void setCodigoProducto(String CodigoProducto) {
        this.CodigoProducto = CodigoProducto;
    }

    public String getCodigoProveedor() {
        return CodigoProveedor;
    }

    public void setCodigoProveedor(String CodigoProveedor) {
        this.CodigoProveedor = CodigoProveedor;
    }

    public double getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(double precio_compra) {
        this.precio_compra = precio_compra;
    }

    public int getCantidad_comprada() {
        return cantidad_comprada;
    }

    public void setCantidad_comprada(int cantidad_comprada) {
        this.cantidad_comprada = cantidad_comprada;
    }
    
    
}
