package cinematica.movimentohorizontal;
import java.util.Scanner;

public class Velocidad {
    public static void calcular(Scanner abi){

        // Entradas
        System.out.print("Ingrese la velocidad inicial (v0) en m/s: ");
        double v0 = abi.nextDouble();

        System.out.print("Ingrese la aceleración (a) en m/s²: ");
        double a = abi.nextDouble();

        System.out.print("Ingrese el tiempo (t) en segundos: ");
        double t = abi.nextDouble();

        // Cálculo de la velocidad
        double vt = v0 + a * t;

        // Resultados
        System.out.printf("La velocidad en t = %.2f segundos es: %.2f m/s%n", t, vt);

    }
}
