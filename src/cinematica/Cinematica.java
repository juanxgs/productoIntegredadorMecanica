package cinematica;

import cinematica.movimentohorizontal.MovimientoHorizontal;
import cinematica.movimentoproyecciongeneral.MovimientoProyeccionGeneral;
import cinematica.movimentoproyeccionhorizontal.MovimientoProyeccionHorizontal;
import cinematica.movimentovertical.MovimientoVertical;

import java.util.Scanner;

public class Cinematica {

    public static void mostrarMenu(Scanner abi) {
        int opcion;
        do {
            System.out.println("**** CINEMATICA ****");
            System.out.println("1. Movimiento Horizontal");
            System.out.println("2. Movimiento Vertical - Caida Libre");
            System.out.println("3. Movimiento Proyeccion Horizontal");
            System.out.println("4. Movimiento Proyectiles General");
            System.out.println("0. Regresar al menu principal");
            System.out.print("Elige una opcion: ");
            opcion = abi.nextInt();
            switch (opcion) {
                case 1:
                    MovimientoHorizontal.mostrarMenu(abi);
                    break;
                case 2:
                    MovimientoVertical.mostrarMenu(abi);
                    break;
                case 3:
                    MovimientoProyeccionHorizontal.mostarMenu(abi);
                    break;
                case 4:
                    MovimientoProyeccionGeneral.mostrarMenu(abi);
                    break;
            }
        } while (opcion != 0);
    }
}
