/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olimpiadasdeportivas;

import java.util.ArrayList;

/**
 *
 * @author salacomputocentro.ba
 */
abstract public class Complejo {
    
    public int Nsede;
    public int Ncomplejo;
    public Jefe Jefe;
    public String Localizacion;
    public double AreaO;
    public ArrayList<Evento> Evento;
    public Mantenimiento mantenimiento;

    public Complejo(int Nsede, int Ncomplejo, Jefe Jefe, String Localizacion, double AreaO, ArrayList<Evento> Evento, Mantenimiento mantenimiento) {
        this.Nsede = Nsede;
        this.Ncomplejo = Ncomplejo;
        this.Jefe = Jefe;
        this.Localizacion = Localizacion;
        this.AreaO = AreaO;
        this.Evento = Evento;
        this.mantenimiento = mantenimiento;
    }

    public Mantenimiento getMantenimiento() {
        return mantenimiento;
    }

    public void setMantenimiento(Mantenimiento mantenimiento) {
        this.mantenimiento = mantenimiento;
    }    

    public int getNsede() {
        return Nsede;
    }

    public void setNsede(int Nsede) {
        this.Nsede = Nsede;
    }


    public int getNcomplejo() {
        return Ncomplejo;
    }

    public void setNcomplejo(int Ncomplejo) {
        this.Ncomplejo = Ncomplejo;
    }

    public Jefe getJefe() {
        return Jefe;
    }

    public void setJefe(Jefe Jefe) {
        this.Jefe = Jefe;
    }

    public String getLocalizacion() {
        return Localizacion;
    }

    public void setLocalizacion(String Localizacion) {
        this.Localizacion = Localizacion;
    }

    public double getAreaO() {
        return AreaO;
    }

    public void setAreaO(double AreaO) {
        this.AreaO = AreaO;
    }

    public ArrayList<Evento> getEvento() {
        return Evento;
    }

    public void setEvento(ArrayList<Evento> Evento) {
        this.Evento = Evento;
    }
    
    
    
}
