/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import java.util.*;

/**
 *
 * @author salacomputocentro.ba
 */
public class cliente extends usuario {
    protected int Ncuenta;
    protected double Scuenta;

    public cliente(int Ncuenta, double Scuenta, int Cedula, String Nombre, String Apellido) {
        super(Cedula, Nombre, Apellido);
        this.Ncuenta = Ncuenta;
        this.Scuenta = Scuenta;
    }

    public int getNcuenta() {
        return Ncuenta;
    }

    public double getScuenta() {
        return Scuenta;
    }

    public void setScuenta(double Scuenta) {
        this.Scuenta = Scuenta;
    }
       
}
