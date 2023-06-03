/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pootaller1;

/**
 *
 * @author HOME
 */
public class Productos {
    
    int codigo;
    int Pu;
    String descripcion;

    public Productos(int codigo, int Pu, String descripción) {
        this.codigo = codigo;
        this.Pu = Pu;
        this.descripcion = descripción;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getPu() {
        return Pu;
    }

    public String getDescripción() {
        return descripcion;
    }
    
}
