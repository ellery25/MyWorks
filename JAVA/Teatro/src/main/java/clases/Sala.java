package clases;

/**
 *
 * @author HOME
 */
public class Sala {
    
    int numeroSala;
    int cantidadAsientos;
    String ObraSala;

    public Sala(int numeroSala, int cantidadAsientos, String ObraSala) {
        this.numeroSala = numeroSala;
        this.cantidadAsientos = cantidadAsientos;
        this.ObraSala = ObraSala;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public String getObraSala() {
        return ObraSala;
    }

    public void setObraSala(String ObraSala) {
        this.ObraSala = ObraSala;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    
    
    
    
}
