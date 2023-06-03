package com.mycompany.transportedemercancias;

/**
 *
 * @author SOPORTE
 */
public class Conductor {
    
    int numeroIdentificacion;
    String nombre;
    int edad;
    int telefono;
    double sueldo;

    public Conductor(int numeroIdentificacion, String nombre, int edad, int telefono, double sueldo) {
        this.numeroIdentificacion = numeroIdentificacion;
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.sueldo = sueldo;
    }

    public int getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }
    
    
    
}
