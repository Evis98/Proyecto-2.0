/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.cliente;

import logica.Cliente;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Eva
 */
public class Cliente_Modelo extends Observable{

    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o); 
        this.commit();
    }
    

    Cliente actual;
    List<Cliente> lista;

    public Cliente_Modelo() {
        actual = new Cliente();
        lista = new ArrayList<>();
    }

    public Cliente getCurrent() {
        return actual;
    }
    
    public void setCurrent(Cliente current) {
        this.actual = current;
    }

    public List<Cliente> getLista() {
        return lista;
    }

    public void setLista(List<Cliente> lista) {
        this.lista = lista;
    }

    public void commit(){
        this.setChanged();
        this.notifyObservers();        
    }
    
}