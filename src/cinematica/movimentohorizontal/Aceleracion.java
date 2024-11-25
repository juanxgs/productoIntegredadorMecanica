package cinematica.movimentohorizontal;
import java.util.Scanner;
// MRUA - MOVIMIENTO RECTILINEO UNIFORMEMENTE ACELERADO
public class Aceleracion {
    public static void calcular(Scanner abi){

        // Solicitar datos al usuario
        System.out.print("Ingrese la velocidad inicial (m/s): ");
        double v0 = abi.nextDouble();
        System.out.print("Ingrese la velocidad final (m/s): ");
        double vf = abi.nextDouble();
        System.out.print("Ingrese el tiempo (s): ");
        double t = abi.nextDouble();
        System.out.print("Ingrese la posición inicial (m): ");
        double x0 = abi.nextDouble();
        System.out.print("Ingrese la posición final (m): ");
        double x = abi.nextDouble();

        // Calcular aceleración
        double a;
        if (v0 != 0 && t != 0) {
            a = (vf - v0) / t;
            System.out.println("La aceleración es: " + a + " m/s^2");
        } else if (v0 != 0 && x != x0) {
            a = (vf * vf - v0 * v0) / (2 * (x - x0));
            System.out.println("La aceleración es: " + a + " m/s^2");
        } else {
            System.out.println("Datos insuficientes para calcular la aceleración.");
        }


    }
}
