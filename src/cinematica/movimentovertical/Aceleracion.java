package cinematica.movimentovertical;
import java.util.Scanner;

public class Aceleracion {
    public static void calcular(Scanner abi){

        // Entradas
        System.out.print("Ingrese la velocidad inicial (v0) en m/s: ");
        double v0 = abi.nextDouble();

        System.out.print("Ingrese la velocidad final (vf) en m/s: ");
        double vf = abi.nextDouble();

        System.out.print("Ingrese el tiempo (t) en segundos: ");
        double t = abi.nextDouble();

        // Cálculo de la aceleración
        double a = (vf - v0) / t;

        // Resultados
        System.out.printf("La aceleración es: %.2f m/s²%n", a);

    }
}
