package cinematica.movimentohorizontal;
import java.util.Scanner;

public class VelocidadFinal {
    public static void calcular(Scanner abi){
    /*
        Si se conocen el tiempo y la aceleración, se utiliza la fórmula v = v0 + at.
        Si se conocen la posición inicial, final y la aceleración, se utiliza la fórmula
        v^2 = v0^2 + 2a(x - x0).
     */
        // Entrada
        System.out.print("Ingrese la velocidad inicial (m/s): ");
        double v0 = abi.nextDouble();
        System.out.print("Ingrese la aceleración (m/s^2): ");
        double a = abi.nextDouble();
        System.out.print("Ingrese el tiempo (s): ");
        double t = abi.nextDouble();
        System.out.print("Ingrese la posición inicial (m): ");
        double x0 = abi.nextDouble();
        System.out.print("Ingrese la posición final (m): ");
        double x = abi.nextDouble();

        // Seleccionar la fórmula adecuada
        double vf;
        if (t != 0 && a != 0) {
            // Fórmula v = v0 + at
            vf = v0 + a * t;
        } else if (x != x0 && a != 0) {
            // Fórmula v^2 = v0^2 + 2a(x - x0)
            vf = Math.sqrt(v0 * v0 + 2 * a * (x - x0));
        } else {
            System.out.println("Datos insuficientes para calcular la velocidad final.");
            return;
        }

        // Mostrar el resultado
        System.out.println("La velocidad final es: " + vf + " m/s");

    }
}
