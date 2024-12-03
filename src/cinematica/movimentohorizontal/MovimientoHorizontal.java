package cinematica.movimentohorizontal;

import java.util.Scanner;

public class MovimientoHorizontal {
    public static void mostrarMenu(Scanner abi) {
        int opcion;
        do {
            System.out.println("**** MOVIMIENTO CON ACELERACION CONSTANTE ****");
            System.out.println("1. Posicion");
            System.out.println("2. Tiempo necesario para alcanzar una posicion determinada");
            System.out.println("3. Aceleracion");
            System.out.println("4. Velocidad final");
            System.out.println("5. Tiempo Velocidad final");
            System.out.println("0. Salir");
            System.out.print("Elige una opcion: ");
            opcion = abi.nextInt();

            switch (opcion) {
                case 1:
                    Posicion.calcular(abi);
                    break;
                case 2:
                    TiempoPosicion.calcular(abi);
                    break;
                case 3:
                    Aceleracion.calcular(abi);
                    break;
                case 4:
                    VelocidadFinal.calcular(abi);
                    break;
                case 5:
                    TiempoVelocidadFinal.calcular(abi);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida, intenta de nuevo.");
            }
        } while (opcion != 0);
    }
}
