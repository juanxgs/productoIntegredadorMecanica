package cinematica.movimentohorizontal;
import java.util.Scanner;

public class Posicion {
    public static void calcular(Scanner abi){

        // Entradas
        System.out.print("Ingrese la posición inicial (x0) en metros: ");
        double x0 = abi.nextDouble();

        System.out.print("Ingrese la velocidad inicial (v0) en m/s: ");
        double v0 = abi.nextDouble();

        System.out.print("Ingrese la aceleración (a) en m/s²: ");
        double a = abi.nextDouble();

        System.out.print("Ingrese el tiempo (t) en segundos: ");
        double t = abi.nextDouble();

        // Cálculo de la posición
        double xt = x0 + v0 * t + 0.5 * a * t * t;

        // Resultados
        System.out.printf("La posición en t = %.2f segundos es: %.2f metros%n", t, xt);

    }
}
