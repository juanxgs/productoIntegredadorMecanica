package cinematica.movimentovertical;
import java.util.Scanner;
public class Posicion {
    public static void calcular(Scanner abi){

        // Entradas
        System.out.print("Ingrese la posición inicial (y0) en metros: ");
        double y0 = abi.nextDouble();

        System.out.print("Ingrese la velocidad inicial (v0) en m/s: ");
        double v0 = abi.nextDouble();

        System.out.print("Ingrese el tiempo (t) en segundos: ");
        double t = abi.nextDouble();

        // Aceleración debida a la gravedad
        double g = 9.81;

        // Cálculo de la posición
        double y = y0 + v0 * t - 0.5 * g * t * t;

        // Resultados
        System.out.printf("La posición en t = %.2f segundos es: %.2f metros%n", t, y);

    }
}
