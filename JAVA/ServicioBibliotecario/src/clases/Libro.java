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
    public class Libro {
    
    public int CODL;
    private String Booktitle;
    public String Booktype;
    public String Autor;
    public String Editorial;
    public boolean disponible;

    public Libro(int CODL, String Booktitle, String Booktype, String Autor, String Editorial, boolean disponible) {
        this.CODL = CODL;
        this.Booktitle = Booktitle;
        this.Booktype = Booktype;
        this.Autor = Autor;
        this.Editorial = Editorial;
        this.disponible = disponible;
    }  
    public Libro(){
        
    }

    public int getCODL() {
        return CODL;
    }

    public void setCODL(int CODL) {
        this.CODL = CODL;
    }
    
    
    
    public String getBooktitle() {
        return Booktitle;
    }

    public void setBooktitle(String Booktitle) {
        this.Booktitle = Booktitle;
    }

    public String getBooktype() {
        return Booktype;
    }

    public void setBooktype(String Booktype) {
        this.Booktype = Booktype;
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
