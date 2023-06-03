package clases;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luis
 */
public class Obra {

    String nombre;
    String genero;
    int duracion;
    double precio;
    int maxBoletos;
    double recaudo = 0;
    int numeroSala;

    public Obra(String nombre, String genero, int duracion, double precio, int maxBoletos, int numeroSala) {
        this.nombre = nombre;
        this.genero = genero;
        this.duracion = duracion;
        this.precio = precio;
        this.maxBoletos = maxBoletos;
        this.numeroSala = numeroSala;
    }

    public Obra() {
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

    public int getMaxBoletos() {
        return maxBoletos;
    }

    public double getRecaudo() {
        return recaudo;
    }

    public void setRecaudo(double recaudo) {
        this.recaudo = recaudo;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void RegistrarObra(ArrayList<Obra> obras, ArrayList<Sala> salas, String nombreObra, String generoObra, int duracionObra, double precioObra, int numeroSala) {

        boolean obraRegistrada = false;

        for (int i = 0; i < obras.size(); i++) {
            //Verifica que la obra no esté previamente registrada
            if (obras.get(i).getNombre().equals(nombreObra)) {
                obraRegistrada = true;
            }
        }

        if (obraRegistrada) {

            JOptionPane.showMessageDialog(null, "La obra fue registrada previamente");

        } else {

            for (int i = 0; i < salas.size(); i++) {

                if (salas.get(i).getNumeroSala() == numeroSala) {

                    //Verifica que la sala no tenga asignada una sala
                    if (salas.get(i).getObra() == null) {

                        obras.add(new Obra(nombreObra, generoObra, duracionObra, precioObra, salas.get(i).getCantidadAsientos(), numeroSala));
                        salas.get(i).setObra(nombreObra);
                        JOptionPane.showMessageDialog(null, "Obra registrada Correctamente");

                    } else {

                        JOptionPane.showMessageDialog(null, "La sala tiene asignada una obra");

                    }

                }

            }

        }

    }

    public void VenderBoleto(ArrayList<Sala> sala, ArrayList<Obra> obras, String nombreObra, int cantidadBoletos, double dineroRecibido) {

        double total;
        double cambio;

        for (int i = 0; i < sala.size(); i++) {

            if (sala.get(i).getObra().equals(nombreObra)) {

                for (int e = 0; e < obras.size(); e++) {

                    if (obras.get(e).getNombre().equals(nombreObra)) {
                        
                        //verifica que la cantidad de boletos sea suficientes
                        if (sala.get(i).getCantidadAsientos() >= cantidadBoletos) {
                            
                            //Total de la venta
                            total = obras.get(e).getPrecio() * cantidadBoletos;
                             
                            //Verifica que el dinero recibido sea suficiente para el total de la venta
                            if (dineroRecibido >= total) {

                                cambio = dineroRecibido - total;
                                obras.get(e).setRecaudo(obras.get(e).getRecaudo() + total);
                                sala.get(i).setCantidadAsientos(sala.get(i).getCantidadAsientos() - cantidadBoletos);

                                JOptionPane.showMessageDialog(null, """
                                                                    Compra exitosa
                                                                     Total de venta: """ + total + "\n Cambio : " + cambio);

                            } else {

                                JOptionPane.showMessageDialog(null, "El dinero recibido es insuficiente para el total de la venta");

                            }

                        } else {
                            // En el caso de que la cantidad de boletos sea insuficiente, no realiza la venta
                            JOptionPane.showMessageDialog(null, "La cantidad de boletos que se requieren supera el número de asientos disponibles");

                        }

                    }

                }

            }

        }

    }
    
    public void ConsultaObra(ArrayList<Obra> obras, String nombreObra){
         
        for(int i = 0; i < obras.size(); i++){
            
            if(obras.get(i).getNombre().equals(nombreObra)){
                
                JOptionPane.showMessageDialog(null, "Obra: " + obras.get(i).getNombre() + "\n Género: " + obras.get(i).getGenero()
                        + "\n Duración en minutos: " + obras.get(i).getDuracion() + "\n Precio: " + obras.get(i).getPrecio()
                        + "\n Máximo de Boletos: " + obras.get(i).getMaxBoletos() + "\n Recaudo: " + obras.get(i).getRecaudo());
                
            }
            
        }
        
    }
    
    public void ConsultarObras(ArrayList<Obra> obras, JTable tablaObras){
        
        String columna[] = {"Nombre", "Genero", "DuraciónMinutos", "Precio", "MáximoBoletos", "Recaudo"};
        String matriz[][] = new String[obras.size()][6];
        
        if(obras.isEmpty()){
            JOptionPane.showMessageDialog(null, "No hay obras registradas en la base de datos");
        } else {
            
            for (int i = 0; i < matriz.length; i++){
                
                matriz[i][0] = obras.get(i).getNombre();
                matriz[i][1] = obras.get(i).getGenero();
                matriz[i][2] = String.valueOf(obras.get(i).getDuracion());
                matriz[i][3] = String.valueOf(obras.get(i).getPrecio());
                matriz[i][4] = String.valueOf(obras.get(i).getMaxBoletos());
                matriz[i][5] = String.valueOf(obras.get(i).getRecaudo());               
            }
            tablaObras.setModel(new DefaultTableModel(matriz,columna));
            
        }
        
    }

    
}
