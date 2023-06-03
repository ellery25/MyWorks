
package olimpiadasdeportivas;

import java.util.ArrayList;

    public class Sede {
    
    protected int Nsede;
    protected int Ncomplejo;
    protected double Presupuesto;
    protected ArrayList<Unideportivo> Unideportivo;
    protected ArrayList<Polideportivo> Polideportivo;

    public Sede(int Nsede, int Ncomplejo, double Presupuesto, ArrayList<Unideportivo> Unideportivo, ArrayList<Polideportivo> Polideportivo) {
        this.Nsede = Nsede;
        this.Ncomplejo = Ncomplejo;
        this.Presupuesto = Presupuesto;
        this.Unideportivo = Unideportivo;
        this.Polideportivo = Polideportivo;
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

    public double getPresupuesto() {
        return Presupuesto;
    }

    public void setPresupuesto(double Presupuesto) {
        this.Presupuesto = Presupuesto;
    }

    public ArrayList<Unideportivo> getUnideportivo() {
        return Unideportivo;
    }

    public void setUnideportivo(ArrayList<Unideportivo> Unideportivo) {
        this.Unideportivo = Unideportivo;
    }

    public ArrayList<Polideportivo> getPolideportivo() {
        return Polideportivo;
    }

    public void setPolideportivo(ArrayList<Polideportivo> Polideportivo) {
        this.Polideportivo = Polideportivo;
    }
    
    
}
