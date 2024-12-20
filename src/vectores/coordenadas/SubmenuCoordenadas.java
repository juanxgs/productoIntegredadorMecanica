package vectores.coordenadas;

import vectores.coordenadas.polares.PolaresARectangulares;
import vectores.coordenadas.rectangulares.RectangularesAPolares;
import vectores.suma.SumarVectores;

import java.util.Scanner;

public class SubmenuCoordenadas {

    public static void mostrarMenu(Scanner abi){
        int opcion;
        do {
            System.out.println("**** VECTORES ****");
            System.out.println("1. De Coordenadas polares a rectangulares");
            System.out.println("2. De Coordendas rectangulares a polares");
            System.out.println("3. Suma de vectores");
            System.out.println("0. Regresar al menu principal");
            System.out.print("Elige una opcion: ");
            opcion = abi.nextInt();
            switch (opcion) {
                case 1:
                    PolaresARectangulares.calcular(abi);
                    break;
                case 2:
                    RectangularesAPolares.calcular(abi);
                    break;
                case 3:
                    SumarVectores.sumar(abi);
                    break;
            }
        } while (opcion != 0);
    }
}
