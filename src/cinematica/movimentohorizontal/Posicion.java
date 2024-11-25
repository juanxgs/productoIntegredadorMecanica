package cinematica.movimentohorizontal;
import java.util.Scanner;

public class Posicion {
    public static void calcular(Scanner abi){

        // Solicitar datos al usuario
        System.out.print("Ingrese la posición inicial (m): ");
        double x0 = abi.nextDouble();
        System.out.print("Ingrese la velocidad inicial (m/s): ");
        double v0 = abi.nextDouble();
        System.out.print("Ingrese la aceleración (m/s^2): ");
        double a = abi.nextDouble();
        System.out.print("Ingrese el tiempo (s): ");
        double t = abi.nextDouble();

        // Calcular la posición final
        double x = x0 + v0 * t + 0.5 * a * t * t;

        // Mostrar el resultado
        System.out.println("La posición final es: " + x + " m");

    }
}
