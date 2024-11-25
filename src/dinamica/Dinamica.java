package dinamica;

import java.util.Scanner;

public class Dinamica {

    public static void mostrarMenu(Scanner krl){
        int opcion;
        do{
            System.out.println("1. Segunda ley de newton");
            System.out.println("2. Tercera ley de newton");
            System.out.println("0. Regresar al menu principal");
            System.out.print("Elige una opcion: ");
            opcion= krl.nextInt();

            switch (opcion){
                case 1:
                    SegundaLey.mostrarMenu();
                break;
                case 2:
                    TerceraLey.mostrarMenu();
            }
        } while (opcion != 0);
    }
}
