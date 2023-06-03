
import clases.*;
import java.util.*;

public class APP2 {

    public static void mostrarDatos(ArrayList<cliente> cliente, int Ncuenta) {

        int i;
        boolean resultado = false;

        for (i = 0; i < cliente.size(); i++) {

            if (cliente.get(i).getNcuenta() == Ncuenta) {
                resultado = true;
            }
            if (resultado == true) {

                System.out.println("Numero de cuenta : " + cliente.get(i).getNcuenta());
                System.out.println("Nombre del cliente : " + cliente.get(i).getNombre());
                System.out.println("Saldo : " + cliente.get(i).getScuenta());
                System.out.println("");

            } else {

                System.out.println("Número de cuenta no válido");
                System.out.println("");
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        banquero bq = new banquero("bnq012", "banquero*7895", 1044603798, "Ellery", "Ricaurte");
        ArrayList<cliente> cliente = new ArrayList<cliente>();

        int opc = 0;
        int MC = 0;
        int MB = 0;
        int Ncuenta;
        double Scuenta;
        Boolean resultado = false;

        do {

            System.out.println("");
            System.out.println("Ingresa como:");
            System.out.println("1.Banquero");
            System.out.println("2.Cliente");
            System.out.println("3.Salir");
            opc = sc.nextInt();

            switch (opc) {

                case 1:

                    System.out.println("Ingrese su usuario");
                    String user = sc.next();
                    System.out.println("");

                    if (bq.getUser().equals(user)) {

                        System.out.println("Ingrese su contraseña");
                        String password = sc.next();
                        System.out.println("");

                        if (bq.getPassword().equals(password)) {

                            System.out.println("Ingreso exitoso");
                            System.out.println("");

                            do {
                                
                                System.out.println("");
                                System.out.println("Menu banquero");
                                System.out.println("1.Registrar nuevo Usuario");
                                System.out.println("2.Consignar dinero");
                                System.out.println("3.Salir");
                                MB = sc.nextInt();

                                if (MB == 1) {

                                    System.out.println("");
                                    System.out.println("Ingrese el número de cuenta a registrar");
                                    Ncuenta = sc.nextInt();

                                    for (int i = 0; i < cliente.size(); i++) {

                                        if (cliente.get(i).getNcuenta() == Ncuenta) {
                                            resultado = true;
                                        }
                                    }

                                    if (resultado == true) {

                                        System.out.println("Número de cuenta no válido");

                                    } else {

                                        System.out.println("Ingrese numero de cedula");
                                        int cedula = sc.nextInt();
                                        System.out.println("Ingrese nombre del cliente");
                                        String nombre = sc.next();
                                        System.out.println("");
                                        System.out.println("Ingrese apellido del cliente");
                                        String apellido = sc.next();
                                        System.out.println("");
                                        System.out.println("Ingrese saldo inicial");
                                        Scuenta = sc.nextDouble();
                                        System.out.println("");

                                        cliente.add(new cliente(Ncuenta, Scuenta, cedula, nombre, apellido));
                                        System.out.println("Cuenta registrada correctamente");
                                        System.out.println("");
                                        mostrarDatos(cliente, Ncuenta);

                                    }
                                }

                                if (MB == 2) {
                                    int i;

                                    System.out.println("Ingrese numero de cuenta a depositar");
                                    Ncuenta = sc.nextInt();
                                    resultado = false;

                                    for (i = 0; i < cliente.size(); i++) {

                                        if (cliente.get(i).getNcuenta() == Ncuenta) {
                                            resultado = true;
                                        }
                                        if (resultado == true) {

                                            System.out.println("Ingrese el monto a depositar");
                                            double MD = sc.nextDouble();

                                            cliente.get(i).setScuenta(cliente.get(i).getScuenta() + MD);

                                            System.out.println("Monto registrado");
                                            mostrarDatos(cliente, Ncuenta);

                                        } else {
                                            System.out.println("Número de cuenta no válido");
                                        }
                                    }

                                }

                            } while (MB != 3);

                        } else {
                            System.out.println("Contraseña incorrecta");
                        }
                    } else {

                        System.out.println("Usuario no encontrado");
                    }

                    break;

                case 2:
                    int i;
                    do {

                        System.out.println("Menu cliente");
                        System.out.println("1.Retirar");
                        System.out.println("2.Consultar");
                        System.out.println("3.Salir");
                        MC = sc.nextInt();

                        if (MC == 1) {

                            System.out.println("Ingrese el numero de cuenta");
                            Ncuenta = sc.nextInt();

                            resultado = false;
                            for (i = 0; i < cliente.size(); i++) {

                                if (cliente.get(i).getNcuenta() == Ncuenta) {
                                    resultado = true;
                                }
                            }

                            if (resultado == true) {

                                System.out.println("¿Cuanto dinero desea retirar?");
                                double DR = sc.nextDouble();

                                for (i = 0; i < cliente.size(); i++) {

                                    if (cliente.get(i).getNcuenta() == Ncuenta) {
                                        resultado = true;
                                    }
                                    if (resultado == true) {

                                        if (cliente.get(i).getScuenta() >= DR) {

                                            cliente.get(i).setScuenta(cliente.get(i).getScuenta() - DR);
                                            mostrarDatos(cliente, Ncuenta);
                                        }

                                        if (cliente.get(i).getScuenta() < DR) {

                                            System.out.println("Saldo insuficiente para retirar");
                                            System.out.println("");
                                        }
                                    }
                                }
                            }
                        }

                        if (MC == 2) {
                            System.out.println("Ingrese su numero de cuenta para poder consultar");
                            Ncuenta = sc.nextInt();

                            resultado = false;
                            for (i = 0; i < cliente.size(); i++) {

                                if (cliente.get(i).getNcuenta() == Ncuenta) {
                                    resultado = true;
                                }

                                if (resultado == true) {

                                    mostrarDatos(cliente, Ncuenta);

                                }

                            }
                            if (resultado == false) {
                                System.out.println("Usuario no encontrado");
                                System.out.println("");
                            }
                        }

                    } while (MC != 3);
                    break;
            }

        } while (opc != 3);
    }

}
