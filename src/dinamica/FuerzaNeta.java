package dinamica;
import vectores.cuadrantes.AnguloCompleto;

import java.util.Scanner;

public class FuerzaNeta {
    public static void calcularFuerza(){
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el número de fuerzas a considerar
        System.out.print("Ingrese el numero de fuerzas a considerar: ");
        int n = scanner.nextInt();

        // Inicializar las componentes de la fuerza neta
        double FnetoX = 0;
        double FnetoY = 0;

        // Ingresar las magnitudes y ángulos de cada fuerza
        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese la magnitud de la fuerza " + i + " (F" + i + " en N): ");
            double F = scanner.nextDouble();
            System.out.print("Ingrese el angulo de la fuerza " + i + " (en grados): ");
            double angulo = scanner.nextDouble();

            // Convertir el ángulo a radianes
            double anguloRad = Math.toRadians(angulo);

            // Calcular las componentes de la fuerza
            double Fx = F * Math.cos(anguloRad);
            double Fy = F * Math.sin(anguloRad);

            // Sumar las componentes a la fuerza neta
            FnetoX += Fx;
            FnetoY += Fy;
        }

        // Calcular la magnitud de la fuerza neta
        double Fneto = Math.sqrt(FnetoX * FnetoX + FnetoY * FnetoY);

        // Calcular el ángulo de la fuerza neta
        double anguloNeto = AnguloCompleto.calcularAngulo(FnetoX, FnetoY);

        // Mostrar el resultado
        System.out.println("La magnitud de la fuerza neta es: " + Fneto + " N");
        System.out.println("El angulo de la fuerza neta es: " + anguloNeto + " grados");
    }
}
