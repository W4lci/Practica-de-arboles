/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arboles;

/**
 *
 * @author willi
 */
public class Empleado {
    private String Nombre, Sexo;
    private int codigo;
    private double sueldo;

    public Empleado(String Nombre, String Sexo, int codigo, double sueldo) {
        this.Nombre = Nombre;
        this.Sexo = Sexo;
        this.codigo = codigo;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "Nombre=" + Nombre + ", Sexo=" + Sexo + ", codigo=" + codigo + ", sueldo=" + sueldo + '}';
    }
    
    
}
