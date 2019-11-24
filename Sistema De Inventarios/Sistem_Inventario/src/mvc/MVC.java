package mvc;

import vista.LoginFrm;
import controlador.FuncionesLogin;
import modelo.entidades.Usuarios;
import modelo.sql.UsuariosSQL;

public class MVC {

    public static void main(String args[]) {
        LoginFrm princ = new LoginFrm();
        Usuarios modelo = new Usuarios();
        UsuariosSQL sql = new UsuariosSQL();
        
        FuncionesLogin ctrl = new FuncionesLogin(princ, modelo, sql);
    }
}
