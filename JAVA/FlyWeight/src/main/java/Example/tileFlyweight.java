package Example;

/**
 *
 * @author HOME
 */
public class tileFlyweight {
    
    private String textura;
    private String tipoTerreno;

    public tileFlyweight(String textura, String tipoTerreno) {
        this.textura = textura;
        this.tipoTerreno = tipoTerreno;
    }

    public String getTextura() {
        return textura;
    }

    public void setTextura(String textura) {
        this.textura = textura;
    }

    public String getTipoTerreno() {
        return tipoTerreno;
    }

    public void setTipoTerreno(String tipoTerreno) {
        this.tipoTerreno = tipoTerreno;
    }

    
}

    

