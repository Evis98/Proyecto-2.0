/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.ArrayList;
import java.util.List;
import logica.Producto;

/**
 *
 * @author Ivan
 */
public class Datos {
    List<Producto> productos;    

    public Datos() {
        productos = new ArrayList<>();        
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setClientes(List<Producto> productos) {
        this.productos = productos;
    }
}
