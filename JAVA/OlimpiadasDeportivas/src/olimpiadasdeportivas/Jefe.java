/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olimpiadasdeportivas;

/**
 *
 * @author salacomputocentro.ba
 */
public class Jefe {
    
    public int ID;
    public String nombre;
    public String Apellido;

    public Jefe(int ID, String nombre, String Apellido) {
        this.ID = ID;
        this.nombre = nombre;
        this.Apellido = Apellido;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    
    
}
