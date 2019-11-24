package modelo.entidades;

public class Usuarios {

    private int Id_Usuario;
    private String usuario;
    private String nombre_usuario;
    private String password;
    private String perfil;
    private int estado;
    
    public Usuarios(){}

    public Usuarios(int Id_Usuario, String nombre_usuario, String usuario, String perfil) {
        this.Id_Usuario = Id_Usuario;
        this.nombre_usuario = nombre_usuario;
        this.usuario = usuario;
        this.perfil = perfil;
    }

    public Usuarios(int Id_Usuario, String usuario, 
            String nombre_usuario, String password, String perfil) {
        this.Id_Usuario = Id_Usuario;
        this.usuario = usuario;
        this.nombre_usuario = nombre_usuario;
        this.password = password;
        this.perfil = perfil;
    }
    
    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public int getId_Usuario() {
        return Id_Usuario;
    }

    public void setId_Usuario(int Id_Usuario) {
        this.Id_Usuario = Id_Usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
