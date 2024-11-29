package dinamica;
import java.util.Scanner;
public class Tension {

    public static void calculos () {

        Scanner patto = new Scanner(System.in);

        // Constantes de las fuerzas y ángulos
        System.out.print("Ingrese el peso (N): ");
        double fuerza = patto.nextDouble(); // Fuerza aplicada en N
        System.out.print("Ingrese el angulo A: ");
        double anguloA = patto.nextDouble();
        anguloA = Math.toRadians(anguloA); // Convierte grados a radianes
        System.out.print("Ingrese el angulo B: ");
        double anguloB = patto.nextDouble();
        anguloB = Math.toRadians(anguloB); // Convierte grados a radianes

        // Valores de senos y cosenos
        double cosA = Math.cos(anguloA);
        double sinA = Math.sin(anguloA);
        double cosB = Math.cos(anguloB);
        double sinB = Math.sin(anguloB);

        // Resolvemos el sistema de ecuaciones
        // Ecuación en X: T_A * cos(60) - T_B * cos(45) = 0
        // => T_A = (cos(45) / cos(60)) * T_B
        double relacionTA_TB = cosB / cosA; // Relación entre T_A y T_B

        // Ecuación en Y: T_A * sin(60) + T_B * sin(45) = 200
        // Sustituimos T_A en términos de T_B
        // (relacionTA_TB * T_B) * sin(60) + T_B * sin(45) = 200
        double coeficienteTA = relacionTA_TB * sinA;
        double coeficienteTB = sinB;

        // Factor total para T_B
        double sumaCoeficientes = coeficienteTA + coeficienteTB;

        // Calculamos T_B
        double tensionB = fuerza / sumaCoeficientes;

        // Calculamos T_A
        double tensionA = relacionTA_TB * tensionB;

        // Imprimimos los resultados
        System.out.printf("Tensión en la cuerda A: %.2f N%n", tensionA);
        System.out.printf("Tensión en la cuerda B: %.2f N%n", tensionB);
    }

}
