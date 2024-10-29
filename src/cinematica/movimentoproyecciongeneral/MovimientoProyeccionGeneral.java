package cinematica.movimentoproyecciongeneral;


import java.util.Scanner;

public class MovimientoProyeccionGeneral {

    public static void mostrarMenu(Scanner abi) {
        int opcion;
        do {
            System.out.println("**** MOVIMIENTO PROYECCION GENERAL ****");
            System.out.println("1. Tiempo de Vuelo, Alcance Horizontal, Altura Maxima");
            System.out.println("0. Regresar al menu principal");
            System.out.print("Elige una opcion: ");
            opcion = abi.nextInt();
            switch (opcion) {
                case 1:
                    ProyeccionGeneral.calcular(abi);
                    break;
            }
        } while (opcion != 0);
    }

}
