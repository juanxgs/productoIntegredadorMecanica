package dinamica;
import java.util.Scanner;

public class PlanosInclinados {

    public static void calculo(){

        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Definición de la constante para la gravedad
        double g = 9.81;   // Aceleración debido a la gravedad en m/s^2

        // Solicitar al usuario el peso y los coeficientes de fricción
        System.out.print("Introduce el peso del objeto (en Newtons): ");
        double P = scanner.nextDouble();  // Peso del objeto en Newtons
        System.out.print("Introduce el ángulo del plano inclinado (en grados): ");
        double theta = scanner.nextDouble();  // Ángulo del plano inclinado
        System.out.print("Introduce el coeficiente de fricción estática: ");
        double mu_s = scanner.nextDouble();  // Coeficiente de fricción estática
        System.out.print("Introduce el coeficiente de fricción cinética: ");
        double mu_k = scanner.nextDouble();  // Coeficiente de fricción cinética

        // Calcular la masa del objeto a partir de su peso (P = mg)
        double m = P / g;

        // Convertir el ángulo a radianes
        double theta_rad = Math.toRadians(theta);

        // Componentes del peso
        double P_perp = P * Math.cos(theta_rad);  // Componente perpendicular
        double P_parallel = P * Math.sin(theta_rad);  // Componente paralela

        // Fuerza normal
        double F_N = P_perp;

        // Fuerza de fricción estática máxima
        double f_est_max = mu_s * F_N;

        // Fuerza de fricción cinética
        double f_cin = mu_k * F_N;

        // Evaluamos si el objeto está en reposo o en movimiento
        if (P_parallel > f_est_max) {
            System.out.println("El objeto se mueve con fricción cinética.");
            // Aceleración del objeto (usando la segunda ley de Newton)
            double a = (P_parallel - f_cin) / m;
            System.out.printf("Aceleración (con fricción cinética): %.2f m/s^2\n", a);
        } else {
            System.out.println("El objeto está en reposo (fricción estática).");
            // Aceleración será cero, ya que el objeto no se mueve
            double a = 0;
            System.out.printf("Aceleración (con fricción estática): %.2f m/s^2\n", a);
        }

    }

}
