/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor_de_monedas;
import Modelo.Modelo;
import Controlador.Controlador;
import Vista.Vista;

/**
 *
 * @author pc
 */
public class Conversor_De_Monedas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Modelo objModelo = new Modelo();
        Vista objVista = new Vista();
        Controlador controlador = new Controlador(objVista, objModelo);
        controlador.iniciarVista();
        objVista.setVisible(true);
    }
    
}
