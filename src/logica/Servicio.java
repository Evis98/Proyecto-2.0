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
     public List<Cliente> getClientes() {
        return datos.getClientes();
    }
     
     public List<Empresa> getEmpresas() {
        return datos.getEmpresas();
    }

    public void add(Producto o){
        datos.getProductos().add(o);
    }
    
    public void add(Empresa o){
        datos.getEmpresas().add(o);
    }
    
    
     public void add(Cliente c){
        datos.getClientes().add(c);
    } 

    public List<Producto> buscar(Producto pro){
        List<Producto> result = new ArrayList<>();
        for(Producto p:datos.getProductos()) {if (p.getDetalle().contains(pro.getDetalle())) result.add(p);};
        return result;
    } 
    public List<Cliente> buscar(Cliente cli){
        List<Cliente> result = new ArrayList<>();
        for(Cliente c:datos.getClientes()) {if (c.getId().contains(cli.getId())) result.add(c);};
        return result;
    } 
    
      public List<Empresa> buscar(Empresa emp){
        List<Empresa> result = new ArrayList<>();
        for(Empresa c:datos.getEmpresas()) {if (c.getId().contains(emp.getNombreComercial())) result.add(c);};
        return result;
    } 
}
