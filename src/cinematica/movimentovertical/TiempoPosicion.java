package cinematica.movimentovertical;
import java.util.Scanner;

public class TiempoPosicion {
    public static void calcular(Scanner abi){

        // Entradas
        System.out.print("Ingrese la posición inicial (y0) en metros: ");
        double y0 = abi.nextDouble();

        System.out.print("Ingrese la velocidad inicial (v0) en m/s: ");
        double v0 = abi.nextDouble();

        System.out.print("Ingrese la aceleración debida a la gravedad (g) en m/s²: ");
        double g = abi.nextDouble();

        System.out.print("Ingrese la posición final (y) en metros: ");
        double y = abi.nextDouble();

        // Coeficientes de la ecuación cuadrática
        double a = -0.5 * g;
        double b = v0;
        double c = y0 - y;

        // Cálculo del discriminante
        double discriminante = b * b - 4 * a * c;

        if (discriminante < 0) {
            System.out.println("No hay soluciones reales para el tiempo.");
        } else {
            // Cálculo de las dos soluciones
            double t1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double t2 = (-b - Math.sqrt(discriminante)) / (2 * a);

            // Resultados
            System.out.printf("El tiempo necesario para alcanzar la posición %.2f metros es: %.2f segundos (solución 1)%n", y, t1);
            System.out.printf("El tiempo necesario para alcanzar la posición %.2f metros es: %.2f segundos (solución 2)%n", y, t2);
        }

    }
}
