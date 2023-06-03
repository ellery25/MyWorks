package clases;

import clases.*;
import java.util.*;

public class APP {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bibliotecario bb = new Bibliotecario(123, "Luis", "Kra 45#58-30", 3496547);
        ArrayList<Docente> dc = new ArrayList<>();
        ArrayList<Estudiante> est = new ArrayList<>();
        ArrayList<Libro> lb = new ArrayList<>();
        ArrayList<Revista> rv = new ArrayList<>();
        ArrayList<Pedido> pd = new ArrayList<>();

        lb.add(new Libro(1, "El_coronel_no_tiene_quien_le_escriba", "Literatura", "Gabriel Garcia Marquez", "Si", true));
        lb.add(new Libro(2, "Programacion_orientada_a_objetos", "Programacion", "Ellery", "Si", true));
        rv.add(new Revista(1, "Thrasher_Magazine", "Deportes", "ThrasherSB", "SB", true));
        rv.add(new Revista(2, "Semana", "Comedia", "No sé", "No sé", true));
        dc.add(new Docente(123, "Edwin", "Calle 43#31-33", 3708447));
        est.add(new Estudiante(12345, "Ellery", "Calle 43#31-33", 315677));

        int opc = 0;
        int opcE = 0;
        int opcD = 0;
        int opcB = 0;
        String r;
        String e;
        String eB;

        do {
            
            System.out.println("");
            System.out.println("Menu");
            System.out.println("Ingresa como:");
            System.out.println("1.Estudiante");
            System.out.println("2.Docente");
            System.out.println("3.Bibliotecario");
            System.out.println("4.Salir");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    
                    System.out.println("");
                    System.out.println("Ingrese su codigo de estudiante");
                    int icodE = sc.nextInt();

                    for (int i = 0; i < est.size(); i++) {

                        if (est.get(i).getCodE() == icodE) {
                            System.out.println("");
                            System.out.println("Ingreso Exitoso");
                            System.out.println("Hola " + est.get(i).getNombre());
                            System.out.println("");

                            do {
                                
                                System.out.println("");
                                System.out.println("Menu Estudiante");
                                System.out.println("1.Reservar Libro");
                                System.out.println("2.Reservar Revista");
                                System.out.println("3.Entregar Libro");
                                System.out.println("4.Entregar Revista");
                                System.out.println("5.Disponibilidad de Libros");
                                System.out.println("6.Disponibilidad de Revistas");
                                System.out.println("7.Salir");
                                opcE = sc.nextInt();

                                switch (opcE) {

                                    case 1:

                                        boolean valid = false;

                                        System.out.println("Ingrese codigo del libro");
                                        int CODL = sc.nextInt();

                                        est.get(i).reservarLibro(lb, pd, est, CODL, valid);

                                        break;

                                    case 2:

                                        valid = false;

                                        System.out.println("Ingrese el codigo de la revista");
                                        int CODRV = sc.nextInt();

                                        est.get(i).reservarRevista(rv, pd, est, CODRV, valid);

                                        break;

                                    case 3:

                                        valid = false;

                                        System.out.println("Ingrese el codigo del libro");
                                        int ECODL = sc.nextInt();

                                        est.get(i).entregarLibro(lb, ECODL, valid);

                                        break;

                                    case 4:

                                        valid = false;

                                        System.out.println("Ingrese el codigo de la revista");
                                        int ECODR = sc.nextInt();

                                        est.get(i).entregarRevista(rv, ECODR, valid);

                                        break;
                                    case 5:

                                        est.get(i).disponibilidadLibro(lb);
                                        break;

                                    case 6:
                                        est.get(i).disponibilidadRevista(rv);
                                        break;

                                    default:
                                        opcE = 7;
                                }

                            } while (opcE != 7);
                        }
                    }
                    break;
                case 2:

                    System.out.println("Ingrese su codigo de docente");
                    int icodD = sc.nextInt();

                    for (int i = 0; i < dc.size(); i++) {

                        if (dc.get(i).getCodD() == icodD) {
                            System.out.println("");
                            System.out.println("Ingreso exitoso");
                            System.out.println("Hola " + dc.get(i).getNombre());
                            System.out.println("");

                            do {

                                System.out.println("Menu docente");
                                System.out.println("1.Reservar Libro");
                                System.out.println("2.Reservar Revista");
                                System.out.println("3.Entregar Libro");
                                System.out.println("4.Entregar Revista");
                                System.out.println("5.Disponibilidad de Libros");
                                System.out.println("6.Disponibilidad de Revistas");
                                System.out.println("");
                                opcD = sc.nextInt();

                                switch (opcD) {
                                    case 1:

                                        boolean valid = false;

                                        System.out.println("Ingrese codigo del libro");
                                        int CODL = sc.nextInt();

                                        dc.get(i).reservarLibro(lb, pd, dc, CODL, valid);

                                        break;

                                    case 2:

                                        valid = false;

                                        System.out.println("Ingrese el codigo de la revista");
                                        int CODRV = sc.nextInt();

                                        dc.get(i).reservarRevista(rv, pd, dc, CODRV, valid);

                                        break;

                                    case 3:

                                        valid = false;

                                        System.out.println("Ingrese el codigo del libro");
                                        int ECODL = sc.nextInt();

                                        dc.get(i).entregarLibro(lb, ECODL, valid);

                                        break;

                                    case 4:

                                        valid = false;

                                        System.out.println("Ingrese el codigo de la revista");
                                        int ECODR = sc.nextInt();

                                        dc.get(i).entregarRevista(rv, ECODR, valid);

                                        break;

                                    case 5:

                                        dc.get(i).disponibilidadLibro(lb);
                                        break;

                                    case 6:
                                        dc.get(i).disponibilidadRevista(rv);
                                        break;

                                    default:
                                        opcD = 7;
                                }
                            } while (opcD != 7);
                        }
                    }

                    break;
                case 3:

                    int IDB;

                    System.out.println("Ingrese el ID de bibliotecario");
                    IDB = sc.nextInt();

                    if (IDB == bb.getPersonalID()) {

                        System.out.println("");
                        System.out.println("Ingreso exitoso, Hola " + bb.getNombre());
                        System.out.println("");
                        
                        do {
                            
                            System.out.println("Menu Bibliotecario");
                            System.out.println("1.Mostrar todos los pedidos");
                            System.out.println("2.Filtrar pedido por fecha de reserva");
                            System.out.println("3.Salir");
                            opcB = sc.nextInt();
                            
                            switch (opcB) {
                                
                                case 1:
                                    
                                    bb.mostrarPedidos(pd);
                                    break;
                                    
                                case 2:
                                    
                                    System.out.println("Ingrese la fecha de reserva  dd/mm/aa");
                                    eB = sc.next();
                                    System.out.println("");
                                    
                                    bb.mostrarPedidoFecha(pd, eB);
                                    
                                    break;
                                    
                                default:
                                    opcB = 3;
                            }
                            
                        } while(opcB != 3);
                    }

                    break;
                default:
                    System.out.println("Opcion incorrecta, ingrese una opcion valida");
            }

        } while (opc != 4);
    }

}
