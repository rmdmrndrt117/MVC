package controlador;

import modelo.ClienteModelo;
import vista.ClienteVista;

public class ClienteControlador {

    private ClienteModelo climo;
    private ClienteVista clivis;

    public ClienteControlador(){
        climo=new ClienteModelo();
        clivis=new ClienteVista();
    }


    public void interacciones(){

        while(true){
            try{
                clivis.capturaDatos();
                climo.setId((Integer.parseInt(clivis.getTxtid())));

                if(clivis.getTxtNombre().isBlank()){
                    throw new Exception(("El nombre no puede estar vacion"));
                }
                else{
                    climo.setNombre((clivis.getTxtNombre()));
                }

                if(clivis.getTxtApellidos().isBlank()){
                    throw new Exception(("El apellido no puede estar vacion"));
                }
                else{
                    climo.setApellidos((clivis.getTxtNombre()));
                }
                clivis.mostrarDtaos(climo.toString());
            }
            catch(NumberFormatException exception){
                clivis.mostrarErrores("El id solo acpeta numeros");

            } catch (Exception e) {
                e.printStackTrace();
                clivis.mostrarErrores(e.getMessage());
            }
        }
    }
}
