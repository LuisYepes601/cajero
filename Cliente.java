
import java.util.Scanner;

public class Cliente {

    private String nombre;
    private CuentaBancaria cuenta;

    Scanner in = new Scanner(System.in);

    public Cliente(CuentaBancaria cuenta, String nombre) {
        this.cuenta = new CuentaBancaria();
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CuentaBancaria getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    public void depositar() {
        System.out.println("INGRESA LA CANTIDAD A DEPOSITAR");
        double cantidad = in.nextDouble();
        cuenta.setMonto(cuenta.getMonto() + cantidad);
       
        mostrarInformacion();
    }

    public void mostrarInformacion() {
        System.out.println("\n---------------------------------------------\n");
        System.out.println("Información de su cuenta despues de la transacción");
        System.out.println("Numero de cuenta: " + cuenta.getNumero());
        System.out.println("Nombre del cliente: " + this.nombre);
        System.out.println("Saldo disponible: " + cuenta.getMonto());
        System.out.println("\n---------------------------------------------\n");
    }

    public void retirar() {
        int opc = 0;
        if (validarMonto() == true) {
            System.out.println("Ingrese la cantidad a retirar");
            double monto = in.nextDouble();
            if (cuenta.getMonto() < monto) {
                System.out.println("Su cuenta no tiene sufieciente saldo. Lo invitamos a recargar su cuenta.");
                System.out.println("Saldo de su cuenta:");
                System.out.println(cuenta.getMonto());
            } else if (cuenta.getMonto() >= monto) {
                cuenta.setMonto(cuenta.getMonto() - monto);
                System.out.println("Quiere hacer una donación a una fundación");
                System.out.println("1.Si");
                System.out.println("2.No");
                opc = in.nextInt();
                if (cuenta.getMonto() > 1000) {
                    if (opc == 1) {
                        System.out.println("Puedes contribuir al hogar de un niño con hambre desde las siguientes cantidades.");
                        System.out.println("1. 1000 $");
                        System.out.println("2. 10.000 $");
                        System.out.println("3. 20.000 $");
                        System.out.println("4. 50.000 $");
                        System.out.println("5. Mas de 50.000");
                        System.out.println("Ingrese una opción");
                        opc = in.nextInt();

                        switch (opc) {
                            case 1:
                                if (cuenta.getMonto() >= 1000) {
                                    cuenta.setMonto(cuenta.getMonto() - 1000);
                                    System.out.println("Gracias por su colaboración que contribuye a mas niños felices..");

                                } else {
                                    System.out.println("Saldo no disponible");
                                }
                                break;

                            case 2:
                                if (cuenta.getMonto() >= 10000) {
                                    cuenta.setMonto(cuenta.getMonto() - 10000);
                                    System.out.println("Gracias por su colaboración que contribuye a mas niños felices..");
                                    System.out.println("Saldo no disponible. Recargue su cuenta o esoga otra opción");
                                    break;
                                } else {

                                }
                            case 3:
                                if (cuenta.getMonto() >= 20000) {
                                    cuenta.setMonto(cuenta.getMonto() - 20000);
                                    System.out.println("Gracias por su colaboración que contribuye a mas niños felices..");
                                } else {
                                    System.out.println("Saldo no disponible. Recargue su cuenta o esoga otra opción");

                                }
                                break;
                            case 4:
                                if (cuenta.getMonto() >= 5000) {
                                    cuenta.setMonto(cuenta.getMonto() - 50000);
                                    System.out.println("Gracias por su colaboración que contribuye a mas niños felices..");
                                } else {
                                    System.out.println("Saldo no disponible. Recargue su cuenta o esoga otra opción");

                                }
                                break;
                            case 5:
                                System.out.println("Ingresa la cantidad a donar");
                                int cant = in.nextInt();
                                if (cuenta.getMonto() > cant) {

                                    cuenta.setMonto(cuenta.getMonto() - cant);
                                    System.out.println("Gracias por su colaboración que contribuye a mas niños felices..");
                                }

                                break;
                            default:
                                break;
                        }
                    } else {
                        System.out.println("Gracias por su respuesta.");
                    }
                } else {
                    System.out.println("Saldo no disponible para la cantidad minina(1000$)");
                }
                mostrarInformacion();
            }

        } else {
            System.out.println("Su cuenta no tiene saldo. Lo invitamos a recargar su cuenta.");
            System.out.println("Saldo de su cuenta:");
            System.out.println(cuenta.getMonto());
        }
    }

    public boolean validarMonto() {
        return cuenta.getMonto() > 0;
    }

    public void cambioDivisa() {
        int opc = 0;
        System.out.println("\n---------------------------------------------\n");
        System.out.println("Ingrese una opcion de cambio");
        System.out.println("1.Dolares");
        System.out.println("2.Pesos mexicanos");
        System.out.println("3.Euros");
        System.out.println("4.Salir");
        System.out.println("\n---------------------------------------------\n");
        opc = in.nextInt();

        if (validarMonto());
        {
            if (opc == 1) {
                double monto = cuenta.getMonto() / 4000;
                System.out.println("\n---------------------------------------------\n");
                System.out.println("La conversión de COP a US le da un total de " + monto + " Dolares");
                System.out.println("\n---------------------------------------------\n");
            } else if (opc == 3) {
                System.out.println("\n---------------------------------------------\n");
                double monto = cuenta.getMonto() / 4300;
                System.out.println("La conversión de COP a EU le da un total de " + monto + " Euros");
                System.out.println("\n---------------------------------------------\n");
            } else if (opc == 2) {
                double monto = cuenta.getMonto() / 20;
                System.out.println("\n---------------------------------------------\n");
                System.out.println("La conversión de COP a MEX le da un total de " + monto + " Pesos Mexicanos");
                System.out.println("\n---------------------------------------------\n");
            } else {
                System.out.println("\n---------------------------------------------\n");
                System.out.println("Opción no valida");
            }

        }

    }

}
