/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.empresa;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import logica.Empresa;
/**
 *
 * @author Daniel
 */
public class Empresa_Modelo  extends Observable{
    
    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o); 
        this.commit();
    }
    
     Empresa actual;
    List<Empresa> lista;

    public Empresa_Modelo() {
          actual = new Empresa();
        lista = new ArrayList<>();
    }

    public Empresa_Modelo(Empresa actual, List<Empresa> lista) {
        this.actual = actual;
        this.lista = lista;
    }
    
       public Empresa getCurrent() {
        return actual;
    }
    
    public void setCurrent(Empresa current) {
        this.actual = current;
    }

    public List<Empresa> getLista() {
        return lista;
    }

    public void setLista(List<Empresa> lista) {
        this.lista = lista;
    }
    
    
      public void commit(){
        this.setChanged();
        this.notifyObservers();        
    }
    
}
