/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author HOME
 */
public class Inversion {
    
    int id_inversion;
    float monto;
    String fecha;

    public Inversion(int id_inversion, float monto, String fecha) {
        this.id_inversion = id_inversion;
        this.monto = monto;
        this.fecha = fecha;
    }

    public int getId_inversion() {
        return id_inversion;
    }

    public void setId_inversion(int id_inversion) {
        this.id_inversion = id_inversion;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
}
