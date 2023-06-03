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
public class Mantenimiento {
    
    public ArrayList<Equipamiento> Lmantenimiento;

    public Mantenimiento(ArrayList<Equipamiento> Lmantenimiento) {
        this.Lmantenimiento = Lmantenimiento;
    }

    public ArrayList<Equipamiento> getLmantenimiento() {
        return Lmantenimiento;
    }

    public void setLmantenimiento(ArrayList<Equipamiento> Lmantenimiento) {
        this.Lmantenimiento = Lmantenimiento;
    }
    
    
}
