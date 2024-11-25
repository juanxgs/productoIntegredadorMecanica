import dinamica.Dinamica;
import distancia.Distancia;
import vectores.coordenadas.SubmenuCoordenadas;
import vectores.suma.SumarVectores;
import cinematica.Cinematica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion;
        Scanner abi = new Scanner(System.in);
        do {
            MenuPrincipal.mostrarMenu(abi);
            opcion = abi.nextInt();

            switch (opcion) {
                case 1:
                    Distancia.calculoDistancia(abi);
                    break;
                case 2:
                    SubmenuCoordenadas.mostrarMenu(abi);
                    break;
                case 3:
                    SumarVectores.sumar(abi);
                    break;
                case 4:
                    Cinematica.mostrarMenu(abi);
                    break;
                case 5:
                    Dinamica.mostrarMenu(abi);
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
            }
        } while (opcion != 6);
    }

}
