package clases;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author HOME
 */

public class Inventario {
    
    Producto productos;
    int cantidad;

    public Inventario(Producto productos, int cantidad) {
        this.productos = productos;
        this.cantidad = cantidad;
    }

    public Producto getProductos() {
        return productos;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setProductos(Producto productos) {
        this.productos = productos;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
    
    
}
