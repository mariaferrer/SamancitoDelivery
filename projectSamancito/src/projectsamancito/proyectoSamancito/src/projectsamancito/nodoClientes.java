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
public class nodoClientes {
    private String nombre;
    private String apellido;
    private int cedula;
    private Object direccion;
    private nodoClientes siguiente;
    
    public void nodolista(Object elemento, nodoClientes nodo){
        this.direccion = direccion;
        this.siguiente = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public Object getDireccion() {
        return direccion;
    }

    public void setDireccion(Object direccion) {
        this.direccion = direccion;
    }

    public nodoClientes getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodoClientes siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
