package Clases;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author E - l - l - e - r - y
 */
public class ObraDTeatro {

    String nombre;
    String genero;
    int duracion;
    double precio;
    double recaudo = 0;
    int maxBoletos;
    SalaTeatro salaAsignada;

    public ObraDTeatro(String nombre, String genero, int duracion, double precio) {
        this.nombre = nombre;
        this.genero = genero;
        this.duracion = duracion;
        this.precio = precio;
    }

    public ObraDTeatro() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public double getPrecio() {
        return precio;
    }

    public double getRecaudo() {
        return recaudo;
    }

    public int getMaxBoletos() {
        return maxBoletos;
    }

    public SalaTeatro getSalaAsignada() {
        return salaAsignada;
    }

    public void setSalaAsignada(SalaTeatro salaAsignada) {
        this.salaAsignada = salaAsignada;
    }

    public void setRecaudo(double recaudo) {
        this.recaudo = recaudo;
    }

    public void setMaxBoletos(int maxBoletos) {
        this.maxBoletos = maxBoletos;
    }

    public void Registrar(ArrayList<ObraDTeatro> obras, JTextField nombreObra, JTextField generoObra, JTextField minutosObra, JTextField precioBoleto) {

        boolean valid = false;

        for (int i = 0; i < obras.size(); i++) {

            if (obras.get(i).getNombre().equals(nombreObra.getText())) {
                valid = true;
            }

        }

        if (valid == true) {
            JOptionPane.showMessageDialog(null, "Esta obra ya está registrada en el sistema");
        } else {
            obras.add(new ObraDTeatro(nombreObra.getText(), generoObra.getText(), Integer.parseInt(minutosObra.getText()), Double.parseDouble(precioBoleto.getText())));
            JOptionPane.showMessageDialog(null, "Obra : " + nombreObra.getText() + " registrada en el sistema Correctamente");
        }

        nombreObra.setText("");
        generoObra.setText("");
        minutosObra.setText("");
        precioBoleto.setText("");
    }

    public void VenderBoleto(ArrayList<ObraDTeatro> obras, ArrayList<SalaTeatro> salas, JComboBox boxObras, JTextField cantidadBoletos, JTextField dineroRecibido) {

        double totalVenta;
        double devuelta;

        for (int i = 0; i < salas.size(); i++) {

            if (salas.get(i).getObra() != null) {

                if (salas.get(i).getObra().getNombre().equals(boxObras.getSelectedItem().toString())) {

                    for (int e = 0; e < obras.size(); e++) {

                        if (obras.get(e).getNombre().equals(boxObras.getSelectedItem().toString())) {

                            if (salas.get(i).getCantidadAsientos() >= Integer.parseInt(cantidadBoletos.getText())) {

                                totalVenta = obras.get(e).getPrecio() * Integer.parseInt(cantidadBoletos.getText());

                                if (Integer.parseInt(dineroRecibido.getText()) >= totalVenta) {

                                    devuelta = Integer.parseInt(dineroRecibido.getText()) - totalVenta;
                                    obras.get(e).setRecaudo(obras.get(e).getRecaudo() + totalVenta);
                                    salas.get(i).setCantidadAsientos(salas.get(i).getCantidadAsientos() - Integer.parseInt(cantidadBoletos.getText()));
                                    JOptionPane.showMessageDialog(null, "Compra Exitosa " + " \n Total de Venta: " + totalVenta
                                            + "\n Devolver al cliente: " + devuelta);

                                } else {

                                    JOptionPane.showMessageDialog(null, "El dinero es insuficiente para el total de la venta");
                                }

                            } else {

                                JOptionPane.showMessageDialog(null, "Cantidad de asientos insuficientes para la venta");

                            }

                        }

                    }

                }

            }

        }

    }

    public void consultaObra(ArrayList<ObraDTeatro> obras, JComboBox nombreObra) {

        for (int i = 0; i < obras.size(); i++) {

            if (obras.get(i).getNombre().equals(nombreObra.getSelectedItem().toString())) {

                JOptionPane.showMessageDialog(null, "Nombre de la obra: " + obras.get(i).getNombre() + "\n Género: " + obras.get(i).getGenero()
                        + "\n Duración en minutos: " + obras.get(i).getDuracion() + "\n Precio: " + obras.get(i).getPrecio()
                        + "\n Máximo de Boletos: " + obras.get(i).getMaxBoletos() + "\n Recaudo: " + obras.get(i).getRecaudo());

            }

        }
    }
    
    public void ConsultarObras(ArrayList<ObraDTeatro> obras, JTable tablaObras){
        
        String c[] = {"Nombre", "Genero", "DuraciónMinutos", "PrecioBoleto", "Recaudo", "MaxBoletos"};
        String m[][] = new String[obras.size()][6];
        
            for (int i = 0; i < m.length; i++){
                
                m[i][0] = obras.get(i).getNombre();
                m[i][1] = obras.get(i).getGenero();
                m[i][2] = String.valueOf(obras.get(i).getDuracion());
                m[i][3] = String.valueOf(obras.get(i).getPrecio());
                m[i][4] = String.valueOf((double) obras.get(i).getRecaudo());
                m[i][5] = String.valueOf(obras.get(i).getMaxBoletos());               
            }
            tablaObras.setModel(new DefaultTableModel(m,c));
            
        
        
    }

}
