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
public class Unideportivo extends Complejo {
    
    public Deporte Deporte;

    public Unideportivo(Deporte Deporte, int Nsede, int Ncomplejo, olimpiadasdeportivas.Jefe Jefe, String Localizacion, double AreaO, ArrayList<olimpiadasdeportivas.Evento> Evento, Mantenimiento mantenimiento) {
        super(Nsede, Ncomplejo, Jefe, Localizacion, AreaO, Evento, mantenimiento);
        this.Deporte = Deporte;
    }

    public Mantenimiento getMantenimiento() {
        return mantenimiento;
    }

    public void setMantenimiento(Mantenimiento mantenimiento) {
        this.mantenimiento = mantenimiento;
    }

    
            

    public Deporte getDeporte() {
        return Deporte;
    }

    public void setDeporte(Deporte Deporte) {
        this.Deporte = Deporte;
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

    public olimpiadasdeportivas.Jefe getJefe() {
        return Jefe;
    }

    public void setJefe(olimpiadasdeportivas.Jefe Jefe) {
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

    public ArrayList<olimpiadasdeportivas.Evento> getEvento() {
        return Evento;
    }

    public void setEvento(ArrayList<olimpiadasdeportivas.Evento> Evento) {
        this.Evento = Evento;
    }
    
    
    
}
