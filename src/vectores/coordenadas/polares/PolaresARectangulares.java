package vectores.coordenadas.polares;

import java.util.Scanner;

public class PolaresARectangulares {
    public static void calcular(Scanner abi) {
        System.out.println("**** COORDENADAS POLARES A RECTANGULARES ****");
        System.out.print("Ingrese la magnitud y angulo en grados (x,y): ");
        double magnitud = abi.nextDouble();
        double angulo = abi.nextDouble();
        angulo = Math.toRadians(angulo);

        // CALCULO
        double[][] coordenada = new double[2][1];
        coordenada[0][0] = magnitud * (Math.cos(angulo));
        coordenada[1][0] = magnitud * (Math.sin(angulo));

        System.out.println("Los resultados son X= " + coordenada[0][0] + " "
                + "Y= " + coordenada[1][0] + "\n");
    }
}
