package cinematica.movimentoproyeccionhorizontal;
import java.util.Scanner;

public class TiempoVuelo {
    public static void calcular(Scanner abi){

        // Entradas
        System.out.print("Ingrese la altura inicial (y0) en metros: ");
        double y0 = abi.nextDouble();

        System.out.print("Ingrese la velocidad inicial (v0) en m/s: ");
        double v0 = abi.nextDouble();

        // Aceleración debida a la gravedad
        double g = 9.81;

        // Cálculo del tiempo de vuelo
        double t = Math.sqrt(2 * y0 / g);

        // Cálculo del alcance horizontal
        double R = v0 * t;

        // Resultados
        System.out.printf("El tiempo de vuelo es: %.2f segundos%n", t);
        System.out.printf("El alcance horizontal es: %.2f metros%n", R);

    }
}
