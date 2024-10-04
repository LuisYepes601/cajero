
import java.util.Scanner;

public class Pricipal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opc = 0;
        Cliente cliente = new Cliente(new CuentaBancaria(), "luis");
        do {
            System.out.println("---- Menú ----");
            System.out.println("1.Depositar");
            System.out.println("2. Retirar");
            System.out.println("3.Cambio de Divisa");
            System.out.println("0.Salir");
            System.out.println("Ingresa una opción");
            opc = in.nextInt();
            switch (opc) {
                case 1:
                    cliente.depositar();
                    break;
                case 2:
                    cliente.retirar();
                    break;
                    case 3: 
                    cliente.cambioDivisa();
                    break;
                    case 0:
                    System.out.println("Gracias por visitarnos..");
                    break;

            }
        } while (opc != 0);

    }
}
