package cinematica.movimentovertical;
import cinematica.movimentohorizontal.*;

import java.util.Scanner;

public class MovimientoVertical {
    public static void mostrarMenu(Scanner abi) {
        int opcion;
        do {
            System.out.println("**** MOVIMIENTO VERTICAL (CAIDA LIBRE) ****");
            System.out.println("(v0)Positivo: Lanzamiento hacia arriba \n" +
                            "(v0)Negativo: Lanzamiento hacia abajo.");
            System.out.println("1. Posicion en un momento dado");
            System.out.println("2. Velocidad en un momento dado");
            System.out.println("3. Tiempo necesario para alcanzar una posicion determinada");
            System.out.println("4. Aceleracion");
            System.out.println("5. Velocidad final");
            System.out.println("6. Tiempo Velocidad final");
            System.out.println("0. Salir");
            System.out.print("Elige una opcion: ");
            opcion = abi.nextInt();

            switch (opcion) {
                case 1:
                    Posicion.calcular(abi);
                    break;
                case 2:
                    Velocidad.calcular(abi);
                    break;
                case 3:
                    TiempoPosicion.calcular(abi);
                    break;
                case 4:
                    Aceleracion.calcular(abi);
                    break;
                case 5:
                    VelocidadFinal.calcular(abi);
                    break;
                case 6:
                    TiempoVelocidadFinal.calcular(abi);
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida, intenta de nuevo.");
            }
        } while (opcion != 0);
    }
}
