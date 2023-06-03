package com.mycompany.etransporte;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ellery
 */
public class Conductor {
    
    int ID;
    String nombre;
    double Sueldo = 1550000;
    double extra = 0;
    String transporte = "";

    public Conductor(int ID, String nombre) {
        this.ID = ID;
        this.nombre = nombre;
    }
    
    public Conductor(){
        
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    public double getExtra() {
        return extra;
    }

    public void setExtra(double extra) {
        this.extra = extra;
    }
    
    

    public String getTransporte() {
        return transporte;
    }

    public void setTransporte(String transporte) {
        this.transporte = transporte;
    }
    
    public void registrarConductor(ArrayList<Conductor> Conductores, JTextField IdConductor, JTextField nombreConductor){
        
        boolean valid = false;
        for(int i = 0; i < Conductores.size(); i++) {
            
            if(Conductores.get(i).getID() == Integer.parseInt(IdConductor.getText())){
                valid = true;
            } else{
                valid = false;
            }
            
        }
        if(valid == true){
            JOptionPane.showMessageDialog(null, "El conductor no fue registrado, el ID ingresado ya existe en la base de datos");
        } else {
            Conductores.add(new Conductor(Integer.parseInt(IdConductor.getText()), nombreConductor.getText()));
                JOptionPane.showMessageDialog(null, "Conductor con ID: " + IdConductor.getText() + " agregado");
        }
        
    }
    
    public void verSueldoConductor(ArrayList<Conductor> Conductores, JTextField idConductor){
        boolean valid = false;
        for(int i = 0; i < Conductores.size(); i++) {
            
            if(Conductores.get(i).getID() == Integer.parseInt(idConductor.getText())){
                valid = true;
            } else{
                valid = false;
            }
            
        }
        if(valid == false){
            JOptionPane.showMessageDialog(null, "El ID del conductor no fue encontrado");
        } else {
            for(int i = 0; i < Conductores.size(); i++){
                if(Conductores.get(i).getID() == Integer.parseInt(idConductor.getText())){
                    JOptionPane.showMessageDialog(null, "El conductor " + Conductores.get(i).getNombre() + " con numero de ID: " + Conductores.get(i).getID() + " maneja un sueldo de: " + Conductores.get(i).getSueldo());
                }
            }
            
        }
    }
    
    
    public void transporteXConductor(ArrayList<Conductor> Conductores, ArrayList<Transporte> transportes, JTextField IdConductor){
        
        boolean valid = false;
        for(int i = 0; i < Conductores.size(); i++) {
            
            if(Conductores.get(i).getID() == Integer.parseInt(IdConductor.getText())){
                valid = true;
            } else{
                valid = false;
            }
            
        }
        if(valid == false){
            JOptionPane.showMessageDialog(null, "El ID del conductor no fue encontrado");
        } else {
            boolean transporte = false;
            for(int i = 0; i < Conductores.size(); i++){
                if(Conductores.get(i).getID() == Integer.parseInt(IdConductor.getText())){
                    for(int e = 0; e < transportes.size(); e++){
                        if(transportes.get(e).getCodigoConductor() == Integer.parseInt(IdConductor.getText())){
                            transporte = true;
                            JOptionPane.showMessageDialog(null, "El conductor con ID: " +  IdConductor.getText() +  " tiene asignado un transporte de tipo: " + transportes.get(e).getTipoTransporte());
                            
                        } 
                    }
                }
            }
            if(transporte == false){
                JOptionPane.showMessageDialog(null, "El conductor no tiene asignado ningún transporte");
            }
        }
        
    }
    
    public void mostrarNomina(ArrayList<Conductor> conductores, ArrayList<Transporte> transportes, JTable tablaNomina){
        String col[] = {"Conductor", "Tipo", "Extra", "Total Sueldo"};
        String matriz[][] = new String[conductores.size()][4];
        
        if(conductores.isEmpty()){
            JOptionPane.showMessageDialog(null, "No hay conductores registrados!");
        } else {
            for (int i = 0; i < matriz.length; i++) {
            matriz[i][0] = String.valueOf(conductores.get(i).getID());
            matriz[i][1] = conductores.get(i).getTransporte();
            matriz[i][2] = String.valueOf(conductores.get(i).getExtra());
            matriz[i][3] = String.valueOf(conductores.get(i).getSueldo());
        }
        tablaNomina.setModel(new DefaultTableModel(matriz, col));
        }
        
        
    }
    
    
    
}
