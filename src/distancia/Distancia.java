package distancia;

import java.util.Scanner;

public class Distancia {

    // Distancia entre 2 puntos
    public static void calculoDistancia(Scanner abi) {
        double[][] punto = new double[2][2];

        System.out.println("**** CALCULO DE DISTANCIA (2 puntos) ****");
        System.out.println("INGRESE EL VALOR DEL PRIMER PUNTO (x,y): ");
        punto[0][0] = abi.nextDouble();
        punto[0][1] = abi.nextDouble();
        System.out.println("INGRESE EL VALOR DEL SEGUNDO PUNTO (x,y): ");
        punto[1][0] = abi.nextDouble();
        punto[1][1] = abi.nextDouble();

        double distancia = Math.sqrt(Math.pow(punto[0][0] - punto[1][0], 2) + Math.pow(punto[0][1] - punto[1][1], 2));
        System.out.println("La distancia entre los puntos es: " + distancia);
    }
}
