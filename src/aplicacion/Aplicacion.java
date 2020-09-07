/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

/**
 *
 * @author PC
 */
public class Aplicacion {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        presentacion.aplicacion.Aplicacion_Modelo aplicacion_Modelo;
        presentacion.aplicacion.Aplicacion_View aplicacion_View;
        presentacion.aplicacion.Aplicacion_Control aplicacion_Control;
    
        aplicacion_Modelo =  new presentacion.aplicacion.Aplicacion_Modelo();
        aplicacion_View = new presentacion.aplicacion.Aplicacion_View();
        aplicacion_Control = new presentacion.aplicacion.Aplicacion_Control(aplicacion_Modelo,aplicacion_View);
        
        aplicacion_View.setVisible(true);
    }   
    
}
