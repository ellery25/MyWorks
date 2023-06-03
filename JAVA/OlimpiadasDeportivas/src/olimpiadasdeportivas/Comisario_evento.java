/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olimpiadasdeportivas;

import java.util.ArrayList;


public class Comisario_evento {
    
    public ArrayList<Comisario> Lcomisario;
    public ArrayList<Evento> Levento;

    public Comisario_evento(ArrayList<Comisario> Lcomisario, ArrayList<Evento> Levento) {
        this.Lcomisario = Lcomisario;
        this.Levento = Levento;
    }

    public ArrayList<Comisario> getLcomisario() {
        return Lcomisario;
    }

    public void setLcomisario(ArrayList<Comisario> Lcomisario) {
        this.Lcomisario = Lcomisario;
    }

    public ArrayList<Evento> getLevento() {
        return Levento;
    }

    public void setLevento(ArrayList<Evento> Levento) {
        this.Levento = Levento;
    }
    
    
    
}
