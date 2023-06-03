package clases;


public class Pedido {
    private int IdUsuario;
    public String TituloMaterial;
    private int CodMaterial;
    public String fechaR;
    public String fechaE;

    public Pedido(int IdUsuario, String TituloMaterial, int CodMaterial, String fechaR, String fechaE) {
        this.IdUsuario = IdUsuario;
        this.TituloMaterial = TituloMaterial;
        this.CodMaterial = CodMaterial;
        this.fechaR = fechaR;
        this.fechaE = fechaE;
    }
    
    public Pedido(){
        
    }

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public String getTituloMaterial() {
        return TituloMaterial;
    }

    public void setTituloMaterial(String TituloMaterial) {
        this.TituloMaterial = TituloMaterial;
    }

    public int getCodMaterial() {
        return CodMaterial;
    }

    public void setCodMaterial(int CodMaterial) {
        this.CodMaterial = CodMaterial;
    }

    public String getFechaR() {
        return fechaR;
    }

    public void setFechaR(String fechaR) {
        this.fechaR = fechaR;
    }

    public String getFechaE() {
        return fechaE;
    }

    public void setFechaE(String fechaE) {
        this.fechaE = fechaE;
    }
    
    
    
}
