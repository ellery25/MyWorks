/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olimpiadasdeportivas;

import java.util.ArrayList;


public class Evento {
    
    public String NameEvento;
    public int Ncomisarios;
    public int Nparticipantes;
    public int Duracion;
    public String Fecha;
    public ArrayList<Equipamiento> Lequipamiento;

    public Evento(String NameEvento, int Ncomisarios, int Nparticipantes, int Duracion, String Fecha, ArrayList<Equipamiento> Lequipamiento) {
        this.NameEvento = NameEvento;
        this.Ncomisarios = Ncomisarios;
        this.Nparticipantes = Nparticipantes;
        this.Duracion = Duracion;
        this.Fecha = Fecha;
        this.Lequipamiento = Lequipamiento;
    }

    public String getNameEvento() {
        return NameEvento;
    }

    public void setNameEvento(String NameEvento) {
        this.NameEvento = NameEvento;
    }  

    public int getNcomisarios() {
        return Ncomisarios;
    }

    public void setNcomisarios(int Ncomisarios) {
        this.Ncomisarios = Ncomisarios;
    }

    public int getNparticipantes() {
        return Nparticipantes;
    }

    public void setNparticipantes(int Nparticipantes) {
        this.Nparticipantes = Nparticipantes;
    }

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(int Duracion) {
        this.Duracion = Duracion;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public ArrayList<Equipamiento> getLequipamiento() {
        return Lequipamiento;
    }

    public void setLequipamiento(ArrayList<Equipamiento> Lequipamiento) {
        this.Lequipamiento = Lequipamiento;
    }

    
    
    
    
}
