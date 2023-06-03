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
public class Comisario {
    
    public String Nombre;
    public String Apellido;
    public String Rol;

    public Comisario(String Nombre, String Apellido, String Rol) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Rol = Rol;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }
    
    
}
