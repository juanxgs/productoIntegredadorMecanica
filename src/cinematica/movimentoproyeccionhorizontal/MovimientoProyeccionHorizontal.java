package cinematica.movimentoproyeccionhorizontal;

import vectores.cuadrantes.AnguloCompleto;

import java.util.Scanner;

public class MovimientoProyeccionHorizontal {
    public static void mostarMenu(Scanner abi){
        int opcion;
        do {
            System.out.println("**** Movimiento Proyeccion Horizontal ****");
            // Entradas
            System.out.print("Ingrese la altura inicial (y0) en metros: ");
            double y0 = abi.nextDouble();

            System.out.print("Ingrese la velocidad inicial (v0) en m/s: ");
            double v0 = abi.nextDouble();

            // Gravedad
            double g = 9.81;

            // Cálculo del tiempo de vuelo
            double t = Math.sqrt(2 * y0 / g);

            // Cálculo del alcance horizontal
            double R = v0 * t;

            // Calculo
            double vx = Math.sqrt(2 * g * y0);
            double vr = Math.sqrt(v0 * v0 + vx * vx);
            double angulo = AnguloCompleto.calcularAngulo(v0, vx);

            // Resultados
            System.out.printf("La velocidad con que golpea el piso: %.2f m/s%n", vr);
            System.out.printf("Angulo de golpeo: %.2f grados%n", angulo);
            System.out.printf("El tiempo de vuelo es: %.2f segundos%n", t);
            System.out.printf("El alcance horizontal es: %.2f metros%n", R);

            // OPCIONES
            System.out.println("\n0. Regresar al menu principal");
            System.out.print("Elige una opcion: ");
            opcion = abi.nextInt();

            switch (opcion) {
                case 0:
                    System.out.println("Regresando al menu principal...");
                    break;
                default:
                    System.out.println("Volviendo a Proyeccion Horizontal");
            }
        } while (opcion != 0);
    }
}
