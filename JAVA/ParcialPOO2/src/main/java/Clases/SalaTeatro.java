package Clases;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author E - l - l - e - r - y
 */
public class SalaTeatro {

    int numberSala;
    int cantidadAsientos;
    ObraDTeatro obra;

    public SalaTeatro(int numberSala, int cantidadAsientso) {
        this.numberSala = numberSala;
        this.cantidadAsientos = cantidadAsientso;
    }

    public SalaTeatro() {
    }

    public int getNumberSala() {
        return numberSala;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public ObraDTeatro getObra() {
        return obra;
    }

    public void setObra(ObraDTeatro obra) {
        this.obra = obra;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }
       
    public void AsignarSala(ArrayList<SalaTeatro> salas, ArrayList<ObraDTeatro> obras, JComboBox boxObras, JComboBox boxSalas) {

        for (int i = 0; i < salas.size(); i++) {

            if (salas.get(i).getNumberSala() == Integer.parseInt(boxSalas.getSelectedItem().toString())) {

                if (salas.get(i).getObra() == null) {

                    for (int e = 0; e < obras.size(); e++) {

                        if (obras.get(e).getNombre().equals(boxObras.getSelectedItem().toString())) {

                            if (obras.get(e).getSalaAsignada() == null) {

                                obras.get(e).setSalaAsignada(salas.get(i));
                                salas.get(i).setObra(obras.get(e));
                                obras.get(e).setMaxBoletos(salas.get(i).getCantidadAsientos());
                                JOptionPane.showMessageDialog(null, "A la obra: " + boxObras.getSelectedItem().toString()
                                        + " se le fue asignada la Sala #" + boxSalas.getSelectedItem().toString());

                            } else {

                                JOptionPane.showMessageDialog(null, "Esta obra ya tiene una sala asignada");

                            }

                        }

                    }

                } else {

                    JOptionPane.showMessageDialog(null, "La sala ya tiene asignada una Obra");

                }

            }

        }

    }

    public void DesasignarSala(ArrayList<SalaTeatro> salas, ArrayList<ObraDTeatro> obras, JComboBox boxObras) {

        for (int i = 0; i < obras.size(); i++) {

            if (obras.get(i).getNombre().equals(boxObras.getSelectedItem().toString())) {

                for (int e = 0; e < salas.size(); e++) {

                    if (salas.get(e).getObra() == null) {

                    } else {

                        if (salas.get(e).getObra().equals(obras.get(i))) {

                            obras.get(i).setSalaAsignada(null);
                            salas.get(e).setObra(null);
                            obras.get(i).setMaxBoletos(0);
                            JOptionPane.showMessageDialog(null, "A la obra : " + obras.get(i).getNombre() + " se le fue desasignada la sala #" + salas.get(e).getNumberSala());
                            boxObras.removeItem(boxObras.getSelectedItem());

                        }

                    }

                }

            }

        }

    }
    
    public void ConsultarSalas(ArrayList<SalaTeatro> salas, JTable tableSala){
        
        String c[] = {"NumeroSala", "Asientos Disponibles", "Obra Asignada"};
        String m[][] = new String[salas.size()][3];
        
        for (int i = 0; i < m.length; i++){
            
            
            m[i][0] = String.valueOf(salas.get(i).getNumberSala());
            m[i][1] = String.valueOf(salas.get(i).getCantidadAsientos());
            if(salas.get(i).getObra() == null){
                m[i][2] = "Nulo";
            } else {
                m[i][2] = String.valueOf(salas.get(i).getObra().getNombre());
            }
            
        }
        tableSala.setModel(new DefaultTableModel(m,c));
        
    }

}
