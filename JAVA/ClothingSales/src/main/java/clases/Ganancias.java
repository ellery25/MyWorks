/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author HOME
 */
public class Ganancias {

    ArrayList<Venta> venta;

    public Ganancias(ArrayList<Venta> venta) {
        this.venta = venta;
    }
    
    public Ganancias(){
        
    }
    
    public ArrayList<Venta> getVenta() {
        return venta;
    }
    
    
    public void calcularGanancias(ArrayList<Venta> venta, JTextField montoInversion){
        
        int gananciaTotal = 0;
        
        for(int i = 0; i < venta.size(); i++){
            
            gananciaTotal += venta.get(i).getTotal();
            
        }
        
        int ganancia = gananciaTotal - Integer.parseInt(montoInversion.getText());
        
        if(gananciaTotal == 0){
            JOptionPane.showMessageDialog(null, "No hay ventas registradas");
        } else{
            ganancia = gananciaTotal - Integer.parseInt(montoInversion.getText());
            JOptionPane.showMessageDialog(null, "Ganancias: " + gananciaTotal);
        }
        
        montoInversion.setText("");
        
    }
    
    
    
    
    
}
