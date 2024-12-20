package vectores.coordenadas.rectangulares;
import vectores.cuadrantes.AnguloCompleto;

import java.util.Scanner;

public class RectangularesAPolares {
    public static void calcular(Scanner abi) {
        System.out.println("**** COORDENADAS RECTANGULARES A POLARES ****");
        System.out.println("Ingrese los valores X,Y (x,y): ");
        double x = abi.nextDouble(); // X
        double y = abi.nextDouble(); // Y
        double magnitud = Math.sqrt(x * x + y * y);
        double angulo = AnguloCompleto.calcularAngulo(x, y);
        System.out.println("Magnitud: " + magnitud);
        System.out.println("Angulo: " + angulo + "\n");
        AnguloCompleto.calcularCuadrante(x, y);

    }
}
