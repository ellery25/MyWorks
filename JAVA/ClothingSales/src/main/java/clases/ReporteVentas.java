/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author HOME
 */
public class ReporteVentas {
    
    ArrayList<Venta> Ventas;

    public ReporteVentas(ArrayList<Venta> Ventas) {
        this.Ventas = Ventas;
    }

    public ArrayList<Venta> getVentas() {
        return Ventas;
    }
    
    public ReporteVentas(){
        
    }
    
    public static void aumentarDia(Calendar calendario, JLabel fechaV){
        
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        calendario.add(Calendar.DATE, 1);
        Date fechaAumentada = calendario.getTime();
        fechaV.setText(formatoFecha.format(fechaAumentada));
    }
    
    public static void aumentarSemana(Calendar calendario, JLabel fechaV){
        
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        calendario.add(Calendar.WEEK_OF_YEAR, 1);
        Date fechaAumentada = calendario.getTime();
        fechaV.setText(formatoFecha.format(fechaAumentada));
        
    }
    
    public static void ReporteDiario(ArrayList<Venta> venta, Calendar calendario){
        boolean valid = false;
            for(int i = 0; i < venta.size(); i++){
                if(venta.get(i).getFecha().get(Calendar.DAY_OF_MONTH) == calendario.get(Calendar.DAY_OF_MONTH)){
                    valid = true;
                    JOptionPane.showMessageDialog(null, "Venta #" + venta.get(i).getId_venta() + System.lineSeparator()
                    + "Detalles: " + venta.get(i).getDetalles() + System.lineSeparator() + "Fecha: " + venta.get(i).getFecha().getTime() + System.lineSeparator() 
                            + "Total: " + venta.get(i).getTotal());
                }
            }
        
        if(valid){
            
        } else {
            JOptionPane.showMessageDialog(null, "No hay ventas registradas el día de hoy");
        }
    
    }
    
    public static void ReporteSemanal(ArrayList<Venta> venta, Calendar calendario) {
        boolean valid = false;
        for(int i = 0; i < venta.size(); i++){
            if(venta.get(i).getFecha().get(Calendar.WEEK_OF_YEAR) == calendario.get(Calendar.WEEK_OF_YEAR)){
                valid = true;
                JOptionPane.showMessageDialog(null, "Venta #" + venta.get(i).getId_venta() + System.lineSeparator()
                    + "Detalles: " + venta.get(i).getDetalles() + System.lineSeparator() + "Fecha: " + venta.get(i).getFecha().getTime() + System.lineSeparator() 
                            + "Total: " + venta.get(i).getTotal());
            }
            
        } 
        
        if(valid){
            
        } else {
            JOptionPane.showMessageDialog(null, "No hay ventas registradas esta semana");
        }
        
    }
    
}
