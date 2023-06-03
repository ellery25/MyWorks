/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author salacomputocentro.ba
 */
public class Docente extends Lector {

    private int CodD;

    public Docente(int CodD, String Nombre, String Dirección, int Telefono) {
        super(Nombre, Dirección, Telefono);
        this.CodD = CodD;
    }

    public int getCodD() {
        return CodD;
    }

    public void reservarLibro(ArrayList<Libro> lb, ArrayList<Pedido> pd, ArrayList<Docente> dc, int CODL, boolean validacion) {

        Scanner sc = new Scanner(System.in);

        int i;
        boolean b = false;
        String e;
        String r;

        for (i = 0; i < lb.size(); i++) {

            if (lb.get(i).isDisponible() == true) {

                if (lb.get(i).getCODL() == CODL) {

                    b = true;
                    validacion = true;
                    lb.get(i).setDisponible(false);

                    System.out.println("");
                    System.out.println("Digite fecha de reserva dd/mm/aa");
                    r = sc.next();
                    System.out.println("");
                    System.out.println("Digite fecha de entrega dd/mm/aa");
                    e = sc.next();
                    System.out.println("");
                    System.out.println("Libro reservado");

                    pd.add(new Pedido(dc.get(i).getCodD(), lb.get(i).getBooktitle(), CODL, r, e));
                }
            }
        }
        if (b == false) {
            System.out.println("Libro no encontrado o no disponible");
        }
    }

    public void reservarRevista(ArrayList<Revista> rv, ArrayList<Pedido> pd, ArrayList<Docente> dc, int CODR, boolean validacion) {

        Scanner sc = new Scanner(System.in);

        int i;
        boolean b = false;
        String e;
        String r;

        for (i = 0; i < rv.size(); i++) {

            if (rv.get(i).isDisponible() == true) {

                if (rv.get(i).getCODR() == CODR) {

                    b = true;
                    validacion = true;

                    rv.get(i).setDisponible(false);

                    System.out.println("");
                    System.out.println("Digite fecha de reserva dd/mm/aa");
                    r = sc.next();
                    System.out.println("");
                    System.out.println("Digite fecha de entrega dd/mm/aa");
                    e = sc.next();
                    System.out.println("");
                    System.out.println("Revista reservada");
                    
                    pd.add(new Pedido(dc.get(i).getCodD(), rv.get(i).getMagazineTitle(), CODR, r, e));
                }
            }
        }
        if (b == false) {
            System.out.println("Revista no encontrada o no disponible");
        }
    }

    public void entregarLibro(ArrayList<Libro> lb, int CODL, boolean validacion) {

        int i;
        validacion = false;
        boolean r = false;

        for (i = 0; i < lb.size(); i++) {

            if (lb.get(i).isDisponible() == false) {

                if (lb.get(i).getCODL() == CODL) {

                    r = true;
                    validacion = true;

                    System.out.println("Libro entregado");
                    lb.get(i).setDisponible(true);
                }
            }
        }
        if (r == false) {
            System.out.println("Codigo incorrecto o Libro inexistente");
        }

    }

    public void entregarRevista(ArrayList<Revista> rv, int CODR, boolean validacion) {

        int i;
        validacion = false;
        boolean r = false;

        for (i = 0; i < rv.size(); i++) {

            if (rv.get(i).isDisponible() == false) {

                if (rv.get(i).getCODR() == CODR) {

                    r = true;
                    validacion = true;

                    System.out.println("Revista entregada");
                    rv.get(i).setDisponible(true);
                }
            }
        }
        if (r == false) {
            System.out.println("Codigo incorrecto o Revista inexistente");
        }

    }

    public void disponibilidadLibro(ArrayList<Libro> lb) {

        int i;
        boolean r = false;
        for (i = 0; i < lb.size(); i++) {

            if (lb.get(i).isDisponible() == true) {
                r = true;
                System.out.println("Libro : " + lb.get(i).getBooktitle());
                System.out.println("Autor : " + lb.get(i).getAutor());
                System.out.println("Tipo de libro : " + lb.get(i).getBooktype());
                System.out.println("Editorial: " + lb.get(i).getEditorial());
                System.out.println("");
            }
        }

        if (r == false) {
            System.out.println("No hay libros disponibles :( ");
        }
    }

    public void disponibilidadRevista(ArrayList<Revista> rv) {

        int i;
        boolean r = false;
        for (i = 0; i < rv.size(); i++) {

            if (rv.get(i).isDisponible() == true) {
                r = true;
                System.out.println("Libro : " + rv.get(i).getMagazineTitle());
                System.out.println("Autor : " + rv.get(i).getAutor());
                System.out.println("Tipo de libro : " + rv.get(i).getMagazineType());
                System.out.println("Editorial: " + rv.get(i).getEditorial());
                System.out.println("");
            }
        }

        if (r == false) {
            System.out.println("No hay libros disponibles :( ");
            System.out.println("");
        }
    }

}
