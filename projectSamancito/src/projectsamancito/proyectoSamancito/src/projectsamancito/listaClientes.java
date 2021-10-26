/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectsamancito;

/**
 *
 * @author mkferrerteran
 */
public class listaClientes {
    private nodoClientes inicio;
    private int size;
    
    public void lista(){
        inicio = null;
        size = 0;
    }

    public nodoClientes getInicio() {
        return inicio;
    }

    public void setInicio(nodoClientes inicio) {
        this.inicio = inicio;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    
    public boolean itsEmpty(){
        return inicio == null;
    }
}
