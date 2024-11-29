package dinamica;
import java.util.Scanner;

public class Friccion {

    // Método para calcular la fuerza mínima necesaria para mover el objeto
    private static void calcularFuerzaMinima(Scanner scanner) {
        System.out.print("Ingrese la masa del objeto (kg): ");
        double masa = scanner.nextDouble();

        System.out.print("Ingrese el coeficiente de friccion estatica: ");
        double coefFriccionEstatica = scanner.nextDouble();

        double fuerzaNormal = masa * 9.8; // Peso del objeto
        double fuerzaMinima = coefFriccionEstatica * fuerzaNormal;

        System.out.printf("La fuerza minima necesaria para mover el objeto es: %.2f N\n", fuerzaMinima);
    }

    // Método para calcular la aceleración del objeto con fricción cinética
    private static void calcularAceleracion(Scanner scanner) {
        System.out.print("Ingrese la masa del objeto (kg): ");
        double masa = scanner.nextDouble();

        System.out.print("Ingrese la fuerza aplicada (N): ");
        double fuerzaAplicada = scanner.nextDouble();

        System.out.print("Ingrese el coeficiente de friccion cinetica: ");
        double coefFriccionCinetica = scanner.nextDouble();

        double fuerzaNormal = masa * 9.8; // Peso del objeto
        double fuerzaFriccionCinetica = coefFriccionCinetica * fuerzaNormal;
        double fuerzaResultante = fuerzaAplicada - fuerzaFriccionCinetica;

        if (fuerzaResultante > 0) {
            double aceleracion = fuerzaResultante / masa;
            System.out.printf("La aceleracion del objeto es: %.2f m/s^2\n", aceleracion);
        } else {
            System.out.println("La fuerza aplicada no es suficiente para mover el objeto o mantenerlo en movimiento.");
        }
    }

    // Método para calcular el coeficiente de fricción estática y cinética
    private static void calcularFriccion(Scanner scanner) {
        System.out.print("Ingrese el peso del objeto en N (fuerza normal): ");
        double fuerzaNormal = scanner.nextDouble();

        System.out.print("Ingrese la fuerza aplicada para mover el objeto en N: ");
        double fuerzaParaMover = scanner.nextDouble();

        System.out.print("Ingrese la fuerza aplicada para mantener el objeto en movimiento en N: ");
        double fuerzaParaMantener = scanner.nextDouble();

        // Calcular coeficiente de fricción estática
        double coeficienteEstatica = calcularCoeficiente(fuerzaParaMover, fuerzaNormal);
        System.out.println("El coeficiente de friccion estatica es: " + coeficienteEstatica);

        // Calcular coeficiente de fricción cinética
        double coeficienteCinetica = calcularCoeficiente(fuerzaParaMantener, fuerzaNormal);
        System.out.println("El coeficiente de friccion cinetica es: " + coeficienteCinetica);
    }

    // Método para calcular el coeficiente de fricción
    public static double calcularCoeficiente(double fuerzaAplicada, double fuerzaNormal) {
        return fuerzaAplicada / fuerzaNormal;
    }

    // Método para mostrar el menú y manejar las opciones
    public static void mostrarMenu(Scanner scanner) {
        int opcion;

        do {
            System.out.println("\n*** MENÚ ***");
            System.out.println("1. Calcular la fuerza mínima para mover el objeto");
            System.out.println("2. Calcular la aceleración con fricción cinética");
            System.out.println("3. Calcular los coeficientes de fricción estática y cinética");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    calcularFuerzaMinima(scanner);
                    break;
                case 2:
                    calcularAceleracion(scanner);
                    break;
                case 3:
                    calcularFriccion(scanner);
                    break;
                case 4:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
            }
        } while (opcion != 4);
    }

    public static void calculos() {
        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Mostrar el menú al usuario
        mostrarMenu(scanner);

    }
}
