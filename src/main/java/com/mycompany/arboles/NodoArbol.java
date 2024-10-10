/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arboles;

/**
 *
 * @author willi
 */
public class NodoArbol {
    
    private NodoArbol HijoIzq, HijoDer;
    private Empleado empleado;
    
    public NodoArbol(Empleado empleado){
        HijoIzq = null;
        HijoDer = null;
        this.empleado = empleado;
    }

    public NodoArbol getHijoIzq() {
        return HijoIzq;
    }

    public void setHijoIzq(NodoArbol HijoIzq) {
        this.HijoIzq = HijoIzq;
    }

    public NodoArbol getHijoDer() {
        return HijoDer;
    }

    public void setHijoDer(NodoArbol HijoDer) {
        this.HijoDer = HijoDer;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    

}
