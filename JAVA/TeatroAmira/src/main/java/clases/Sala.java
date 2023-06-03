package clases;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luis
 */
public class Sala {
    
    int numeroSala;
    int cantidadAsientos;
    String obra = null;

    public Sala(int numeroSala, int cantidadAsientos) {
        this.numeroSala = numeroSala;
        this.cantidadAsientos = cantidadAsientos;
    }
    
    public Sala(){
        
    }
    
    public int getNumeroSala() {
        return numeroSala;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public String getObra() {
        return obra;
    }

    public void setObra(String obra) {
        this.obra = obra;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }
    
    public void ConsultarSalas(ArrayList<Sala> salas, JTable tableSala){
        
        String columna[] = {"NumeroSala", "Asientos Disponibles", "Obra Asignada"};
        String matriz[][] = new String[salas.size()][3];
        
        for (int i = 0; i < matriz.length; i++){
            
            matriz[i][0] = String.valueOf(salas.get(i).getNumeroSala());
            matriz[i][1] = String.valueOf(salas.get(i).getCantidadAsientos());
            matriz[i][2] = String.valueOf(salas.get(i).getObra());
            
        }
        tableSala.setModel(new DefaultTableModel(matriz,columna));
        
    }
        
}
