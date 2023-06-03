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
public class Transporte {

    String tipoTransporte;
    int codigoConductor;
    int cantidadPersonas;
    int totalHoras;
    int toneladas;
    int viajesRealizados;
    double extra;

    public Transporte(String tipoTransporte, int codigoConductor, int cantidadPersonas, int totalHoras, int toneladas, int viajesRealizados, double extra) {
        this.tipoTransporte = tipoTransporte;
        this.codigoConductor = codigoConductor;
        this.cantidadPersonas = cantidadPersonas;
        this.totalHoras = totalHoras;
        this.toneladas = toneladas;
        this.viajesRealizados = viajesRealizados;
        this.extra = extra;
    }

    public Transporte() {

    }

    public String getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public int getCodigoConductor() {
        return codigoConductor;
    }

    public void setCodigoConductor(int codigoConductor) {
        this.codigoConductor = codigoConductor;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public int getTotalHoras() {
        return totalHoras;
    }

    public void setTotalHoras(int totalHoras) {
        this.totalHoras = totalHoras;
    }

    public int getToneladas() {
        return toneladas;
    }

    public int getViajesRealizados() {
        return viajesRealizados;
    }

    public double getExtra() {
        return extra;
    }

    public void asignarTransportePersona(ArrayList<Conductor> Conductores, ArrayList<Transporte> Transportes, JTextField idConductor, JTextField cantidadPersonas, JTextField totalHoras) {
        boolean valid = false;
        boolean conductor = false;
        double extra = 0;
        //Validar de que el conductor existe
        for (int i = 0; i < Conductores.size(); i++) {
            if (Conductores.get(i).getID() == Integer.parseInt(idConductor.getText())) {
                conductor = true;
                //Validar de que el conductor no tiene asignado un transporte
                for (int e = 0; e < Transportes.size(); e++) {
                    if (Transportes.get(e).getCodigoConductor() == Integer.parseInt(idConductor.getText())) {
                        valid = true;
                    }
                }
            }

        }
        if (conductor == true) {

            if (valid == true) {
                JOptionPane.showMessageDialog(null, "El conductor ya tiene asignado un transporte");
            } else {
                boolean colectivo = false;

                for (int e = 0; e < Conductores.size(); e++) {
                    if (Conductores.get(e).getID() == Integer.parseInt(idConductor.getText())) {

                        if (Integer.parseInt(cantidadPersonas.getText()) > 9) {
                            colectivo = true;
                        }
                        if (colectivo == true) {
                            extra = (18500 * Integer.parseInt(totalHoras.getText()));
                            Conductores.get(e).setSueldo(Conductores.get(e).getSueldo() + extra);
                            Conductores.get(e).setExtra(extra);
                            Conductores.get(e).setTransporte("PERSONA");
                        } else {
                            extra = (17500 * Integer.parseInt(totalHoras.getText()));
                            Conductores.get(e).setSueldo(Conductores.get(e).getSueldo() + extra);
                            Conductores.get(e).setExtra(extra);
                            Conductores.get(e).setTransporte("PERSONA");
                        }

                    }
                }

                Transportes.add(new Transporte("PERSONA", Integer.parseInt(idConductor.getText()), Integer.parseInt(cantidadPersonas.getText()), Integer.parseInt(totalHoras.getText()), 0, 0, extra));
                JOptionPane.showMessageDialog(null, "El conductor " + idConductor.getText() + " se le fue asignado un transporte");
            }

        } else {

            JOptionPane.showMessageDialog(null, "No se encontró un conductor con ese ID");

        }

    }

    public void asignarTransporteMercancia(ArrayList<Conductor> Conductores, ArrayList<Transporte> Transportes, JTextField conductorMercancia, JTextField cantidadToneladas, JTextField horasMercancia) {
        boolean valid = false;
        boolean conductor = false;
        double extra = 0;
        //Validar de que el conductor existe
        for (int i = 0; i < Conductores.size(); i++) {
            if (Conductores.get(i).getID() == Integer.parseInt(conductorMercancia.getText())) {
                conductor = true;
                //Validar de que el conductor no tiene asignado un transporte
                for (int e = 0; e < Transportes.size(); e++) {
                    if (Transportes.get(e).getCodigoConductor() == Integer.parseInt(conductorMercancia.getText())) {
                        valid = true;
                    }
                }
            }

        }

        if (conductor == true) {
            if (valid == true) {
                JOptionPane.showMessageDialog(null, "El conductor ya tiene asignado un transporte");
            } else {

                for (int i = 0; i < Conductores.size(); i++) {

                    if (Conductores.get(i).getID() == Integer.parseInt(conductorMercancia.getText())) {

                        extra = (15000 * Integer.parseInt(horasMercancia.getText())) + (7000 * Integer.parseInt(cantidadToneladas.getText()));
                        Conductores.get(i).setSueldo(extra + Conductores.get(i).getSueldo());
                        Conductores.get(i).setExtra(extra);
                        Conductores.get(i).setTransporte("MERCANCÍA");

                    }

                }

                Transportes.add(new Transporte("MERCANCÍA", Integer.parseInt(conductorMercancia.getText()), 0, Integer.parseInt(horasMercancia.getText()), Integer.parseInt(cantidadToneladas.getText()), 0, extra));
                JOptionPane.showMessageDialog(null, "El conductor " + conductorMercancia.getText() + " se le fue asignado un transporte");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró un conductor con ese ID");
        }

    }

    public void asignarTransporteMercanciaPeligrosa(ArrayList<Conductor> Conductores, ArrayList<Transporte> Transportes, JTextField idPeligroso, JTextField toneladasPeligrosas, JTextField viajes, JTextField horasPeligrosas) {

        boolean valid = false;
        boolean conductor = false;
        double extra = 0;
        //Validar de que el conductor existe
        for (int i = 0; i < Conductores.size(); i++) {
            if (Conductores.get(i).getID() == Integer.parseInt(idPeligroso.getText())) {
                conductor = true;
                //Validar de que el conductor no tiene asignado un transporte
                for (int e = 0; e < Transportes.size(); e++) {
                    if (Transportes.get(e).getCodigoConductor() == Integer.parseInt(idPeligroso.getText())) {
                        valid = true;
                    }
                }
            }

        }

        if (conductor == true) {
            if (valid == true) {
                JOptionPane.showMessageDialog(null, "El conductor ya tiene asignado un transporte");
            } else {

                for (int i = 0; i < Conductores.size(); i++) {
                    if (Conductores.get(i).getID() == Integer.parseInt(idPeligroso.getText())) {

                        extra = (15000 * Integer.parseInt(horasPeligrosas.getText())) + (7000 * Integer.parseInt(toneladasPeligrosas.getText())) + (150000 * Integer.parseInt(viajes.getText()));
                        Conductores.get(i).setSueldo(Conductores.get(i).getSueldo() + extra);
                        Conductores.get(i).setExtra(extra);
                        Conductores.get(i).setTransporte("PELIGROSA");
                    }
                }

                Transportes.add(new Transporte("PELIGROSA", Integer.parseInt(idPeligroso.getText()), 0, Integer.parseInt(horasPeligrosas.getText()), Integer.parseInt(toneladasPeligrosas.getText()), Integer.parseInt(viajes.getText()), extra));
                JOptionPane.showMessageDialog(null, "El conductor " + idPeligroso.getText() + " se le fue asignado un transporte");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró un conductor con ese ID");
        }

    }

    public void mostrarTransportes(ArrayList<Transporte> transportes, JTable tablaTransporte) {

        String col[] = {"Conductor", "Tipo", "Horas", "Personas", "Toneladas"};
        String matriz[][] = new String[transportes.size()][5];

        if (transportes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay transportes registrados!");
        } else {

            for (int i = 0; i < matriz.length; i++) {
                matriz[i][0] = String.valueOf(transportes.get(i).getCodigoConductor());
                matriz[i][1] = transportes.get(i).getTipoTransporte();
                matriz[i][2] = String.valueOf(transportes.get(i).getTotalHoras());
                matriz[i][3] = String.valueOf(transportes.get(i).getCantidadPersonas());
                matriz[i][4] = String.valueOf(transportes.get(i).getToneladas());
            }
            tablaTransporte.setModel(new DefaultTableModel(matriz, col));

        }

    }
    
    public void listarTransportePeligroso(ArrayList<Transporte> transportes, JTable transportePeligroso){
        
        
        
    }

}
