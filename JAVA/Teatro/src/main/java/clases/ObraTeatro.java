package clases;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HOME
 */
public class ObraTeatro {

    String nombre;
    String genero;
    double precio;
    int minutos;
    int maximoBoletos;
    double recaudo = 0;

    public ObraTeatro(String nombre, String genero, double precio, int minutos, int maximoBoletos) {
        this.nombre = nombre;
        this.genero = genero;
        this.precio = precio;
        this.minutos = minutos;
        this.maximoBoletos = maximoBoletos;
    }

    public ObraTeatro() {

    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public double getPrecio() {
        return precio;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getMaximoBoletos() {
        return maximoBoletos;
    }

    public void setMaximoBoletos(int maximoBoletos) {
        this.maximoBoletos = maximoBoletos;
    }

    public double getRecaudo() {
        return recaudo;
    }

    public void setRecaudo(double recaudo) {
        this.recaudo = recaudo;
    }

    public void registrarObra(ArrayList<Sala> salas, ArrayList<ObraTeatro> Obras, JTextField nombreObra, JTextField genero, JTextField Precio, JTextField minutos, JComboBox Sala) {
        boolean obrargt = false;
        for (int i = 0; i < Obras.size(); i++) {
            if (Obras.get(i).getNombre().equals(nombreObra.getText())) {
                if (Obras.get(i).getGenero().equals(genero.getText())) {
                    obrargt = true;
                }
            }
        }

        if (obrargt == true) {
            JOptionPane.showMessageDialog(null, "Esta obra ya está registrada");
        } else {

            for (int i = 0; i < salas.size(); i++) {
                if (Integer.parseInt(Sala.getSelectedItem().toString()) == salas.get(i).numeroSala) {
                    if (salas.get(i).getObraSala() == null) {

                        String nombreO = nombreObra.getText();
                        String generoObra = genero.getText();
                        double precioObra = Double.parseDouble(Precio.getText());
                        int minutosObra = Integer.parseInt(minutos.getText());

                        Obras.add(new ObraTeatro(nombreO, generoObra, precioObra, minutosObra, salas.get(i).getCantidadAsientos()));
                        salas.get(i).setObraSala(nombreO);

                        JOptionPane.showMessageDialog(null, "Obra: " + nombreO + " registrada correctamente :) ");
                    } else {

                        JOptionPane.showMessageDialog(null, "Esta sala ya tiene asignada una obra");
                    }
                }
            }

        }

    }

    public void venderBoleto(ArrayList<Sala> salas, ArrayList<ObraTeatro> obras, JComboBox Obras, JTextField numeroBoletos) {

        double recaudoObra = 0;

        for (int i = 0; i < salas.size(); i++) {

            if (Obras.getSelectedItem().toString().equals(salas.get(i).getObraSala())) {

                if (Integer.parseInt(numeroBoletos.getText()) <= salas.get(i).getCantidadAsientos()) {

                    for (int e = 0; e < obras.size(); e++) {

                        if (Obras.getSelectedItem().toString().equals(obras.get(e).getNombre())) {

                            recaudoObra += Integer.parseInt(numeroBoletos.getText()) * (obras.get(e).getPrecio());

                            salas.get(i).setCantidadAsientos(salas.get(i).getCantidadAsientos() - Integer.parseInt(numeroBoletos.getText()));
                            obras.get(e).setRecaudo(obras.get(e).getRecaudo() + recaudoObra);

                            JOptionPane.showMessageDialog(null, "Total de la venta: " + recaudoObra);
                        }
                    }

                } else {

                    JOptionPane.showMessageDialog(null, "Máximo de asientos superados");

                }

            }

        }

    }

    public void consultaObra(ArrayList<ObraTeatro> obras, JTextField nombreObra) {
        
        boolean validar = false;
        
        for (int i = 0; i < obras.size(); i++) {

            if (nombreObra.getText().equals(obras.get(i).getNombre())) {
                
                validar = true;               
                JOptionPane.showMessageDialog(null, "Obra: " + obras.get(i).getNombre() + "\n Género: " + obras.get(i).getGenero()
                        + "\n Duración en minutos: " + obras.get(i).getMinutos() + "\n Precio: " + obras.get(i).getPrecio()
                        + "\n Máximo de Boletos: " + obras.get(i).getMaximoBoletos());
            } 

        }
        
        if(validar == false){
            JOptionPane.showMessageDialog(null, "No se encontró una obra con ese nombre");
        }

    }

    public void recaudoObra(ArrayList<ObraTeatro> obras, JTextField nombreObra) {
        boolean validar = false;

        for (int i = 0; i < obras.size(); i++) {
            if (nombreObra.getText().equals(obras.get(i).getNombre())) {
                validar = true;
                JOptionPane.showMessageDialog(null, "Esta obra tiene un recaudo total de : " + obras.get(i).getRecaudo());
            } 
        }
        
        if(validar == false){
            JOptionPane.showMessageDialog(null, "No se encontró una obra con ese nombre");
        }

    }
    
    public void tablaObras(ArrayList<ObraTeatro> obras, JTable tablaObras){
        
        String c[] = {"Nombre", "Genero", "DuraciónMinutos", "Precio", "MáximoBoletos", "Recaudo"};
        String m[][] = new String[obras.size()][6];
        
        if(obras.isEmpty()){
            JOptionPane.showMessageDialog(null, "No hay obras registradas en la base de datos");
        } else {
            
            for (int i = 0; i < m.length; i++){
                
                m[i][0] = obras.get(i).getNombre();
                m[i][1] = obras.get(i).getGenero();
                m[i][2] = String.valueOf(obras.get(i).getMinutos());
                m[i][3] = String.valueOf(obras.get(i).getPrecio());
                m[i][4] = String.valueOf(obras.get(i).getMaximoBoletos());
                m[i][5] = String.valueOf(obras.get(i).getRecaudo());               
            }
            tablaObras.setModel(new DefaultTableModel(m,c));
            
        }
        
    }
}
