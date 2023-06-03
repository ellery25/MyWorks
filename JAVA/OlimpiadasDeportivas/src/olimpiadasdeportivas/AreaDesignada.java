
package olimpiadasdeportivas;


public class AreaDesignada {
    
    String Localizacion;
    Deporte Deporte;

    public AreaDesignada(String Localizacion, Deporte Deporte) {
        this.Localizacion = Localizacion;
        this.Deporte = Deporte;
    }

    public Deporte getDeporte() {
        return Deporte;
    }

    public void setDeporte(Deporte Deporte) {
        this.Deporte = Deporte;
    }
    
    

    public String getLocalizacion() {
        return Localizacion;
    }

    public void setLocalizacion(String Localizacion) {
        this.Localizacion = Localizacion;
    }

    
    
}
