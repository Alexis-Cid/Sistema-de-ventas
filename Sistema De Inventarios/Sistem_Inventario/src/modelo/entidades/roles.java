package modelo.entidades;

public class roles {

    private int Id_Rol;
    private String Nombre_Rol;
    private String Descripcion;

    public int getId_Rol() {
        return Id_Rol;
    }

    public void setId_Rol(int Id_Rol) {
        this.Id_Rol = Id_Rol;
    }

    public String getNombre_Rol() {
        return Nombre_Rol;
    }

    public void setNombre_Rol(String Nombre_Rol) {
        this.Nombre_Rol = Nombre_Rol;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

}
