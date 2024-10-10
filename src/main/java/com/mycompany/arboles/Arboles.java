/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arboles;

/**
 *
 * @author willi
 */
public class Arboles {

    public static void main(String[] args) {
        
        Arbol arbolito = new Arbol();
        
        arbolito.Añadir(new Empleado("Willians", "HOmbre", 5, 2));
        arbolito.Añadir(new Empleado("Willians", "HOmbre", 4, 2));
        arbolito.Añadir(new Empleado("Willians", "HOmbre", 6, 2));
        arbolito.Añadir(new Empleado("Willians", "HOmbre", 7, 2));
        arbolito.Añadir(new Empleado("Willians", "HOmbre", 1, 2));
        
        arbolito.preOrden();
        
        
    }
}
