/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pootaller1;

/**
 *
 * @author HOME
 */
public class Ventas {
    
    String fecha;
    int nVendedor;
    int cProducto;
    int cVendida;
    String mPago;

    public Ventas(String fecha, int nVendedor, int cProducto, int cVendida, String mPago) {
        this.fecha = fecha;
        this.nVendedor = nVendedor;
        this.cProducto = cProducto;
        this.cVendida = cVendida;
        this.mPago = mPago;
    }

    public String getFecha() {
        return fecha;
    }

    public int getnVendedor() {
        return nVendedor;
    }

    public int getcProducto() {
        return cProducto;
    }

    public int getcVendida() {
        return cVendida;
    }

    public String getmPago() {
        return mPago;
    }
}
