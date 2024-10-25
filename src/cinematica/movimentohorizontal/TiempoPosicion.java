package cinematica.movimentohorizontal;
import java.util.Scanner;

public class TiempoPosicion {

    public static void calcular(Scanner abi){

        // Entradas
        System.out.print("Ingrese la posición inicial (x0) en metros: ");
        double x0 = abi.nextDouble();

        System.out.print("Ingrese la velocidad inicial (v0) en m/s: ");
        double v0 = abi.nextDouble();

        System.out.print("Ingrese la aceleración (a) en m/s²: ");
        double a = abi.nextDouble();

        System.out.print("Ingrese la posición final (x) en metros: ");
        double x = abi.nextDouble();

        // Cálculo del tiempo necesario para alcanzar la posición x
        double tiempo = (Math.sqrt(v0 * v0 + 2 * a * (x - x0)) - v0) / a;

        // Resultados
        System.out.printf("El tiempo necesario para alcanzar la posición %.2f metros es: %.2f segundos%n", x, tiempo);

    }
}
