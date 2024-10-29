package cinematica.movimentoproyeccionhorizontal;
import vectores.cuadrantes.CuadrantesYAngulos;
import java.util.Scanner;

public class Velocidad {
    public static void calcular(Scanner abi){

        // Entradas
        System.out.print("Ingrese la altura inicial (y0) en metros: ");
        double y0 = abi.nextDouble();

        System.out.print("Ingrese la velocidad inicial (v0) en m/s: ");
        double v0 = abi.nextDouble();

        // Gravedad
        double g = 9.81;

        // Calculo
        double vx = Math.sqrt(2 * g * y0);
        double vr = Math.sqrt(v0 * v0 + vx * vx);
        double angulo = vx/v0;
        double result = Math.toDegrees(Math.atan(angulo));

        System.out.printf("La velocidad con que golpea el piso: %.2f m/s%n", vr);
        System.out.printf("Angulo de golpeo: %.2f grados%n", result);
    }
}
