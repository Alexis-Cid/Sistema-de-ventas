package modelo.entidades;

public class ModeloEmpleados {

    private int Codigo;
    private String Nombre;
    private String Apellido_Paterno;
    private String Apellido_Materno;
    private String Direccion;
    private String Nacionalidad;
    private String Fecha_Nacimiento;
    private String sexo;
    private String telefono;

    public ModeloEmpleados(int Codigo, String Nombre, String Apellido_Paterno,
            String Apellido_Materno, String Direccion, String Nacionalidad, String Fecha_Nacimiento, String sexo, String telefono) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Apellido_Paterno = Apellido_Paterno;
        this.Apellido_Materno = Apellido_Materno;
        this.Direccion = Direccion;
        this.Nacionalidad = Nacionalidad;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
        this.sexo = sexo;
        this.telefono = telefono;
    }

    public ModeloEmpleados(int Codigo, String Nombre, String Apellido_Paterno, String Apellido_Materno,
            String Direccion, String Nacionalidad, String sexo, String telefono) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Apellido_Paterno = Apellido_Paterno;
        this.Apellido_Materno = Apellido_Materno;
        this.Direccion = Direccion;
        this.Nacionalidad = Nacionalidad;
        this.sexo = sexo;
        this.telefono = telefono;
    }

    public ModeloEmpleados() {
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
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

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public String getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(String Fecha_Nacimiento) {
        this.Fecha_Nacimiento = Fecha_Nacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
