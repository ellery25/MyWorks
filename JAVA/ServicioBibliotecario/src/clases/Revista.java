/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author salacomputocentro.ba
 */
public class Revista {
    
    public int CODR;
    private String MagazineTitle;
    public String MagazineType;
    public String Autor;
    public String Editorial;
    public boolean disponible;

    public Revista(int CODR, String MagazineTitle, String MagazineType, String Autor, String Editorial, boolean disponible) {
        this.CODR = CODR;
        this.MagazineTitle = MagazineTitle;
        this.MagazineType = MagazineType;
        this.Autor = Autor;
        this.Editorial = Editorial;
        this.disponible = disponible;
    }
    
    public Revista(){
        
    }

    public int getCODR() {
        return CODR;
    }

    public void setCODR(int CODR) {
        this.CODR = CODR;
    }
    
    
    
    public String getMagazineTitle() {
        return MagazineTitle;
    }

    public void setMagazineTitle(String MagazineTitle) {
        this.MagazineTitle = MagazineTitle;
    }

    public String getMagazineType() {
        return MagazineType;
    }

    public void setMagazineType(String MagazineType) {
        this.MagazineType = MagazineType;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

  
    
    
}
