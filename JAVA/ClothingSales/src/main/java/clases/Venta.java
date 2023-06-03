/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import clases.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author HOME
 */
public class Venta {
    
    int id_venta;
    Producto Productos;
    int cantidad;
    float total;
    String detalles;
    Calendar fecha;

    public Venta(int id_venta, Producto Productos, int cantidad, float total, String detalles, Calendar fecha) {
        this.id_venta = id_venta;
        this.Productos = Productos;
        this.cantidad = cantidad;
        this.total = total;
        this.detalles = detalles;
        this.fecha = fecha;
    }

    public Venta(){
        
    }
    
    public int getId_venta() {
        return id_venta;
    }

    public Producto getProductos() {
        return Productos;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public String getDetalles() {
        return detalles;
    }
    

    
    public void registrarVenta(ArrayList<Producto> productos, ArrayList<Venta> ventas, ArrayList<Inventario> inventario, JTextField cantidad, JComboBox lProductos, JTextField detalles, Calendar fecha, int idV, JTextField pago){
        
        float Total = 0;
        float devolucion = 0;
        
        String p = lProductos.getSelectedItem().toString();
        
        int Cantidad = Integer.parseInt(cantidad.getText());
        
        for(int i = 0; i < inventario.size(); i++){
            if(inventario.get(i).getProductos().getNombre().equals(p)){
                if(inventario.get(i).getCantidad() >= Cantidad){
                    Total = inventario.get(i).getProductos().getPrecio()*Cantidad;
                }
            }
        } 
        
        float cambio = Integer.parseInt(pago.getText());
        if(cambio >= Total){
            devolucion = cambio - Total;
            for(int i = 0; i < inventario.size(); i++){
            if(inventario.get(i).getProductos().getNombre().equals(p)){
                if(inventario.get(i).getCantidad() >= Cantidad){
                    inventario.get(i).setCantidad(inventario.get(i).getCantidad() - Cantidad);
                    ventas.add(new Venta(idV,inventario.get(i).getProductos(), Cantidad, Total, detalles.getText(), Calendar.getInstance()));
                    idV++;
                    JOptionPane.showMessageDialog(null, "Venta #" +  idV + System.lineSeparator() + "Fecha: " + fecha.getTime() + System.lineSeparator() + "Total: " + Total);
                    JOptionPane.showMessageDialog(null, "Cambio: " + devolucion);
                } else {
                    JOptionPane.showMessageDialog(null, "Cantidad de productos insuficientes");
                }
            }
        }
            for(int e = 0; e < productos.size(); e++){
                if(productos.get(e).getNombre().equals(p)){
                    if(productos.get(e).getCantidad() >= Cantidad){
                        productos.get(e).setCantidad(productos.get(e).getCantidad() - Cantidad);
                    }
                }
            }
        } else{
            JOptionPane.showMessageDialog(null, "Pago insuficiente");
        }
        
        cantidad.setText("");
        detalles.setText("");
        pago.setText("");
                 
    }
    
  
           
}
