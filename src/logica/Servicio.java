/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import Datos.Datos;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ivan
 */
public class Servicio {
    private static Servicio theInstance;
    public static Servicio instance(){
        if (theInstance==null){ 
            theInstance=new Servicio();
        }
        return theInstance;
    }
    
    private Datos datos;
    
    public Servicio() {
       datos =  new Datos();
    }

    public List<Producto> getProductos() {
        return datos.getProductos();
    }

    public void add(Producto o){
        datos.getProductos().add(o);
    }

    public List<Producto> buscar(Producto pro){
        List<Producto> result = new ArrayList<>();
        for(Producto p:datos.getProductos()) {if (p.getDetalle().contains(pro.getDetalle())) result.add(p);};
        return result;
    } 
}
