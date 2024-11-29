package dinamica;

import java.awt.image.DataBufferInt;
import java.util.Scanner;

public class Dinamica {

    public static void mostrarMenu(Scanner krl){
        int opcion;
        do{
            System.out.println("1. Fuerza neta");
            System.out.println("2. Planos Inclinados");
            System.out.println("3. Tension en cuerdas");
            System.out.println("4. Friccion");
            System.out.println("0. Regresar al menu principal");
            System.out.print("Elige una opcion: ");
            opcion= krl.nextInt();

            switch (opcion){
                case 1:
                    FuerzaNeta.calcularFuerza();
                break;
                case 2:
                    PlanosInclinados.calculo();
                break;
                case 3:
                    Tension.calculos();
                break;
                case 4:
                    Friccion.calculos();
                break;
            }
        } while (opcion != 0);
    }
}
