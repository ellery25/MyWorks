package olimpiadasdeportivas;

import java.util.*;

/**
 *
 * @author salacomputocentro.ba
 */
public class OlimpiadasDeportivas {

    public static void main(String[] args) {

        int opc = 0;
        int opcS = 0;

        Scanner sc = new Scanner(System.in);

        //Deportes//
        Deporte Futbol = new Deporte("Futbol", 01);
        Deporte Baloncesto = new Deporte("Baloncesto", 02);
        Deporte Natacion = new Deporte("Natacion", 03);
        Deporte Voleiball = new Deporte("Voleiball", 04);
        Deporte Baseball = new Deporte("Baseball", 05);

        ArrayList<Deporte> DeportesA = new ArrayList();
        DeportesA.add(Futbol);
        DeportesA.add(Baloncesto);
        DeportesA.add(Voleiball);
        DeportesA.add(Baseball);

        ArrayList<Deporte> DeportesB = new ArrayList();
        DeportesB.add(Voleiball);
        DeportesB.add(Baseball);
        DeportesB.add(Natacion);
        DeportesB.add(Futbol);

        //Jefes_Complejo//
        Jefe Antonio = new Jefe(01, "Antonio", "Banderas");
        Jefe Enrique = new Jefe(02, "Enrique", "Gonzales");
        Jefe Alejandro = new Jefe(03, "Alejandro", "Zapata");
        Jefe Sebastian = new Jefe(04, "Sebastian", "Castellanos");
        Jefe Juan = new Jefe(05, "Juan", "Cuadrado");
        Jefe Adolfo = new Jefe(06, "Adolfo", "Hernandez");

        //Areas Designadas Para Polideportivos//
        ArrayList<AreaDesignada> PolideportivoA = new ArrayList();

        ArrayList<AreaDesignada> PolideportivoB = new ArrayList();

        PolideportivoA.add(new AreaDesignada("Norte", Futbol));
        PolideportivoA.add(new AreaDesignada("sur", Baloncesto));
        PolideportivoA.add(new AreaDesignada("Oeste", Voleiball));
        PolideportivoA.add(new AreaDesignada("Este", Baseball));

        PolideportivoB.add(new AreaDesignada("Norte", Voleiball));
        PolideportivoB.add(new AreaDesignada("sur", Baseball));
        PolideportivoB.add(new AreaDesignada("Oeste", Natacion));
        PolideportivoB.add(new AreaDesignada("Este", Futbol));

        //Complejos//
        Unideportivo SoccerA = new Unideportivo(Futbol, 01, 01, Antonio, "Barranquilla", 1500, null, null);
        Unideportivo BasketA = new Unideportivo(Baloncesto, 01, 02, Enrique, "Barranquilla", 1500, null, null);

        Unideportivo BaseballB = new Unideportivo(Baseball, 02, 01, Alejandro, "Cartagena", 1000, null, null);
        Unideportivo VoleiballB = new Unideportivo(Voleiball, 02, 02, Sebastian, "Cartagena", 1000, null, null);

        Polideportivo A = new Polideportivo(PolideportivoA, DeportesA, 01, 03, Juan, "Barranquilla", 2000, null, null);
        Polideportivo B = new Polideportivo(PolideportivoB, DeportesB, 02, 03, Adolfo, "Cartagena", 2000, null, null);

        ArrayList<Unideportivo> ComplejosA = new ArrayList();

        ComplejosA.add(SoccerA);
        ComplejosA.add(BasketA);

        ArrayList<Polideportivo> ComplejospA = new ArrayList();

        ComplejospA.add(A);

        ArrayList<Unideportivo> ComplejosB = new ArrayList();

        ComplejosB.add(BaseballB);
        ComplejosB.add(VoleiballB);

        ArrayList<Polideportivo> ComplejospB = new ArrayList();

        ComplejospB.add(B);

        //Sede//
        Sede SedeA = new Sede(01, ComplejosA.size(), 1500000, ComplejosA, ComplejospA);
        Sede SedeB = new Sede(02, ComplejosB.size(), 1000000, ComplejosB, ComplejospB);

        ArrayList<Sede> Sedes = new ArrayList();

        Sedes.add(SedeA);
        Sedes.add(SedeB);

        //Equipamiento//
        ArrayList<Equipamiento> eqp = new ArrayList();

        //Eventos//
        ArrayList<Evento> ev = new ArrayList();

        do {

            System.out.println("BIENVENIDO");
            System.out.println("1.Mostrar Sedes");
            System.out.println("2.Administrar Sedes");
            System.out.println("3.Salir");
            opc = sc.nextInt();

            switch (opc) {

                case 1:

                    for (int i = 0; i < Sedes.size(); i++) {

                        System.out.println("");
                        System.out.println("Numero de sede: " + Sedes.get(i).getNsede());

                        if (Sedes.get(i).getUnideportivo() == null) {

                            System.out.println("Cantidad de complejos: " + Sedes.get(i).getPolideportivo().size());

                        } else if (Sedes.get(i).getPolideportivo() == null) {

                            System.out.println("Cantidad de complejos: " + Sedes.get(i).getUnideportivo().size());

                        } else {
                            System.out.println("Cantidad de complejos: " + (Sedes.get(i).getUnideportivo().size() + Sedes.get(i).getPolideportivo().size()));
                        }

                        System.out.println("Presupuesto de la sede: " + Sedes.get(i).getPresupuesto());
                        System.out.println("");
                    }

                    break;

                case 2:

                    System.out.println("Ingrese el numero de la sede");
                    int nsede = sc.nextInt();

                    for (int i = 0; i < Sedes.size(); i++) {

                        if (nsede == Sedes.get(i).getNsede()) {

                            do {

                                System.out.println("");
                                System.out.println("Menu Sede " + nsede);
                                System.out.println("1.Mostrar complejos Unideportivos");
                                System.out.println("2.Mostrar complejos Polideportivos");
                                System.out.println("3.Asignar evento a un complejo");
                                System.out.println("4.Mostrar informacion de eventos");
                                System.out.println("5.Asignar mantenimiento a un complejo");
                                System.out.println("6.Mostrar lista Evento-Comisario");
                                System.out.println("7.Salir");
                                System.out.println("");
                                opcS = sc.nextInt();

                                switch (opcS) {

                                    case 1:

                                        if (Sedes.get(nsede).getUnideportivo() == null) {

                                            System.out.println("No hay complejos Unideportivos en esta sede");

                                        } else {

                                            for (int e = 0; e < Sedes.get(nsede).getUnideportivo().size(); e++) {

                                                System.out.println("");
                                                System.out.println("Numero de complejo: " + Sedes.get(nsede).getUnideportivo().get(e).getNcomplejo());
                                                System.out.println("Localizacion: " + Sedes.get(nsede).getUnideportivo().get(e).getLocalizacion());
                                                System.out.println("Area Ocupada: " + Sedes.get(nsede).getUnideportivo().get(e).getAreaO());
                                                System.out.println("Jefe de complejo: " + Sedes.get(nsede).getUnideportivo().get(e).getJefe().getNombre());
                                                System.out.println("Deporte: " + Sedes.get(nsede).getUnideportivo().get(e).getDeporte().getDeporte());
                                                System.out.println("Numero de deporte : " + Sedes.get(nsede).getUnideportivo().get(e).getDeporte().getNdeporte());

                                                if (Sedes.get(nsede).getUnideportivo().get(e).getMantenimiento() == null) {

                                                    System.out.println("Mantenimiento: Este complejo no tiene mantenimiento");

                                                } else {

                                                    System.out.println("Mantenimiento: " + Sedes.get(nsede).getUnideportivo().get(e).getMantenimiento().getLmantenimiento());

                                                }

                                                for (int q = 0; q < Sedes.get(nsede).getUnideportivo().size(); q++) {

                                                    if (Sedes.get(nsede).getUnideportivo().get(q).getEvento() == null) {

                                                        System.out.println("Evento: Este complejo no tiene eventos actuales");

                                                    } else {

                                                        System.out.println("Evento: " + Sedes.get(nsede).getUnideportivo().get(q).getEvento().get(q).getNameEvento());
                                                        
                                                    }
                                                }

                                            }

                                        }

                                        break;

                                    case 2:

                                        if (Sedes.get(nsede).getPolideportivo() == null) {

                                            System.out.println("No hay polideportivos en esta sede");

                                        } else {

                                            for (int e = 0; e < Sedes.get(nsede).getPolideportivo().size(); e++) {

                                                System.out.println("");
                                                System.out.println("Numero de complejo: " + Sedes.get(nsede).getPolideportivo().get(e).getNcomplejo());
                                                System.out.println("Localizacion: " + Sedes.get(nsede).getPolideportivo().get(e).getLocalizacion());
                                                System.out.println("Area Ocupada: " + Sedes.get(nsede).getPolideportivo().get(e).getAreaO());
                                                System.out.println("Jefe de complejo: " + Sedes.get(nsede).getPolideportivo().get(e).getJefe().getNombre());
                                                System.out.println("Deportes del complejo: ");

                                                for (int p = 0; p < Sedes.get(nsede).getPolideportivo().get(e).Ldeporte.size(); p++) {

                                                    System.out.println(Sedes.get(nsede).getPolideportivo().get(e).getLdeporte().get(p).getDeporte());

                                                }

                                                for (int a = 0; a < Sedes.get(nsede).getPolideportivo().get(e).getAreaDesignada().size(); a++) {

                                                    System.out.println("Area Designada: " + Sedes.get(nsede).getPolideportivo().get(e).getAreaDesignada().get(a).getLocalizacion() + ", Deporte: " + Sedes.get(nsede).getPolideportivo().get(e).getAreaDesignada().get(a).getDeporte().getDeporte());

                                                }

                                            }

                                        }

                                        break;

                                    case 3:

                                        System.out.println("");
                                        System.out.println("Ingrese el número de complejo a editar");
                                        int NC = sc.nextInt();

                                        for (int u = 0; u < Sedes.get(nsede).getNcomplejo(); u++) {

                                            if (NC == Sedes.get(nsede).getUnideportivo().get(u).getNcomplejo()) {

                                                System.out.println("Ingrese la cantidad de objetos para el equipamiento");

                                                int o = sc.nextInt();
                                                int c = 0;

                                                for (c = 0; c < o; c++) {

                                                    System.out.println("Ingrese un objeto del equipamiento");
                                                    String E = sc.next();

                                                    eqp.add(new Equipamiento(E));
                                                }

                                                System.out.println("Ingrese el nombre del evento");
                                                String nameevento = sc.next();
                                                System.out.println("Ingrese el numero de comisarios del evento");
                                                int NComisarios = sc.nextInt();
                                                System.out.println("Ingrese el numero de participantes del evento");
                                                int Nparticipantes = sc.nextInt();
                                                System.out.println("Ingrese la duracion del evento");
                                                int Duracion = sc.nextInt();
                                                System.out.println("Ingrese la fecha del evento");
                                                String fecha = sc.next();

                                                ev.add(new Evento(nameevento, NComisarios, Nparticipantes, Duracion, fecha, eqp));

                                            }
                                            
                                            Sedes.get(nsede).getUnideportivo().get(u).setEvento(ev);

                                        }

                                        break;
                                }

                            } while (opcS != 7);

                        }

                    }

            }

        } while (opc != 3);

    }

}
