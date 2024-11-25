package cinematica.movimentovertical;
import java.util.Scanner;

public class TiempoVelocidadFinal {
    public static void calcular(Scanner abi){

        // Entradas
        System.out.print("Ingrese la velocidad inicial (v0) en m/s: ");
        double v0 = abi.nextDouble();

        System.out.print("Ingrese la velocidad final (vf) en m/s: ");
        double vf = abi.nextDouble();

        // Aceleración debida a la gravedad
        double g = 9.81;

        // Cálculo del tiempo
        double t = (vf - v0) / -g;

        // Resultados
        System.out.printf("El tiempo necesario para alcanzar la velocidad final es: %.2f segundos%n", t);

    }
}
