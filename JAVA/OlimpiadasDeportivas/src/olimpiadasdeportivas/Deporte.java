/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olimpiadasdeportivas;

/**
 *
 * @author salacomputocentro.ba
 */
public class Deporte {
    
    public String Deporte;
    public int Ndeporte;

    public Deporte(String Deporte, int Ndeporte) {
        this.Deporte = Deporte;
        this.Ndeporte = Ndeporte;
    }

    public String getDeporte() {
        return Deporte;
    }

    public void setDeporte(String Deporte) {
        this.Deporte = Deporte;
    }

    public int getNdeporte() {
        return Ndeporte;
    }

    public void setNdeporte(int Ndeporte) {
        this.Ndeporte = Ndeporte;
    }

    
    
}
