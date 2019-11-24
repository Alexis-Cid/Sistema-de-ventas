package modelo.entidades;

public class ModeloProveedores {

    private String Codigo;
    private String Nombre;
    private String Apellido_Paterno;
    private String Apellido_Materno;
    private String Empresa;
    private String Telefono;
    private String Direccion;

    public ModeloProveedores(String Codigo, String Nombre,
            String Apellido_Paterno, String Apellido_Materno,
            String Empresa, String Telefono, String Direccion) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Apellido_Paterno = Apellido_Paterno;
        this.Apellido_Materno = Apellido_Materno;
        this.Empresa = Empresa;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
    }

    public ModeloProveedores() {
        Codigo = "";
        Nombre = "";
        Apellido_Paterno = "";
        Apellido_Materno = "";
        Empresa = "";
        Telefono = "";
        Direccion = "";
    }

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

    public String getApellido_Paterno() {
        return Apellido_Paterno;
    }

    public void setApellido_Paterno(String Apellido_Paterno) {
        this.Apellido_Paterno = Apellido_Paterno;
    }

    public String getApellido_Materno() {
        return Apellido_Materno;
    }

    public void setApellido_Materno(String Apellido_Materno) {
        this.Apellido_Materno = Apellido_Materno;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
}
