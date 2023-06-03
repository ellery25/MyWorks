/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import java.util.ArrayList;

/**
 *
 * @author salacomputocentro.ba
 */
public class Bibliotecario extends Lector{
    
    private int PersonalID;

    public Bibliotecario(int PersonalID, String Nombre, String Dirección, int Telefono) {
        super(Nombre, Dirección, Telefono);
        this.PersonalID = PersonalID;
    }

    public int getPersonalID() {
        return PersonalID;
    }
    
    public void mostrarPedidos(ArrayList<Pedido> pd) {
        
        int i;
        
        for (i = 0; i < pd.size(); i++) {
            
            System.out.println("");
            System.out.println("Pedido : " + i+1);
            System.out.println("Número de Usuario: " + pd.get(i).getIdUsuario());
            System.out.println("Titulo material: " + pd.get(i).getTituloMaterial());
            System.out.println("Codigo material: " + pd.get(i).getCodMaterial());
            System.out.println("Fecha Reserva: " + pd.get(i).getFechaR());
            System.out.println("Fecha Entrega: " + pd.get(i).getFechaE());
            System.out.println("");
        }
    }
    
    public void mostrarPedidoFecha(ArrayList<Pedido> pd, String fechaR) {
        
        int i;
        boolean r = false;
        
        for (i=0; i < pd.size(); i++) {
            
            if(pd.get(i).getFechaR().equals(fechaR)) {
                
                r = true;
                
                System.out.println("");
                System.out.println("Pedido : " + i+1);
                System.out.println("Número de Usuario: " + pd.get(i).getIdUsuario());
                System.out.println("Titulo material: " + pd.get(i).getTituloMaterial());
                System.out.println("Codigo material: " + pd.get(i).getCodMaterial());
                System.out.println("Fecha Reserva: " + pd.get(i).getFechaR());
                System.out.println("Fecha Entrega: " + pd.get(i).getFechaE());
                System.out.println("");
                
            }
        }
        
        if(r == false) {
            System.out.println("No se encontraron pedidos con esa fecha o la digitación es incorrecta");
        }
    }
    
    
    
}
