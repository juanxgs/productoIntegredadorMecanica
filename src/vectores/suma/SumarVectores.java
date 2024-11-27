package vectores.suma;

import vectores.cuadrantes.AnguloCompleto;
import java.util.Scanner;

public class SumarVectores {
    public static void sumar(Scanner abi) {
        int numVectores; // Vectores A Sumar
        double sumComponenteX = 0, sumComponenteY = 0, angulo = 0;
        do {
            System.out.println("**** SUMA DE VECTORES ****");
            System.out.print("Ingrese el numero de vectores a sumar (De 2 a 5): ");
            numVectores = abi.nextInt();              // Limitado a 5
        } while (numVectores < 2 || numVectores > 5); // Podrian ser mas.

        // Capturar vectores
        double[][] cantidadVectores = new double[numVectores][2];
        for (int i = 0; i < numVectores; i++) {
            System.out.print("\n Ingrese los valores del vector " + (i + 1)
                    + " [Magnitud, Angulo (grados)] formato (x, y): ");
            cantidadVectores[i][0] = abi.nextDouble(); // MAGNITUDES
            cantidadVectores[i][1] = abi.nextDouble(); // ANGULOS

            // Calculo de las componentes
            double angulosRadianes = Math.toRadians(cantidadVectores[i][1]);
            double componenteX = cantidadVectores[i][0] * Math.cos(angulosRadianes);
            double componenteY = cantidadVectores[i][0] * Math.sin(angulosRadianes);

            cantidadVectores[i][0] = componenteX;  // Guardar componente X
            cantidadVectores[i][1] = componenteY;  // Guardar componente Y

            sumComponenteX += componenteX;
            sumComponenteY += componenteY;

        }

        // Resultante
        if (Math.abs(sumComponenteX) < 1e-10) {
            sumComponenteX = 0;
        }
        if (Math.abs(sumComponenteY) < 1e-10) {
            sumComponenteY = 0;
        }
        double magnitud = Math.sqrt(sumComponenteX * sumComponenteX
                + sumComponenteY * sumComponenteY);
        if (magnitud > 1e-10) {
            angulo = AnguloCompleto.calcularAngulo(sumComponenteX, sumComponenteY);
            AnguloCompleto.calcularCuadrante(sumComponenteX, sumComponenteY);
        }

        // RESULTADOS
        System.out.println("Magnitud: " + magnitud);
        System.out.println("Angulo: " + angulo + "\n");
    }
}
