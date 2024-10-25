import java.util.Scanner;

public class Vectores {

    // Calculo Cuadrantes y Angulo
    static double calculoCuadrantesAngulo(double x, double y) {
        double angulo = Math.toDegrees(Math.atan2(y, x));
        if (angulo < 0) {
            angulo = angulo + 360;
        }

        // ATAN2 YA HACE EL AJUSTE DEL ANGULO
        if (x > 0 && y > 0) {
            System.out.println("Esta en el primer cuadrante");
        } else if (x < 0 && y > 0) {
            System.out.println("Esta en el segundo cuadrante");
        } else if (x < 0 && y < 0) {
            System.out.println("Esta en el tercer cuadrante");
        } else if (x > 0 && y < 0) {
            System.out.println("Esta en el cuarto cuadrante");
        }
        return angulo;
    }


    // Conversion de polar a rectangular
    static void polarRectangular(Scanner abi) {
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


    // Conversion de rectangular a polar
    static void rectangularPolar(Scanner abi) {
        System.out.println("**** COORDENADAS RECTANGULARES A POLARES ****");
        System.out.println("Ingrese los valores X,Y (x,y): ");
        double x = abi.nextDouble(); // X
        double y = abi.nextDouble(); // Y
        double magnitud = Math.sqrt(x * x + y * y);
        double angulo = calculoCuadrantesAngulo(x, y);
        System.out.println("Magnitud: " + magnitud);
        System.out.println("Angulo: " + angulo + "\n");

    }


    // Suma de vectores
    static void sumaVectores(Scanner abi) {
        int numVectores; // numero de vectores a sumar
        double sumComponenteX = 0, sumComponenteY = 0, angulo = 0;
        do {
            System.out.println("**** SUMA DE VECTORES ****");
            System.out.print("""
                    Ingrese el numero de vectores a sumar
                    (Maximo 5): """);
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
            cantidadVectores[i][0] = cantidadVectores[i][0] * Math.cos(angulosRadianes);
            cantidadVectores[i][1] = cantidadVectores[i][0] * Math.sin(angulosRadianes);

            // Sumar Componentes
            sumComponenteX += cantidadVectores[i][0];
            sumComponenteY += cantidadVectores[i][1];
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
            angulo = calculoCuadrantesAngulo(sumComponenteX, sumComponenteY);
        }
        System.out.println("Magnitud: " + magnitud);
        System.out.println("Angulo: " + angulo + "\n");
    }


    // Submenu coordenadas
    static void submenuConversionCoordenadas(Scanner abi){
        int opcion = 0;
        do {
            System.out.println("**** VECTORES ****");
            System.out.println("1. De Coordenadas polares a rectangulares");
            System.out.println("2. De Coordendas rectangulares a polares");
            System.out.println("0. Regresar al menu principal");
            System.out.print("Elige una opcion: ");
            opcion = abi.nextInt();
            switch (opcion) {
                case 1:
                    polarRectangular(abi);
                    break;
                case 2:
                    rectangularPolar(abi);
                    break;
            }
        } while (opcion != 0);
    }

}