package cinematica.movimentoproyeccionhorizontal;

import java.util.Scanner;

public class MovimientoProyeccionHorizontal {
    public static void mostarMenu(Scanner abi){
        int opcion;
        do {
            System.out.println("**** Movimiento Proyeccion Horizontal ****");
            System.out.println("1. Velocidad y angulo");
            System.out.println("2. Tiempo de vuelo y distancia");
            System.out.println("0. Salir");
            System.out.print("Elige una opcion: ");
            opcion = abi.nextInt();

            switch (opcion) {
                case 1:
                    Velocidad.calcular(abi);
                    break;
                case 2:
                    TiempoVuelo.calcular(abi);
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida, intenta de nuevo.");
            }
        } while (opcion != 0);
    }
}
