
package modelo;

public class productos_precio 
{
    private String codigo_producto;
    private String nombre_producto;
    private String categoria_producto;
    private int Stock_del_producto;
    private String Precio_Menudeo;
    private String Precio_Mayoreo;

    public String getCodigo_producto() {
        return codigo_producto;
    }

    public void setCodigo_producto(String codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getCategoria_producto() {
        return categoria_producto;
    }

    public void setCategoria_producto(String categoria_producto) {
        this.categoria_producto = categoria_producto;
    }

    public int getStock_del_producto() {
        return Stock_del_producto;
    }

    public void setStock_del_producto(int Stock_del_producto) {
        this.Stock_del_producto = Stock_del_producto;
    }

    public String getPrecio_Menudeo() {
        return Precio_Menudeo;
    }

    public void setPrecio_Menudeo(String Precio_Menudeo) {
        this.Precio_Menudeo = Precio_Menudeo;
    }

    public String getPrecio_Mayoreo() {
        return Precio_Mayoreo;
    }

    public void setPrecio_Mayoreo(String Precio_Mayoreo) {
        this.Precio_Mayoreo = Precio_Mayoreo;
    }
    
    
}
