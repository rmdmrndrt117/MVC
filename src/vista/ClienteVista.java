package vista;

import java.util.Scanner;

public class ClienteVista {
    private String txtid;
    private String txtNombre;
    private String txtApellidos;


    public ClienteVista(String txtid, String txtNombre, String txtApellidos) {
        this.txtid = txtid;
        this.txtNombre = txtNombre;
        this.txtApellidos = txtApellidos;
    }

    public ClienteVista() {
    }

    public String getTxtid() {
        return txtid;
    }

    public void setTxtid(String txtid) {
        this.txtid = txtid;
    }

    public String getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(String txtNombre) {
        this.txtNombre = txtNombre;
    }

    public String getTxtApellidos() {
        return txtApellidos;
    }

    public void setTxtApellidos(String txtApellidos) {
        this.txtApellidos = txtApellidos;
    }

    @Override
    public String toString() {
        return "ClienteVista{" +
                "txtid='" + txtid + '\'' +
                ", txtNombre='" + txtNombre + '\'' +
                ", txtApellidos='" + txtApellidos + '\'' +
                '}';
    }
    public void capturaDatos(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba id");
        setTxtid((scanner.nextLine()));
        System.out.println("Escriba nombre");
        setTxtNombre((scanner.nextLine()));
        System.out.println("Escriba apelldoss");
        setTxtApellidos((scanner.nextLine()));

    }
    public void mostrarDtaos(String datos){
        System.out.println(datos);
    }
    public void mostrarErrores(String ex){
        System.out.println(ex);
    }

}

