/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arboles;

/**
 *
 * @author willi
 */
public class Arbol {
    private NodoArbol raiz;
    
    public Arbol (){
        this.raiz = null;
    }
    
    public boolean Vacio(){
        return raiz == null;
    }
    
    public void Añadir(Empleado datos){
        NodoArbol nuevo = new NodoArbol(datos);
        if(raiz == null){
            raiz = nuevo;
        } 
        Insertar(nuevo, raiz);
        
    }
    
    private void Insertar(NodoArbol dato, NodoArbol raiz){
        int codigoDato = dato.getEmpleado().getCodigo();
        int codigoRaiz = raiz.getEmpleado().getCodigo();
        if(codigoDato > codigoRaiz){
            if(raiz.getHijoDer() == null){
                raiz.setHijoDer(dato); 
            }else{
                Insertar(dato, raiz.getHijoDer());
            }
        } else if(codigoDato < codigoRaiz){
            
            if(raiz.getHijoIzq() == null){
                raiz.setHijoIzq(dato);
            }else{
                Insertar(dato, raiz.getHijoIzq());
            }
        
            
        } else {
            System.out.println("El codigo ya existe!");   
        }
    
    }
    
    public void preOrden(){
        preOrden(raiz);
    }
    
    private void preOrden(NodoArbol raiz){
        if (raiz == null){
            return;
        } 
        
        System.out.println(raiz.getEmpleado());
        
        preOrden(raiz.getHijoIzq());
        preOrden(raiz.getHijoDer());
        
        
        
        
        
    }
    
}
 