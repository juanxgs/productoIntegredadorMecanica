package vectores.cuadrantes;

public class CuadrantesYAngulos {
    public static double calcular(double x, double y) {
        double angulo = Math.toDegrees(Math.atan2(y, x));
        if (angulo < 0) {
            angulo = angulo + 360;
        }

        // ATAN2 YA HACE EL AJUSTE DEL ANGULO
        if (x > 0 && y > 0) {
            System.out.println("Esta en el primer cuadrante");
        } else if (x < 0 && y > 0) {
            System.out.println("Esta en el segundo cuadrante");
        } else if (x < 0 && y < 0) {
            System.out.println("Esta en el tercer cuadrante");
        } else if (x > 0 && y < 0) {
            System.out.println("Esta en el cuarto cuadrante");
        }
        return angulo;
    }


}
