/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arboles;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author willi
 */
public class Arbol {
    private NodoArbol raiz;
    private long Inicio_Ejecucion; 
    
    public Arbol (){
        this.raiz = null;
        this.Inicio_Ejecucion = System.nanoTime();
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
        
        preOrden(-1, raiz);
    }
    
    public void preOrden(int codigo){
        System.out.println("Comienza la busqueda: ");
        Inicio_Ejecucion = System.nanoTime();
        preOrden(codigo, raiz);

    }
    
    private void preOrden(int codigo, NodoArbol raiz){
        if (raiz == null){
            return;
        } 
        
        if (codigo == -1){
            System.out.println(raiz.getEmpleado());
        }
        ComprobarBusqueda(raiz, codigo);
        
        preOrden(codigo, raiz.getHijoIzq());
        preOrden(codigo, raiz.getHijoDer());

    }
    
    public void inOrden(){
        inOrden(-1, raiz);
    }
    
    public void inOrden(int codigo){
        inOrden(codigo, raiz);
        System.out.println("Comienza la busqueda: ");
        Inicio_Ejecucion = System.nanoTime();
        
    }
    
    private void inOrden(int codigo, NodoArbol raiz){
        if(raiz == null){
            return;
        }
        
        inOrden(codigo, raiz.getHijoIzq());
        if(codigo == -1){
            System.out.println(raiz.getEmpleado());
        }
        ComprobarBusqueda(raiz,codigo);
        inOrden(codigo, raiz.getHijoDer());
    
    }
    
    public void postOrden(){
        postOrden(-1, raiz);
    }
    
    public void postOrden(int codigo){
        postOrden(codigo, raiz);
        System.out.println("Comienza la busqueda: ");
        Inicio_Ejecucion = System.nanoTime();
    }
    
    private void postOrden(int codigo, NodoArbol raiz){
        if(raiz == null){
            return;
        }
        
        inOrden(codigo, raiz.getHijoIzq());
        inOrden(codigo, raiz.getHijoDer());
        if(codigo == -1){
            System.out.println(raiz.getEmpleado());
        }
        ComprobarBusqueda(raiz,codigo);
    }
    
    public void Anchura(){
        Anchura(-1, raiz);
    }
    
    public void Anchura(int codigo){
        Anchura(codigo, raiz);
    }
    
    private void Anchura(int codigo, NodoArbol raiz){
        if(raiz == null){
            return; 
        }
        
        Queue<NodoArbol> cola = new LinkedList<>(); 
        cola.add(raiz);
        
        while(!cola.isEmpty()){
            NodoArbol nodo = cola.poll();
            if(codigo == -1){
                System.out.println(nodo.getEmpleado());
            } else {
                ComprobarBusqueda(nodo, codigo);
            }
            
            if(nodo.getHijoIzq() != null){
                cola.add(nodo.getHijoIzq());
            }
            if(nodo.getHijoDer() != null){
                cola.add(nodo.getHijoDer());
            }
        }
        
    }
    
    private void ComprobarBusqueda(NodoArbol empleado, int codigo){

        if (empleado.getEmpleado().getCodigo() == codigo){
            System.out.println("Empleado encontrado: ");
            final long TiempoFinal = System.nanoTime();
            System.out.println(empleado.getEmpleado());
            double tiempo = (double)(TiempoFinal - Inicio_Ejecucion)/1000000;
            System.out.println("Encontrado en: " + tiempo + "ms" );
        }
    
    }
    
    
}
 