/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author pc
 */
public class Modelo {
    
    private double pesos;
    private NumberFormat df = new DecimalFormat ("#0.00");

    public double getPesos() {
        return pesos;
    }

    public void setPesos(double pesos) {
        this.pesos = pesos;
    }
    
    public String dolar (){
        return df.format(pesos * 0.00033);
    }
    
    public String euro (){
        return df.format(pesos * 0.00028);
    }
    
    
}
