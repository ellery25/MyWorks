package clases;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import Interface.*;

/**
 *
 * @author HOME
 */
public class Producto {
    
    String nombre;
    int cantidad;
    float precio;

    public Producto(String nombre, int cantidad, float precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    public Producto(){
        
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public void actualizar_cantidad(int cantidadVendida){
        boolean valid;
        
        if(cantidad < cantidadVendida){
            valid = false;
        } else{
            valid = true;
            cantidad = cantidad - cantidadVendida;
        }
    }
    
    
    public void verificar_existencias(ArrayList<Producto> productos, JComboBox box){
        
        for(int i = 0; i < productos.size(); i++) {
            if(productos.get(i).getNombre().equals(box.getSelectedItem().toString())){
                JOptionPane.showMessageDialog(null, "Cantidad de " + productos.get(i).getNombre()+": " + productos.get(i).getCantidad());
                if(productos.get(i).getCantidad() < 8){
                    JOptionPane.showMessageDialog(null, "El producto: " + productos.get(i).getNombre() + " ya cuenta con menos de 8 elementos de existencia");
                }
            }
        }
        
    }
    
    public void eliminar_Producto(JComboBox box, ArrayList<Inventario> inventario, ArrayList<Producto> productos, JComboBox carrito){
        
        String productoE = box.getSelectedItem().toString();
       
        for(int i = 0; i < productos.size(); i++){
            if(productos.get(i).getNombre().equals(productoE)){
                productos.remove(i);
                box.removeItem(box.getSelectedItem());
                
                for(int e = 0; e < inventario.size(); e++){
                    if(inventario.get(e).getProductos().getNombre().equals(productoE)){
                    inventario.remove(e);
                    }
                }
                
                for(int x = 0; x < carrito.getItemCount(); x++){
                    if(carrito.getItemAt(x).toString().equals(productoE)){
                        carrito.removeItemAt(x);
                    }
                }
                                
            }
            
        }   
    }
    
    public void registrar_producto(JComboBox listaProductos,JTextField nombreProducto, JTextField cantidadProducto, JTextField precioProducto, ArrayList<Producto> productos, ArrayList<Inventario> inventario, int c, JComboBox carrito){
        
        productos.add(new Producto(nombreProducto.getText(), Integer.parseInt(cantidadProducto.getText()), Float.parseFloat(precioProducto.getText())));
        JOptionPane.showMessageDialog(null, nombreProducto.getText() + " Registrado");
        
        Producto t = new Producto(nombreProducto.getText(), Integer.parseInt(cantidadProducto.getText()), Float.parseFloat(precioProducto.getText()));
        
        inventario.add(new Inventario(t, Integer.parseInt(cantidadProducto.getText())));
        
        
        nombreProducto.setText("");
        cantidadProducto.setText("");
        precioProducto.setText("");
        
        listaProductos.addItem(t.getNombre());
        carrito.addItem(t.getNombre());
        c++;
    }
    
    
}
