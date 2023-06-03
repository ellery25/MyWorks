
package clases;

public class banquero extends usuario{
    protected String user;
    protected String password; 

    public banquero(String user, String password, int Cedula, String Nombre, String Apellido) {
        super(Cedula, Nombre, Apellido);
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }



    
    
}
