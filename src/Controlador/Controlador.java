/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.Modelo;
import Vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author pc
 */
public class Controlador implements ActionListener{
    
    private Vista objVista;
    private Modelo objModelo;

    public Controlador(Vista objVista, Modelo objModelo) {
        this.objVista = objVista;
        this.objModelo = objModelo;
        this.objVista.jb_calcular.addActionListener(this);
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== this.objVista.jb_calcular){
            metodoDolar();
            metodoEuro();
        }
    }
    
    public void iniciarVista(){
        objVista.setTitle("Conversor");
        objVista.setLocationRelativeTo(null);
        objVista.jft_dolares.setText(""+objModelo.getPesos());
        objVista.jft_euros.setText(""+objModelo.getPesos());   
    }
    
    public void metodoDolar(){
        objModelo.setPesos(Double.parseDouble(objVista.jft_pesos.getText()));
        objVista.jft_dolares.setText(""+objModelo.dolar());
    }
    
    public void metodoEuro(){
       objModelo.setPesos(Double.parseDouble(objVista.jft_pesos.getText()));
        objVista.jft_euros.setText(""+objModelo.euro());
    }
   
}
