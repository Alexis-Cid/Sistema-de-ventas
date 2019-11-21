
package modelo;

public class detalle_proveedor 
{
    private String Codigo_Proveedor;
    private String nombre_probveedor;
    private String nombre_producto;
    private String Categoria_producto;
    private double precio_compra;

    public String getCodigo_Proveedor() {
        return Codigo_Proveedor;
    }

    public void setCodigo_Proveedor(String Codigo_Proveedor) {
        this.Codigo_Proveedor = Codigo_Proveedor;
    }

    public String getNombre_probveedor() {
        return nombre_probveedor;
    }

    public void setNombre_probveedor(String nombre_probveedor) {
        this.nombre_probveedor = nombre_probveedor;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getCategoria_producto() {
        return Categoria_producto;
    }

    public void setCategoria_producto(String Categoria_producto) {
        this.Categoria_producto = Categoria_producto;
    }

    public double getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(double precio_compra) {
        this.precio_compra = precio_compra;
    }
    
    
}
