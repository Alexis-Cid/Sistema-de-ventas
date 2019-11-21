
package modelo;

public class productos 
{
   private String Codigo;
   private String Nombre;
   private int Stock;
   private int Stock_Minimo;
   private String Categoria;
   private String Fecha_Registro;

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public int getStock_Minimo() {
        return Stock_Minimo;
    }

    public void setStock_Minimo(int Stock_Minimo) {
        this.Stock_Minimo = Stock_Minimo;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getFecha_Registro() {
        return Fecha_Registro;
    }

    public void setFecha_Registro(String Fecha_Registro) {
        this.Fecha_Registro = Fecha_Registro;
    }
   
   
}