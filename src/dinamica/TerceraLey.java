package dinamica;

import java.util.Scanner;

public class TerceraLey {
    public static void mostrarMenu(){
        Scanner krla = new Scanner(System.in);
        // DATOS
        System.out.println("Equilibrio sin friccion");
        System.out.println("Ingrese el primer angulo (grados): ");
        double angulo1 =  krla.nextDouble();
        System.out.println("Ingrese el segundo angulo (grados): ");
        double angulo2 = krla.nextDouble();
        System.out.println("Ingrese el peso del cuerpo (W en N): ");
        double peso = krla.nextDouble();

        // ANGULOS A RADIANES
        double angulo1Rad = Math.toRadians(angulo1);
        double angulo2Rad = Math.toRadians(angulo2);

        // ECUACIONES
        double componenteX = Math.cos(angulo1Rad) / Math.cos(angulo2Rad);
        double componenteXY = Math.abs(Math.sin(angulo1Rad)*componenteX) + Math.sin(angulo2Rad);
        double resul1 = peso / componenteXY;
        double resul2 = componenteX * resul1;
        if (angulo2==0){
            resul1 = Math.cos(angulo1Rad)*resul2;
        }

        // RESULTADDOS
        System.out.println("Resultados: ");
        System.out.printf("Tension en la cuerda A: %.2f N\n", resul2);
        System.out.printf("Tension en la cuerda B: %.2f N\n", resul1);

    }
}
