package dinamica;
import java.util.Scanner;

public class SegundaLey {
    public static void mostrarMenu() {
        Scanner krla = new Scanner(System.in);  // Crea el objeto Scanner
        int opcion;

        do {
            System.out.println("1. Calcular Fuerza");
            System.out.println("2. Calcular Aceleracion");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = krla.nextInt();

            // Llamamos al metodo menuOpcion pasando la opción y el objeto Scanner
            menuOpcion(opcion, krla);

        } while (opcion != 0);  // Repite hasta que el usuario elija salir (opción 0)
    }

    // Metodo para manejar la lógica según la opción seleccionada
    public static void menuOpcion(int opcion, Scanner krla) {
        switch (opcion) {
            case 1:
                calculoFuerza(krla);  // Llamamos a calcular la fuerza
                break;
            case 2:
                calculoAceleracion(krla);  // Llamamos a calcular la aceleración
                break;
            case 0:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida. Intente de nuevo.");
                break;
        }
    }

    // Método para calcular la fuerza: F = m * a
    public static void calculoFuerza(Scanner krla) {
        System.out.print("Ingresa la masa (kg): ");
        double masa = krla.nextDouble();
        System.out.print("Ingresa la aceleración (m/s²): ");
        double aceleracion = krla.nextDouble();
        double fuerza = masa * aceleracion;
        System.out.println("La fuerza es: " + fuerza + " N");
    }

    // Método para calcular la aceleración: a = F / m
    public static void calculoAceleracion(Scanner krla) {
        System.out.print("Ingresa la fuerza (N): ");
        double fuerza = krla.nextDouble();
        System.out.print("Ingresa la masa (kg): ");
        double masa = krla.nextDouble();
        if (masa != 0) {
            double aceleracion = fuerza / masa;
            System.out.println("La aceleración es: " + aceleracion + " m/s²");
        } else {
            System.out.println("La masa no puede ser cero.");
        }
    }
}
