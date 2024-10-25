package cinematica.movimentoproyecciongeneral;
import java.util.Scanner;

public class ProyeccionGeneral {
    public static void calcular(Scanner abi){

        // Entradas
        System.out.print("Ingrese la velocidad inicial (v0) en m/s: ");
        double v0 = abi.nextDouble();

        System.out.print("Ingrese el ángulo de lanzamiento (theta) en grados: ");
        double theta = abi.nextDouble();

        double g = 9.81; // Aceleración debido a la gravedad en m/s²

        // Conversión a radianes
        double thetaRad = Math.toRadians(theta);

        // Componentes de la velocidad
        double v0x = v0 * Math.cos(thetaRad); // Componente horizontal
        double v0y = v0 * Math.sin(thetaRad); // Componente vertical

        // Tiempo de vuelo
        double tVuelo = (2 * v0y) / g;

        // Alcance horizontal
        double R = v0x * tVuelo;

        // Altura máxima
        double H = (v0y * v0y) / (2 * g);

        // Mostrar resultados
        System.out.printf("Tiempo de vuelo: %.2f s%n", tVuelo);
        System.out.printf("Alcance horizontal: %.2f m%n", R);
        System.out.printf("Altura máxima: %.2f m%n", H);

        // Posiciones en el tiempo
        System.out.println("\nPosiciones en diferentes instantes:");
        for (int i = 0; i <= 10; i++) { // Muestra posiciones cada segundo
            double t = i; // Tiempo en segundos
            double x = v0x * t; // Posición horizontal
            double y = v0y * t - 0.5 * g * t * t; // Posición vertical
            System.out.printf("t = %d s: x = %.2f m, y = %.2f m%n", i, x, y);
        }

    }
}
