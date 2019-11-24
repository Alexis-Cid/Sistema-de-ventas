package modelo.entidades;

/**
 *
 *
 *
 */
public class ModeloClientes {

    private String nom;
    private String apP;
    private String apM;
    private String numT;
    private String direccion;
    private String rfc;

    public ModeloClientes(String nom, String apP, String apM, String numT, String direccion, String rfc) {
        this.nom = nom;
        this.apP = apP;
        this.apM = apM;
        this.numT = numT;
        this.direccion = direccion;
        this.rfc = rfc;
    }

    public ModeloClientes(String nom, String numT, String direccion, String rfc) {
        this.nom = nom;
        this.apP = apP;
        this.apM = apM;
        this.numT = numT;
        this.direccion = direccion;
        this.rfc = rfc;
    }

    public ModeloClientes() {
        this.nom = "";
        this.apP = "";
        this.apM = "";
        this.numT = "";
        this.direccion = "";
        this.rfc = "";
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApP() {
        return apP;
    }

    public void setApP(String apP) {
        this.apP = apP;
    }

    public String getApM() {
        return apM;
    }

    public void setApM(String apM) {
        this.apM = apM;
    }

    public String getNumT() {
        return numT;
    }

    public void setNumT(String numT) {
        this.numT = numT;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
}
